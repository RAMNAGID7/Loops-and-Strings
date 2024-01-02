// Assignment: 6a
// Author: Ram Nagid, ID: 318692779
import java.util.Scanner;

public class ex06a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int checkrishoni=in.nextInt();
        int count=0;
        for (int i = 2; i < checkrishoni; i++) {
            if (checkrishoni % i == 0) {
                count++;
            }
        }
        if (count!=0)
        {
            System.out.println("false") ;
        }
        else
        {
            System.out.println ("true");
        }
    }
}