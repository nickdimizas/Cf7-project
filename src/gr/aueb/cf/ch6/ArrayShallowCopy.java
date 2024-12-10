package gr.aueb.cf.ch6;

/**
 * Copies the reference to array.
 * it is a shallow copy.there are side effects.
 */
public class ArrayShallowCopy {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arrRefCopy = arr;           //Shallow copy

        for (int el : arrRefCopy) {
            System.out.println(el + " ");
        }

        arrRefCopy[4] = 100;
        System.out.println();

        for (int el : arr) {
            System.out.println(el + " ");
        }
    }
}
