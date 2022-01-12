public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 32, 13, 123, 21, 3, 213, 1, 234, 3124, 132, 4, -2, -1, -5, -4, -1};
        for (int step = 0; step < array.length; step++) {
            int index = minIndex(array, step);
            int temp = array[step];
            array[step] = array[index];
            array[index] = temp;
        }
        for (int a : array) System.out.println(a);
    }


    public static int minIndex(int[] array, int step) {
        int minValue = array[step];
        int minIndex = step;
        for (int i = step + 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;


    }

    public static void printArr(int[] arr) {
        for (int ar : arr) System.out.println(ar);
    }


}
