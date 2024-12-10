package gr.aueb.cf.askiseis;

public class ElementSearch {

    public static void main(String[] args) {
        int[] arr = {4, 5, 23, 77, 65, 32, 12, 16, 3};

    }

    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;
        for (int el : arr) {
            if (el == value) {
                positionToReturn = el;
                break;
            }
        }
        return positionToReturn;
    }

    public static void getEvens(int[] arr) {
        for (int el : arr) {
            if (el % 2 ==0) {
                System.out.print(el + " ");
            }
        }
    }

    public static int[] mappedArr(int[] arr) {
        int[] mapped = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static boolean anyPositive(int[] arr) {
        boolean isAnyPositive = false;
        for (int el : arr) {
            if (el > 0) {
                isAnyPositive = true;
                break;
            }
        }
        return isAnyPositive;
    }

//    public static boolean areAllPositives(int[] arr) {
//        boolean allArePositives = true;
//        for (int el : arr) {
//            if (el < 0) {
//                allArePositives = false;
//                break;
//            }
//        }
//        return allArePositives;
//    }
    public static boolean areAllPositives(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el > 0){
                count++;
            }
        }
        return count == arr.length;
    }
}
