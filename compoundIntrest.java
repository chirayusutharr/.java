import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    double principle;
    double rate;
    int year;
    int timecompound;
    double amount;

    System.out.print("Enter the principle Amount: ");
    principle = scanner.nextDouble();

    System.out.print("Enter the intrest Rate (%): ");
    rate = scanner.nextDouble() / 100;

    System.out.print("Enter the # of times compound per year ");
    timecompound = scanner.nextInt();

    System.out.print("Enter the years: ");
    year = scanner.nextInt();

    amount = principle * Math.pow(1 + rate / timecompound, timecompound * year);

    System.out.printf("the amount After" + year + "is: %.3f\n", amount);

    scanner.close();

}
