// Assignment: 2b
// Author: Ram Nagid, ID: 318692779
import java.util.Scanner;
public class ex2b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter positive integer (or enter 0 to finish):");
        int number = in.nextInt();
        int checker1 = number;
        int len1 = 1;
        int count = 0;
        int zoogi = 0;
        int zero = 0;
        while (checker1 / 10 != 0) {
            len1++;
            checker1 /= 10;
        }
        while (len1 < 10) {
            if (number<0)
            {
                System.out.println("Enter positive integer (or enter 0 to finish):");
                number = in.nextInt();
                checker1 = number;
                len1 = 1;
                while (checker1 / 10 != 0) {
                    len1++;
                    checker1 /= 10;
                }
                continue;
            }
            if (number == 0) {
                break;
            } else {
                for (int i = 0; i < len1; i++) {
                    if (number % 10 == 7) {
                        count++;
                    }
                    if (number % 2 == 0) {
                        zoogi++;
                    }
                    if (number % 10 == 0) {
                        zero++;
                        zoogi--;
                    }
                    number /= 10;
                }
                if (zoogi > 0 || count > 0 || zero > 0) {
                    System.out.println("Even digits: " + zoogi);
                    System.out.println("7 digits: " + count);
                    System.out.println("0 digits: " + zero);
                }
                zoogi=0;
                count=0;
                zero=0;
            }
            System.out.println("Enter positive integer (enter 0 to finish):");
            number = in.nextInt();
            checker1 = number;
            len1 = 1;
            while (checker1 / 10 != 0) {
                len1++;
                checker1 /= 10;
            }
        }
    }
}