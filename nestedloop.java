public class nestedloop {
    public static void main(String[] args) {
        for (int i = 0; i <= 11; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 11; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int n = 10;
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("$");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

}
