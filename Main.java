import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Main {

  public static void main(String[] args) {
    File wallet2 = new File("wallet.txt");
    try {
      if (wallet2.createNewFile()) {
        System.out.println("File created: " + wallet2.getName());
      } else {
        System.out.println("File already exists.");
      }

    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    int wallet = 0;
    String option = null;
    boolean Loop = true;
    int currentBL = 0;

    System.out.println("=== Personal Finance Tracker ===");
    Scanner scanner = new Scanner(System.in);
    System.out.print("owner: ");
    String owner = scanner.nextLine();

    if (owner.equals("chirayu")) {
      System.out.println("Owner: " + owner);
      do {

        try {
          Scanner myReader = new Scanner(wallet2);

          if (myReader.hasNextInt()) {
            wallet = myReader.nextInt();
          }

          myReader.close();

        } catch (IOException e) {
          System.out.println("Could not read wallet file.");
        }
        System.out.println("(A) Add income: ");
        System.out.println("(B) Add Transaction: ");
        System.out.println("(C) Exit: ");
        System.out.println("(D) Show Balance: ");
        option = scanner.nextLine();

        // Option A
        if (option.equalsIgnoreCase("A")) {
          System.out.print("Add INCOME: ");
          int addIN = scanner.nextInt();
          scanner.nextLine();
          if (addIN > 0) {
            currentBL = wallet + addIN;

            try {
              FileWriter walletWrite = new FileWriter("wallet.txt");
              walletWrite.write(String.valueOf(currentBL));
              walletWrite.close();
              System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
              e.printStackTrace();
            }

          } else {
            System.out.println("Add positive number or Greater than zero : ");
          }

          // Option B
        } else if (option.equalsIgnoreCase("B")) {
          System.out.print("Add TRANSACTION: ");
          int addTS = scanner.nextInt();
          scanner.nextLine();
          if (addTS > 0) {
            currentBL = wallet - addTS;

            try {
              FileWriter walletWrite = new FileWriter("wallet.txt");
              walletWrite.write(String.valueOf(currentBL));
              walletWrite.close();
              System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
              e.printStackTrace();
            }

          } else {
            System.out.println("Add positive number or Greater than zero : ");
          }

        } else if (option.equalsIgnoreCase("C")) {
          Loop = false;

        } else if (option.equalsIgnoreCase("D")) {
          System.out.println("Currunt balance: " + wallet);
        }

      } while (Loop);

    } else {
      System.out.println(Loop);

    }
    System.out.println("==============================");

  }
}