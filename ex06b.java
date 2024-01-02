// Assignment: 6b
// Author: Ram Nagid, ID: 318692779
import java.util.Scanner;

public class ex06b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 16 integers: ");
        int[][] numbers = new int[4][4];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = in.nextInt();
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    for (int p = 2; p < numbers[i][j]; p++) {
                        double check1 = (double) numbers[i][j];
                        double check2 = (double) p;
                        if (check1 % check2 == 0) {
                            count++;

                        }
                    }
                }

            }
        }
        for (int r = 0; r < numbers.length; r++) {
            for (int a = 0; a < numbers[r].length; a++) {
                System.out.print(numbers[r][a]);
            }
            System.out.println();
        }
        if (count == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}




