package arrays.matrix;

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

            }
        } while (!correctInput);
        return dim;
    }

    double[][] giveDimension() {
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

}
