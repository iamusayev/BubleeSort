public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {1, 2, 123, 21, 321, 3, 43, -3, -1, -43, 12, 321, 3};

        boolean isFinish = false;

        while (!isFinish) {
            isFinish = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isFinish = false;
                }
            }
        }
        for (int arr : array) System.out.println(arr);
    }
}