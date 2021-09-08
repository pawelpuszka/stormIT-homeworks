package arrays.matrix;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CheckMatrixTest {

    @Test
    void isInRange_DimensionIsMinValue() {
        int input = 3;

        boolean result = CheckMatrix.isInRange(input);

        assertTrue(result);
    }

    @Test
    void isInRange_DimensionIsMaxValue() {
        int input = 10;

        boolean result = CheckMatrix.isInRange(input);

        assertTrue(result);
    }

    @Test
    void isInRange_DimensionIsMidValue() {
        int input = 5;

        boolean result = CheckMatrix.isInRange(input);

        assertTrue(result);
    }

    @Test
    void isInRange_DimensionIsApartFromLowerBound() {
        int input = 2;

        boolean result = CheckMatrix.isInRange(input);

        assertFalse(result);
    }

    @Test
    void isInRange_DimensionIsApartFromUpperBound() {
        int input = 11;

        boolean result = CheckMatrix.isInRange(input);

        assertFalse(result);
    }

    @Test
    void isInRange_DimensionIsZero() {
        int input = 0;

        boolean result = CheckMatrix.isInRange(input);

        assertFalse(result);
    }

    @Test
    void isInRange_DimensionIsExtremelyBig() {
        int input = 1_000_000_000;

        boolean result = CheckMatrix.isInRange(input);

        assertFalse(result);
    }

    @Test
    void isInRange_DimensionIsNegative() {
        int input = -100;

        boolean result = CheckMatrix.isInRange(input);

        assertFalse(result);
    }
}

   /* @Test
    void isSymmetricTest() {
        boolean result1 = CheckMatrix.isSymmetric(new double[5][5]);
        boolean result2 = CheckMatrix.isSymmetric(new double[3][6]);
        boolean result3 = CheckMatrix.isSymmetric(new double[1][2]);

        assertTrue(result1);
        assertFalse(result2);
        assertFalse(result3);
    }

    @Test
    void isNull() {
    }*/
