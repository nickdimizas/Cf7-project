package gr.aueb.cf.ch6;

/**
 * dilosi kai arxikopoiisi enos pinaka.
 * populate ena pinaka
 * -new
 * -unsized init
 * -arry init
 */
public class ArrayInit {

    public static void main(String[] args) {
        int[] arr = new int[3];             //declare and initialization
        int[] arr2 = { 1, 2, 3, 4, 5 };     //unsized init
        int[] arr3;
        arr3 = new int[] {1, 2, 3, 4, 5};   //array initializer

        // populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        //traverse(diasxizw kai ektuponw)
        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //enhanced for
        for (int el : arr3) {
            System.out.println(el + " ");
        }

    }
}
