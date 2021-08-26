package arrays;

public class CheckMatrix {
    static boolean isInRange(int dim) {
        return dim > 1 && dim <= 10;
    }

    static boolean isEmpty(int dim) {
        return true;
    }

    static boolean isSymetric(double[][] array) {
        return array.length == array[0].length;
    }
}
