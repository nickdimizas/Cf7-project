package gr.aueb.cf.askiseis;

public class SelectionSortArray {

    public static void main(String[] args) {
        int[] arr = {7, 12, 56, 44, 93, 25, 8, 17, 19, 55, 69, 3, 6};
        int[] sorted = selectionSort(arr);

        for (int el : sorted) {
            System.out.print(el + " ");
        }
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {

            int minPosition = i;
            int minValue = arr[minPosition];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minPosition = j;
                    minValue = arr[j];
                }
            }
            swap(arr, minPosition, i);
        }
        return arr;
    }

    public static void swap(int[] arr, int a, int b) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
