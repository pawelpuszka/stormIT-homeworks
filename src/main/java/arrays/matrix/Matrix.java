package arrays.matrix;

public class Matrix {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        MatrixCalculator matrixCalc = new MatrixCalculator();

        try {
            double[][] array = input.giveDimension();
            matrixCalc.fillMatrix(array);
            matrixCalc.printMatrix(array);

            if (!CheckMatrix.isSymmetric(array)) {
                System.out.println("Macierz nie jest symetryczna.");
                System.out.println("Program nie obliczy przekątnych macierzy.");
            }
            else {
                System.out.println("Suma iloczynów przekątnych macierzy: " + matrixCalc.diagonalSum(array));
            }
            System.out.println("Iloczyn zsumowanych elementów środkowego wiersza i środkowej kolumny: " + matrixCalc.crossMultiply(array));
            System.out.println("Suma wszystkich elementów znajdujących się przy krawędziach macierzy: " + matrixCalc.boundSum(array));
        }
        catch (NullPointerException ex) {
            ex.getMessage();
            System.err.println(UserInput.UNKNOWN_ERROR_MSG);
            System.exit(-1);
        }



    }
}
