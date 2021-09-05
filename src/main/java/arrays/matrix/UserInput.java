package arrays.matrix;

<<<<<<< HEAD
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    private static final String ROWS_NUMBER_MSG = "Podaj liczbę wierszy (3 - 10)";
    private static final String COLUMNS_NUMBER_MSG = "Podaj liczbę kolumn (3 - 10)";
    private static final String GIVE_ME_INTEGER_MSG = "Podaj liczbę całkowitą z zakresu 3 -10!";

    private Scanner scan = new Scanner(System.in);

    private int readInteger(String msg) {
        int dim = 0;
        boolean correctInput = false;
        do {
            try {
                System.out.print(msg + ": ");
                dim = scan.nextInt();
                if (CheckMatrix.isInRange(dim)){
                    correctInput = true;
                }
                else {
                    System.out.println(GIVE_ME_INTEGER_MSG);
                }
            } catch (InputMismatchException ex) {
                System.out.println(GIVE_ME_INTEGER_MSG);
            } finally {
                scan.nextLine();
=======
import java.io.IOException;
import java.util.Scanner;

public class UserInput {


    private final Scanner scan = new Scanner(System.in);

    private int readInteger(String msg) throws IOException {
        int dim = 0;
        boolean correctInput = false;
        do {
            String userInput;
            try {
                System.out.print(msg + ": ");
                userInput = scan.nextLine().trim();
                dim = Integer.parseInt(userInput);
                correctInput = true;
                if (!CheckMatrix.isInRange(dim)){
                    correctInput = false;
                    System.out.println(Messages.GIVE_ME_INTEGER_MSG.getMessage());
                }
            } catch (NumberFormatException | IllegalStateException ex) {
                System.out.println(Messages.GIVE_ME_INTEGER_MSG.getMessage());
>>>>>>> 6f7c617d3b40f845d54f95ae98482c9446d319ea
            }
        } while (!correctInput);
        return dim;
    }

    double[][] giveDimension() {
<<<<<<< HEAD
        int dim1 = readInteger(ROWS_NUMBER_MSG);
        int dim2 = readInteger(COLUMNS_NUMBER_MSG);
        return new double[dim1][dim2];
    }

    void closeReading() {
        scan.close();
    }
=======
        int dim1 = 0;
        int dim2 = 0;
        try (scan) {
            dim1 = readInteger(Messages.ROWS_NUMBER_MSG.getMessage());
            dim2 = readInteger(Messages.COLUMNS_NUMBER_MSG.getMessage());
        }
        catch (IOException ex) {
            System.out.println(Messages.UNKNOWN_ERROR_MSG.getMessage());
            System.exit(-1);
        }
        return new double[dim1][dim2];
    }
>>>>>>> 6f7c617d3b40f845d54f95ae98482c9446d319ea
}
