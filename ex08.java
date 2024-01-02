// Assignment: 8
// Author: Ram Nagid, ID: 318692779
import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] sodoku = new int[9][9];
        int countr = 0;
        int countc = 0;
        int counts = 0;
        int sumr=0;
        int sumc=0;
        int squaresum=0;
        int countsum1=0;
        int countsum2=0;
        int countsum3=0;
        boolean raw = false;
        boolean column = false;
        boolean square = false;
        System.out.println("Enter sudoku table:");
        for (int i = 0; i < sodoku.length; i++) {
            for (int j = 0; j < sodoku.length; j++) {
                sodoku[i][j] = in.nextInt();
            }
        }
        for (int a = 0; a < sodoku.length; a++) {
            if (a % 3 == 0) {
                {
                    System.out.println("__________________________________");
                }
            }
            for (int b = 0; b < sodoku.length; b++) {
                if (b % 3 == 0) {
                    System.out.print("| ");
                }
                System.out.print(" " + sodoku[a][b] + " ");
                if (sodoku.length-b==1)
                {
                    System.out.print("| ");
                }
            }
            System.out.println();
        }
        System.out.println("__________________________________");
        for (int c = 0; c < sodoku.length; c++) {
            sumc=0;
            sumr=0;
            squaresum=0;
            for (int d = 0; d < sodoku.length; d++) {
                    sumr+=sodoku [d] [c];
                if ((sodoku[c][d] >= 1) && (sodoku[c][d] <= 9)) {
                    sumc+=sodoku[c][d];
                    if (c + 1 < 9) {
                        if (sodoku[c][d] != (sodoku[c + 1][d])) {
                            countr++;
                        }
                    }
                    if (countr == 72) {
                        raw = true;
                    }
                    if (d + 1 < 9) {
                        if (sodoku[c][d] != (sodoku[c][d + 1])) {
                            countc++;
                        }
                    }
                    if (countr == 72) {
                        column = true;
                    }
                    if ((c+1)%3==0&&(d+1)%3==0) {
                        for (int e = 0; e<= 2; e++) {
                            for (int f = 0; f <= 2; f++) {
                                if (c-e>=0&&d-f>=0) {
                                    squaresum += sodoku[c - e][d - f];
                                }
                                else if (c-e>0&&d-f>0) {
                                    squaresum += sodoku[c][d - f];
                                    squaresum += sodoku[c - e][d];
                                }
                                if (e-1>=0&&f-1>=0||c-e>=0&&d-f>=0) {
                                    if (sodoku[c][d]!=sodoku[c - 1][d - 1]&&sodoku[c][d]!=sodoku[c][d - 1]&&sodoku[c][d]!=sodoku[c - 1][d]) {
                                        counts++;
                                    }
                                }
                            }
                            if (squaresum==45)
                            {
                                countsum3++;
                                squaresum=0;
                            }
                                if (counts == 81) {
                                    square = true;
                                }
                            }
                        }
                    }
                }
            if (sumc==45)
            {
                countsum1++;
            }

            if (sumr==45)
            {
                countsum2++;
            }
            }
        if (square&&column&&raw&&countsum1==9&&countsum2==9&&countsum3==9)
        {
            System.out.println("The sudoku table is OK");
        }
        else
        {
            System.out.println("The sudoku table is WRONG");
        }
    }
}


