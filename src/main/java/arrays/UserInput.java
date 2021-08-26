package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    private Scanner scan = new Scanner(System.in);
    private static final String ROWS_NUMBER_MSG = "Podaj liczbę wierszy (2 - 10)";
    private static final String COLUMNS_NUMBER_MSG = "Podaj liczbę kolumn (2 - 10)";
    private static final String GIVE_ME_INTEGER_MSG = "Podaj liczbę całkowitą z zakresu 2 -10!";

    private int readInteger(String msg) {
        int dim = 0;
        boolean correctInput = false;
        boolean inputInRange = false;
        do {
            try {
                System.out.print(msg + ": ");
                dim = scan.nextInt();
                if (CheckMatrix.isInRange(dim)){
                    correctInput = true;
                }
                else {
                    System.out.println(GIVE_ME_INTEGER_MSG);
                    continue;
                }
            } catch (InputMismatchException ex) {
                System.out.println(GIVE_ME_INTEGER_MSG);
            } finally {
                scan.nextLine();
            }
        } while (!correctInput);
        return dim;
    }

    double[][] giveDimension() {
        int dim1 = readInteger(COLUMNS_NUMBER_MSG);
        int dim2 = readInteger(ROWS_NUMBER_MSG);
        return new double[dim1][dim2];
    }
}
