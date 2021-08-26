package arrays;

public class Matrix {



    public static void main(String[] args) {
        UserInput input = new UserInput();
        double[][] array = input.giveDimension();

        MatrixCalculator matrixCalc = new MatrixCalculator();
        matrixCalc.fillMatrix(array);
        matrixCalc.printMatrix(array);

        if (!CheckMatrix.isSymetric(array)) {
            System.out.println("Macież nie jest symetryczna.");
            System.out.println("Program nie obliczy przekatnych macieży.");
        }
        else {
            System.out.println("Suma iloczynów przekątnych tablicy: " + matrixCalc.diagonalSum(array));
        }
        System.out.println("Iloczyn zsumowanych elementów środkowego wiersza i środkowej kolumny: " + matrixCalc.crossMultiply(array));
        System.out.println("Suma wszystkich elementów znajdujących się przy krawędzi tablicy: " + matrixCalc.boundSum(array));
    }
}
