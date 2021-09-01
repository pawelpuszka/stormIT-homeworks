package arrays.matrix;

public class CheckMatrix {
    static boolean isInRange(int dim) {
        return dim > 2 && dim <= 10;
    }

    static boolean isSymmetric(double[][] array) {
        if (CheckMatrix.isNull(array)) {
            throw new NullPointerException(UserInput.ARRAY_IS_NULL_MSG);
        }
        return array.length == array[0].length;
    }

    static boolean isNull(double [][] array) {
        int nullCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                nullCounter++;
            }
        }
        return array == null || nullCounter > 0;
    }
}
