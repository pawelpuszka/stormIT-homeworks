package arrays;

public class Matrix {

    private void fillMatrix(double[][] array) {
        double num = 1;
        for (int i = 0, j = 0, k = 0; i < array[i].length;  i++, j++, k++) {
            array[0][i] = num;
            array[1][j] = array[0][i] + 0.5;
            array[2][k] = array[1][j] + 0.5;
            num += 0.5;
            if (j == 2 && k == 2) {
                break;
            }
        }
    }

    private void printMatrix(double[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    //suma iloczynów przekątnych tablicy
    private double diagonalSum(double[][] array) {
        double mult1 = 1;
        double mult2 = 1;
        for (int i = 0, j = 0; i < array.length && j < array[i].length; i++, j++) {
            mult1 *= array[i][j];
        }
        for (int i = 0, j = array[i].length - 1; i < array.length && j >= 0 ; i++, j--) {
            mult2 *= array[i][j];
        }
        return mult1 + mult2;
    }
    //iloczyn zsumowanych elementów środkowego wiersza i środkowej kolumny tablicy
    private double crossMultiply(double[][] array) {
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i][1];
            sum2 += array[1][i];
        }
        return sum1 * sum2;
    }
    //suma wszystkich elementów znajdujących się przy krawędzi tablicy
    private double boundSum(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][0] + array[i][array.length - 1];
            if (i == 0 || i == array.length - 1) {
                sum += array[i][array[i].length / 2];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        double[][] array = new double[3][3];
        Matrix matrix = new Matrix();

        matrix.fillMatrix(array);
        matrix.printMatrix(array);

        System.out.println("Suma iloczynów przekątnych tablicy: " + matrix.diagonalSum(array));
        System.out.println("Iloczyn zsumowanych elementów środkowego wiersza i środkowej kolumny: " + matrix.crossMultiply(array));
        System.out.println("Suma wszystkich elementów znajdujących się przy krawędzi tablicy: " + matrix.boundSum(array));
    }
}
