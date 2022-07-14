import java.util.Scanner;
import java.util.Random;



public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int first_index = random.nextInt(5) + 1;
        int second_index = random.nextInt(5) + 1;

        System.out.println("---------- All set. Get ready to rumble! ---------- \n");


        String[][] dimens_array = new String[6][6];
        for (int i = 0; i < dimens_array.length; i++) {
            for (int j = 0; j < dimens_array.length; j++) {
                dimens_array[0][j] = String.valueOf(j);
                dimens_array[i][0] = String.valueOf(i);
                if (i != 0 && j != 0) {
                    dimens_array[i][j] = "-";

                }
                System.out.print(dimens_array[i][j] + "|");


            }
            System.out.println();


        }
        while (true) {
            System.out.println("\nEnter first index: ");
            int in_first_index = scan.nextInt();
            if (in_first_index > dimens_array.length || in_first_index == 0) {
                System.out.println("Your index must be between 1-5");
                continue;

            }
            System.out.println("Enter second index: ");
            int in_second_index = scan.nextInt();
            if (in_second_index > dimens_array.length || in_second_index == 0) {
                System.out.println("Your index must be between 1-5 ");
                continue;
            }
            if (in_first_index == first_index && in_second_index == second_index) {
                dimens_array[first_index][second_index] = "X";
                for (int i = 0; i < dimens_array.length; i++) {
                    for (int j = 0; j < dimens_array.length; j++) {
                        System.out.print(dimens_array[i][j] + " | ");
                    }
                    System.out.println();
                }
                System.out.println("--- YOU WON ---");
                break;

            } else {
                dimens_array[in_first_index][in_second_index] = "*";
                for (int i = 0; i < dimens_array.length; i++) {
                    for (int j = 0; j < dimens_array.length; j++) {
                        System.out.print(dimens_array[i][j] + " | ");
                    }
                    System.out.println();
                }
                System.out.println("\n!!! Try Again !!!");
            }


        }
    }
}






