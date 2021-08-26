package arrays;

public class CheckMatrix {
    static boolean isInRange(int dim) {
        return dim > 1 && dim <= 10;
    }

    static boolean isEmpty(int dim) {
        return true;
    }

    static boolean isSymetric(int dim1, int dim2) {
        return dim1 == dim2;
    }
}
