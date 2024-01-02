// Assignment: 5
// Author: Ram Nagid, ID: 318692779
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter low integer: ");
        int low = in.nextInt();
        System.out.print("Enter high integer: ");
        int high = in.nextInt();
        int count=0;
        int bigcount=0;
        int even=0;
        if (high>low) {
            int[] dividers = new int[low+high];
            for (int i = low; i <= high; i++) {
                for (int j = 0; j < high; j++) {
                    if (i %( j+1) == 0) {
                        dividers[i] = count++;
                    }
                }
                if (count > 0) {
                    if (count > bigcount) {
                        bigcount = count;
                    }
                    count = 0;
                }
            }
            System.out.println("Maximal number of divisors is: "+bigcount);
            for (int p = low; p <= high; p++) {
                for (int pp = 0; pp <high; pp++) {
                    if (dividers[p]+1==bigcount) {
                        System.out.println(p + " has " + bigcount + " divisors");
                        break;
                    }

                }
            }

            }
            else
            {
            int[] dividers = new int[low+high];
            for (int i = high; i <= low; i++) {
                for (int j = 0; j < low; j++) {
                    if (i %( j+1) == 0) {
                        dividers[i] = count++;
                    }
                }
                if (count > 0) {
                    System.out.println(i + " has" + count + " dividers");
                    if (count > bigcount) {
                        bigcount = count;
                    }
                    count = 0;
                }
            }
            System.out.println("Maximal number of divisors is: "+bigcount);
            for (int p = high; p <= low; p++) {
                for (int pp = 0; pp <low; pp++) {
                    if (dividers[p]+1==bigcount) {
                        System.out.println(p + " has " + bigcount + " divisors");
                        break;
                    }
                }
            }

        }
    }

}