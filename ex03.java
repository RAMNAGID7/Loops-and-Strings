// Assignment: 3
// Author: Ram Nagid, ID: 318692779
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter positive integer (or enter 0 to finish):");
        int number = in.nextInt();
        int big = 0;
        int now = 0;
        int less = number;
        int zero = 0;
        if (number<0)
        {
            System.out.println("No positive numbers were entered!");
        }
        while (0 <= number) {
            if (number == 0) {
                break;
            } else {
                if (number > 0) {
                    zero++;
                }

                if (number < less) {
                    less = number;
                }
                if (number>big)
                {
                    big=number;
                }
                System.out.println("Enter positive integer (enter 0 to finish):");
                number = in.nextInt();
                if (number<0)
                {
                    System.out.println("No positive number were entered!");
                }
            }
            }
        if (zero > 0) {
            System.out.println("Positive numbers entered:" + zero);
            System.out.println("Minimal number:" + less);
            System.out.println("Maximal number:" + big);
        }
    }
}
