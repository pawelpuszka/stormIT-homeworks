package arrays.matrix;

public class CheckMatrix {
    static boolean isInRange(int dim) {
        return dim > 2 && dim <= 10;
    }

    static boolean isSymetric(double[][] array) {
        return array.length == array[0].length;
    }

    /* method not needed in this solution
     *static boolean isEmpty(double[][] array) {
     *    return true;
     *}
     */
}
