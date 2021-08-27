package arrays;

public class MatrixCalculator {
    void fillMatrix(double[][] array) {
        double num = 0.5;
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                array[i][j] = num + 0.5;
                num += 0.5;
                if (i == array.length - 1) {
                    num = array[0][j];
                }
            }
        }
    }

    void printMatrix(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //suma iloczynów przekątnych tablicy
    double diagonalSum(double[][] array) {
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
    double crossMultiply(double[][] array) {
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < array[0].length; i++) {
            sum1 += array[array.length / 2][i];
        }
        for (int j = 0; j < array.length; j++) {
            sum2 += array[j][array[0].length / 2];
        }
        return sum1 * sum2;
    }

    //suma wszystkich elementów znajdujących się przy krawędzi tablicy
    double boundSum(double[][] array) {
        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][0] + array[i][array[0].length - 1];
        }
        for (int i = 1; i < array[0].length - 1; i++) {
            sum2 += array[0][i] + array[array.length - 1][i];
        }
        return sum + sum2;
    }
}
