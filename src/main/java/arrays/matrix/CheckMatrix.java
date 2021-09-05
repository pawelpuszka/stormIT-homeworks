package arrays.matrix;

public class CheckMatrix {
    static boolean isInRange(int dim) {
        return dim > 2 && dim <= 10;
    }

<<<<<<< HEAD
    static boolean isSymetric(double[][] array) {
        return array.length == array[0].length;
    }

    /* method not needed in this solution
     *static boolean isEmpty(double[][] array) {
     *    return true;
     *}
     */
=======
    static boolean isSymmetric(double[][] array) {
        if (CheckMatrix.isNull(array)) {
            throw new NullPointerException(Messages.ARRAY_IS_NULL_MSG.getMessage());
        }
        return array.length == array[0].length;
    }

    static boolean isNull(double [][] array) {
        int nullCounter = 0;
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    nullCounter++;
                }
                return nullCounter > 0;
            }
        }
        return array == null;
    }
>>>>>>> 6f7c617d3b40f845d54f95ae98482c9446d319ea
}
