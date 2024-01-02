// Assignment: 1
// Author: Ram Nagid, ID: 318692779
import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter positive integer (enter 0 to finish):");
        long number = in.nextLong();
        long checker1=number;
        int len1=1;
        int count=0;
        int big=0;
        while (checker1/10!=0)
        {
            len1++;
            checker1/=10;
        }
        while (len1<16)
        {
            if (number==0)
            {
                break;
            }
            else{
                for (int i = 0; i < len1; i++) {
                    if (number%10==7)
                    {
                        count++;
                    }
                    number/=10;
                }
                if (big<count) {
                    big = count;
                }
                count=0;
            }
            System.out.println("Enter positive integer (enter 0 to finish):");
            number = in.nextInt();
            checker1=number;
            len1=1;
            while (checker1/10!=0)
            {
                len1++;
                checker1/=10;
            }
            if (big<count) {
                big = count;
            }
            count=0;
        }
        System.out.println("The maximum number of times 7 appeared is: "+big);
    }
}