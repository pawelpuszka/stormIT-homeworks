package arrays.matrix;

public class Matrix {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        MatrixCalculator matrixCalc = new MatrixCalculator();

        double[][] array = input.giveDimension();
        matrixCalc.fillMatrix(array);
        matrixCalc.printMatrix(array);

        if (!CheckMatrix.isSymetric(array)) {
            System.out.println("Macierz nie jest symetryczna.");
            System.out.println("Program nie obliczy przekątnych macierzy.");
        }
        else {
            System.out.println("Suma iloczynów przekątnych macierzy: " + matrixCalc.diagonalSum(array));
        }
        System.out.println("Iloczyn zsumowanych elementów środkowego wiersza i środkowej kolumny: " + matrixCalc.crossMultiply(array));
        System.out.println("Suma wszystkich elementów znajdujących się przy krawędziach macierzy: " + matrixCalc.boundSum(array));

        input.closeReading();
    }
}
