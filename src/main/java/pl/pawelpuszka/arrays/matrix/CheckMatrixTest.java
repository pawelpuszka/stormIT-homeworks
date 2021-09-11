package pl.pawelpuszka.arrays.matrix;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CheckMatrixTest {

    @Test
    void isInRange_ShouldReturnTrueAsDimensionIsMinValue() {
        int input = 3;

        boolean result = CheckMatrix.isInRange(input);

        assertTrue(result);
    }

    @Test
    void isInRange_ShouldReturnTrueAsDimensionIsMaxValue() {
        int input = 10;

        boolean result = CheckMatrix.isInRange(input);

        assertTrue(result);
    }

    @Test
    void isInRange_ShouldReturnTrueAsDimensionIsMidValue() {
        int input = 5;

        boolean result = CheckMatrix.isInRange(input);

        assertTrue(result);
    }

    @Test
    void isInRange_ShouldReturnFalseAsDimensionIsApartFromLowerBound() {
        int input = 2;

        boolean result = CheckMatrix.isInRange(input);

        assertFalse(result);
    }

    @Test
    void isInRange_ShouldReturnFalseAsDimensionIsApartFromUpperBound() {
        int input = 11;

        boolean result = CheckMatrix.isInRange(input);

        assertFalse(result);
    }

    @Test
    void isInRange_ShouldReturnFalseAsDimensionEqualsZero() {
        int input = 0;

        boolean result = CheckMatrix.isInRange(input);

        assertFalse(result);
    }

    @Test
    void isInRange_ShouldReturnFalseAsDimensionIsExtremelyBig() {
        int input = 1_000_000_000;

        boolean result = CheckMatrix.isInRange(input);

        assertFalse(result);
    }

    @Test
    void isInRange_ShouldReturnFalseAsDimensionIsNegative() {
        int input = -100;

        boolean result = CheckMatrix.isInRange(input);

        assertFalse(result);
    }

    @Test
    void isSymmetric_ShouldReturnTrueAsDimensionsHaveTheSameValues() {
        double[][] array = new double[5][5];

        boolean result = CheckMatrix.isSymmetric(array);

        assertTrue(result);
    }

    @Test
    void isSymmetric_ShouldReturnFalseAsFirstDimensionIsBigger() {
        double[][] array = new double[3][6];

        boolean result = CheckMatrix.isSymmetric(array);

        assertFalse(result);
    }

    @Test
    void isSymmetric_ShouldReturnFalseAsSecondDimensionIsBigger() {
        double[][] array = new double[6][3];

        boolean result = CheckMatrix.isSymmetric(array);

        assertFalse(result);
    }

    @Test
    void isNull_ShouldReturnTrueAsReferenceIsPointingAtNull() {
        double[][] array = null;

        boolean result = CheckMatrix.isNull(array);

        assertTrue(result);
    }

    @Test
    void isNull_ShouldReturnTrueAsLastInternalReferenceIsPointingAtNull() {
        double[][] array = new double[][]{{5, 6, 7}, {8, 9, 10}, null };

        boolean result = CheckMatrix.isNull(array);

        assertTrue(result);
    }

    @Test
    void isNull_FShouldReturnTrueAsFirstInternalReferenceIsPointingAtNull() {
        double[][] array = new double[][]{null, {5, 6, 7}, {8, 9, 10}};

        boolean result = CheckMatrix.isNull(array);

        assertTrue(result);
    }

    @Test
    void isNull_ShouldReturnFalseAsReferenceIsNotPointingAtNull() {
        double[][] array = new double[][]{{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};

        boolean result = CheckMatrix.isNull(array);

        assertFalse(result);
    }

}

