package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    private Scanner scan = new Scanner(System.in);

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
                    System.out.println("Podaj liczbę całkowitą z zakresu 2 -10!");
                    continue;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Podaj liczbę całkowitą z zakresu 2 -10!");
            } finally {
                scan.nextLine();
            }
        } while (!correctInput);
        return dim;
    }

    double[][] giveDimension() {
        int dim1 = readInteger("Podaj liczbę kolumn (2 - 10)");
        int dim2 = readInteger("Podaj liczbę wierszy (2 - 10)");
        return new double[dim1][dim2];
    }
}
