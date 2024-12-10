package gr.aueb.cf.askiseis;

public class ArraysMaxPosition {

    public static void main(String[] args) {
        int[] arr = {5, 23, 65, 3, 45, 12, 24, 77, 33, 7, 19, 21};
        int maxPosition;

        maxPosition = getMaxPosition(arr, 0, arr.length -1);
        if (maxPosition == -1) {
            System.out.println("No such element");
            System.exit(1);
        }
        System.out.printf("Max position: %d, value: %d\n", maxPosition, arr[maxPosition]);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosistion = 0;
        int maxValue;

        if ((arr == null) || (arr.length < 1)) return -1;
        if ((low < 0) || (high > arr.length-1) || (low > high)) return -1;

        maxValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxPosistion = i;
                maxValue = arr[i];
            }
        }
        return maxPosistion;
    }
}
