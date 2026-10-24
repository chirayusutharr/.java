import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Your Email: ");
    String email = scanner.nextLine();

    if (email.contains("@")) {
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);
        // String Domain = domain.substring(1);

        System.out.println(username);
        System.out.println(domain);

    } else {
        System.out.println("Email must contain '@'");
    }

    scanner.close();

}
