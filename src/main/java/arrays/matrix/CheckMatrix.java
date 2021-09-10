package arrays.matrix;

import javax.swing.plaf.metal.MetalButtonUI;

public class CheckMatrix {
    static boolean isInRange(int dim) {
        return dim > 2 && dim <= 10;
    }

    static boolean isSymmetric(double[][] array) {
        if (CheckMatrix.isNull(array)) {
            throw new NullPointerException(Messages.ARRAY_IS_NULL_MSG.getMessage());
        }
        return array.length == array[0].length;
    }

    static boolean isNull(double [][] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    return true;
                }
            }
        }
        return array == null;
    }
}
