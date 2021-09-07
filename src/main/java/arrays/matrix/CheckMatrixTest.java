package arrays.matrix;

import static org.junit.jupiter.api.Assertions.*;

import arrays.matrix.CheckMatrix;
import org.junit.jupiter.api.*;

class CheckMatrixTest {

    @Test
    void isInRangeTest() {
        boolean result1 = CheckMatrix.isInRange(3);
        boolean result2 = CheckMatrix.isInRange(10);
        boolean result3 = CheckMatrix.isInRange(5);
        boolean result4 = CheckMatrix.isInRange(0);
        boolean result5 = CheckMatrix.isInRange(11);
        boolean result6 = CheckMatrix.isInRange(1000000000);
        boolean result7 = CheckMatrix.isInRange(-100);

        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);
        assertFalse(result4);
        assertFalse(result5);
        assertFalse(result6);
        assertFalse(result7);
    }

    @Test
    void isSymmetricTest() {
        boolean result1 = CheckMatrix.isSymmetric(new double[5][5]);
        boolean result2 = CheckMatrix.isSymmetric(new double[3][6]);
        boolean result3 = CheckMatrix.isSymmetric(new double[1][2]);
        boolean isInRangeResult = CheckMatrix.isInRange()

        assertTrue(result1);
        assertFalse(result2);
        assertFalse(result3);
    }

    @Test
    void isNull() {
    }
}