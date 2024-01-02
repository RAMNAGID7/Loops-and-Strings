// Assignment: 4
// Author: Ram Nagid, ID: 318692779
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 integers (0 is not allowed):");
        int[] numbers = new int[10];
        int zoogi=0;
        int lozoogi=0;
        int count=0;
        for (int i = 0; i < numbers.length; i++) {
        numbers [i]=in.nextInt();
        }
        for (int j = 0; j <numbers.length/2; j++) {
           zoogi=numbers [2*j];
           lozoogi=numbers [(2*j)+1];
            if (zoogi%lozoogi==0) {
                numbers[2 * j] = lozoogi;
                numbers[2 * j + 1] = zoogi;
            }
        }
        System.out.print("Result array ");
        for (int p = 0; p < numbers.length; p++) {
            if (count!=0)
            {
                System.out.print (",");
            }
            count++;
            System.out.print(numbers [p]);
        }

    }
}
