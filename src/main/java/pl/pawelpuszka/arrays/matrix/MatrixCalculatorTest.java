package pl.pawelpuszka.arrays.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixCalculatorTest {

    MatrixCalculator calc = new MatrixCalculator();

    @Test
    void fillMatrix_shouldThrowNullPointerException() {
        double[][] array = null;

        try {
            calc.fillMatrix(array);
            fail("Nie udało się rzucić wyjątku!");
        }
        catch (NullPointerException ex) {
            assertEquals(Messages.ARRAY_IS_NULL_MSG.getMessage(), ex.getMessage());
        }
    }

    @Test
    void fillMatrix_ShouldFillArrayProperlyAsSymmetricWithNineNumbers() {
        double[][] expectedArray = new double[][]{{1.0, 1.5, 2.0}, {1.5, 2.0, 2.5}, {2.0, 2.5, 3.0}};
        double[][] actualArray = new double[3][3];

        calc.fillMatrix(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void fillMatrix_ShouldFillArrayProperlyAsAsymmetricWithFifteenNumbers() {
        double[][] expectedArray = new double[][]{{1.0, 1.5, 2.0, 2.5, 3.0}, {1.5, 2.0, 2.5, 3.0, 3.5}, {2.0, 2.5, 3.0, 3.5, 4.0}};
        double[][] actualArray = new double[3][5];

        calc.fillMatrix(actualArray);

        assertArrayEquals(expectedArray, actualArray);
    }
}