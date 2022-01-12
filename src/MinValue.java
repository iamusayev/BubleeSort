public class MinValue {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 2, 4, 5, 2, 1, 4, -2, -3, -4, 12, 343, 22, 15,-1000};
        int minValue = array[0];
        int minIndex = 0;


        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }


        }
        System.out.println("min value is " + minValue + "\nmin index is " + minIndex);
    }
}
