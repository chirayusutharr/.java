
import java.util.Scanner;

// public class weightConversion {
// public static void main(String[] args) {
// String[] options = { "Convert lbs into kgs", "Convert kgs into lbs", "Exit"
// };
// int selectedIndex = 0;
// Scanner scanner = new Scanner(System.in);
// double weight;

// try {
// // Set the terminal to raw mode to capture individual keypresses instantly
// String[] cmd = { "/bin/sh", "-c", "stty raw </dev/tty" };
// Runtime.getRuntime().exec(cmd).waitFor();

// while (true) {
// // Clear the screen and reset cursor (ANSI escape codes)
// System.out.print("\033[H\033[2J");
// System.out.flush();

// System.out.println("Use Up/Down Arrow keys. Press ENTER to select.\r");
// System.out.println("-----------------------------------------\r");

// // Render options with an arrow indicator
// for (int i = 0; i < options.length; i++) {
// if (i == selectedIndex) {
// System.out.println(options[i] + " < \r");
// } else {
// System.out.println(options[i] + " \r");
// }
// }

// // Read input bytes
// int code1 = System.in.read();

// // Check for Enter key (13 is carriage return in raw mode)
// if (code1 == 13) {
// System.out.print("\033[H\033[2J"); // Clear screen
// System.out.flush();
// System.out.println("You selected: " + options[selectedIndex] + "\r");

// if (selectedIndex == 0) {
// System.out.print(options[0] + "\n");
// System.out.println("LBS : ");
// weight = scanner.nextDouble();

// } else if (selectedIndex == 1) {
// System.out.println(options[1]);
// }
// break;
// }

// // Escape sequence check for arrow keys (Starts with 27, then 91)
// if (code1 == 27) {
// int code2 = System.in.read();
// if (code2 == 91) {
// int code3 = System.in.read();

// if (code3 == 65) { // Up Arrow
// selectedIndex--;
// if (selectedIndex < 0)
// selectedIndex = options.length - 1;
// } else if (code3 == 66) { // Down Arrow
// selectedIndex++;
// if (selectedIndex >= options.length)
// selectedIndex = 0;
// }
// }
// }
// }
// } catch (Exception e) {
// System.out.println("Error running terminal UI: " + e.getMessage());
// } finally {
// try {
// // Restore standard cooked terminal settings before exiting
// String[] cmd = { "/bin/sh", "-c", "stty cooked </dev/tty" };
// Runtime.getRuntime().exec(cmd).waitFor();
// } catch (Exception e) {
// // Suppress restore errors
// }
// }
// scanner.close();

// }

// }

public void main() {
    int choice;
    double weight;
    double resultWeight;
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("-------Weight Convertion-----");
        System.out.println("1 . Conver lbs to kgs: ");
        System.out.println("2 . Conver kgs to lbs: ");
        System.out.print("Option : ");
        choice = scanner.nextInt();
        if (choice == 2) {
            System.out.print("Conver kgs to lbs: ");
            weight = scanner.nextDouble();
            // resultWeight = weight * 0.453592;
            resultWeight = weight * 2.20462;
            System.out.println(resultWeight + " lbs");
            break;

        } else if (choice == 1) {
            System.out.print("Conver lbs to kgs: ");
            weight = scanner.nextDouble();
            resultWeight = weight * 0.453592;
            // resultWeight = weight * 2.20462;
            System.out.println(resultWeight + " kgs");
            break;
        } else {
            System.out.println("Choice between 1 Or 2!!");
            continue;
        }

    }
    scanner.close();
}