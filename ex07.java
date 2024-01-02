// Assignment: 7
// Author: Ram Nagid, ID: 318692779
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char[][] table = {{'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}};
        int count = 0;
        int countx = 0;
        int counto = 0;
        int countr = 0;
        boolean condition = false;
        while (count == 0) {
            System.out.print("The table result:");
            System.out.println();
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table.length; j++) {
                    System.out.print(table[i][j]);
                }
                System.out.println();
            }
            System.out.print("Enter row and column for player x:");
            int shoora = in.nextInt();
            int amooda = in.nextInt();
            switch (shoora) {
                case 0:
                    shoora = -1;
                    break;
                case 1:
                    shoora = 0;
                    break;
                case 2:
                    shoora = 1;
                    break;
                case 3:
                    shoora = 2;
                    break;
            }
            switch (amooda) {
                case 0:
                    amooda = -1;
                    break;
                case 1:
                    amooda = 0;
                    break;
                case 2:
                    amooda = 1;
                    break;
                case 3:
                    amooda = 2;
                    break;
            }
            if ((shoora <= 2 && shoora >= 0 && amooda <= 2 && amooda >= 0) && (table[shoora][amooda] == '-')) {
                table[shoora][amooda] = 'x';
                if (table[0][0] == 'x' && table[1][1] == 'x' && table[2][2] == 'x') {
                    countx++;
                    count++;
                }
                if (table[0][0] == 'x' && table[0][1] == 'x' && table[0][2] == 'x') {
                    countx++;
                    count++;
                }
                if (table[0][0] == 'x' && table[1][0] == 'x' && table[2][0] == 'x') {
                    countx++;
                    count++;
                }
                if (table[0][1] == 'x' && table[1][1] == 'x' && table[2][1] == 'x') {
                    countx++;
                    count++;
                }
                if (table[1][0] == 'x' && table[1][1] == 'x' && table[1][2] == 'x') {
                    countx++;
                    count++;
                }
                if (table[0][2] == 'x' && table[1][2] == 'x' && table[2][2] == 'x') {
                    countx++;
                    count++;
                }
                if (table[0][2] == 'x' && table[1][1] == 'x' && table[2][0] == 'x') {
                    countx++;
                    count++;
                }

                if (table[2][0] == 'x' && table[2][1] == 'x' && table[2][2] == 'x') {
                    countx++;
                    count++;
                }
            } else {
                if (count == 0) {
                    System.out.println();
                    System.out.println("Error,please restart the game.");
                    break;
                }
            }
            for (int a = 0; a < table.length; a++) {
                for (int b = 0; b < table.length; b++) {
                    System.out.print(table[a][b]);
                }
                System.out.println();
            }
            int sof = 0;
            for (int g = 0; g < table.length; g++) {
                for (int f = 0; f < table.length; f++) {
                    if (table[g][f] != '-') {
                        sof++;
                        if (sof >= 8) {
                            condition = true;
                            count = 1;
                        }
                    }

                }

            }
            if (count == 0 && condition == false) {
                System.out.println("Enter row and column for player o:");
                shoora = in.nextInt();
                amooda = in.nextInt();
                switch (shoora) {
                    case 0:
                        shoora = -1;
                        break;
                    case 1:
                        shoora = 0;
                        break;
                    case 2:
                        shoora = 1;
                        break;
                    case 3:
                        shoora = 2;
                        break;
                }
                switch (amooda) {
                    case 0:
                        amooda = -1;
                        break;
                    case 1:
                        amooda = 0;
                        break;
                    case 2:
                        amooda = 1;
                        break;
                    case 3:
                        amooda = 2;
                        break;
                }
                if ((shoora <= 2 && shoora >= 0 && amooda <= 2 && amooda >= 0) && (table[shoora][amooda] == '-')) {
                    table[shoora][amooda] = 'o';
                    if (table[0][0] == 'o' && table[1][1] == 'o' && table[2][2] == 'o') {
                        counto++;
                        count++;
                    }
                    if (table[0][0] == 'o' && table[0][1] == 'o' && table[0][2] == 'o') {
                        counto++;
                        count++;
                    }
                    if (table[0][0] == 'o' && table[1][0] == 'o' && table[2][0] == 'o') {
                        counto++;
                        count++;
                    }
                    if (table[0][1] == 'o' && table[1][1] == 'o' && table[2][1] == 'o') {
                        counto++;
                        count++;
                    }
                    if (table[1][0] == 'o' && table[1][1] == 'o' && table[1][2] == 'o') {
                        counto++;
                        count++;
                    }
                    if (table[0][2] == 'o' && table[1][2] == 'o' && table[2][2] == 'o') {
                        counto++;
                        count++;
                    }
                    if (table[0][2] == 'o' && table[1][1] == 'o' && table[2][0] == 'o') {
                        counto++;
                        count++;
                    }

                    if (table[2][0] == 'o' && table[2][1] == 'o' && table[2][2] == 'o') {
                        counto++;
                        count++;
                    }
                } else {
                    if (count == 0) {
                        System.out.println();
                        System.out.println("Error,please restart the game.");
                        break;
                    }
                }
            }

            if (countx > counto) {
                System.out.println();
                System.out.println("The winner is x !!!!!!");
            }
            if (countx < counto) {
                for (int c = 0; c < table.length; c++) {
                    for (int d = 0; d < table.length; d++) {
                        System.out.print(table[c][d]);

                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("The winner is o !!!!!!");
            }
            if (countx == 0 && counto == 0 && condition == true) {
                System.out.println();
                System.out.println("It's a tie...let's play again!");
            }
        }
    }
}