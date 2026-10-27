import java.util.Random;
import java.util.Scanner;

public class guessingRandom {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomInt = random.nextInt(1, 100);
        int guess;

        System.out.println("Geuss Number between 1 t0 10");
        do {
            System.out.print("Enter your Geussing Number: ");
            guess = scanner.nextInt();
            if (guess > randomInt) {
                System.out.println("you Number is High!");
            } else if (guess < randomInt) {
                System.out.println("your Number is low!");
            }

        } while (guess != randomInt);

        System.out.println("you Got it!!");
        System.out.println(randomInt);

        scanner.close();
    }

}
