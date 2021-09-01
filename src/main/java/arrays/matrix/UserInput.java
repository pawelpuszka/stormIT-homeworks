package arrays.matrix;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    private static final String ROWS_NUMBER_MSG = "Podaj liczbę wierszy (3 - 10)";
    private static final String COLUMNS_NUMBER_MSG = "Podaj liczbę kolumn (3 - 10)";
    private static final String GIVE_ME_INTEGER_MSG = "Podaj liczbę całkowitą z zakresu 3 -10!";

    private final Scanner scan = new Scanner(System.in);

    private int readInteger(String msg) throws IOException {
        int dim = 0;
        boolean correctInput = false;
        do {
            String userInput = null;
            try {
                System.out.print(msg + ": ");
                userInput = scan.nextLine().trim();
                dim = Integer.parseInt(userInput);
                correctInput = true;
                if (!CheckMatrix.isInRange(dim)){
                    correctInput = true;
                    System.out.println(GIVE_ME_INTEGER_MSG);
                }
            } catch (NumberFormatException | IllegalStateException ex) {
                System.out.println(GIVE_ME_INTEGER_MSG);
            }
        } while (!correctInput);
        return dim;
    }

    double[][] giveDimension() {
        int dim1 = 0;
        int dim2 = 0;
        try (scan) {
            dim1 = readInteger(ROWS_NUMBER_MSG);
            dim2 = readInteger(COLUMNS_NUMBER_MSG);
        }
        catch (IOException ex) {
            System.out.println("Wystąpił nieznany błąd. Aplikacja zakończy działanie.");
            System.exit(-1);
        }
        return new double[dim1][dim2];
    }

}
