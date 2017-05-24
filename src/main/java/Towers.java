import java.util.Scanner;

public class Towers {
    public static void main(String[] args) {
        stairCase();
    }

    public static void stairCase() {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        for (int i = 1; i <= height; i++) {

            for (int j = 0; j <= height; j++) {

                if (height - i - 1 < j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }

                if (j <= i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
