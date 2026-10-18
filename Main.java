import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int wallet = 0;
        int sum = 0;
        String option = null;
        boolean Loop = true;

        System.out.println("=== Personal Finance Tracker ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("owner: ");
        String owner = scanner.nextLine();
       
        if (owner.equals("chirayu")) { 
             System.out.println("Owner: " + owner);
             do{
                  System.out.println("(A) Add income: ");
                  System.out.println("(B) Add Transaction: ");  
                  System.out.println("(C) Exit");
                  option = scanner.nextLine();


                  if (option.equalsIgnoreCase("A")) {
                    System.out.print("Add INCOME: ");  
                    int addIN = scanner.nextInt();
                    scanner.nextLine();
                    if(addIN > 0){
                        wallet = wallet + addIN;
                        System.out.println("Currunt balance: " + wallet);
                    } else {
                        System.out.println("Add positive number or Greater than zero : ");
                    }
                     
                  } else if (option.equalsIgnoreCase("B")) {
                     System.out.print("Add TRANSACTION: ");  
                     int addTS = scanner.nextInt();
                     scanner.nextLine();
                    if(addTS > 0){
                        wallet = wallet - addTS;
                        System.out.println("Currunt balance: " + wallet);
                    } else {
                        System.out.println("Add positive number or Greater than zero : ");
                    }

                  } else if (option.equalsIgnoreCase("C")) {
                     Loop = false;
                  }

                

             }while(Loop);

        
        }else{
            System.out.println(Loop);
            
        }
        System.out.println("==============================");
        
    }
}