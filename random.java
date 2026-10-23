import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        boolean number;

        number = random.nextBoolean();

        System.out.println(number);

        System.out.println(Math.round(Math.PI));
        System.out.println(Math.ceil(Math.PI));
        System.out.println(Math.floor(Math.PI));

        // hypotnuse
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("A : ");
        a = scanner.nextDouble();

        System.out.print("B : ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("% .2f\n", c);

        scanner.close();
    }
}
