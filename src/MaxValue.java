public class MaxValue {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 3, 2, 25, 32, 5324, 5, 4325, 432, 5432};

        int maxValue = array[0];
        int maxValueIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
                maxValueIndex = i;
            }
        }

        System.out.println("Max value is " + maxValue + "\nMax index is " + maxValueIndex);
    }
}
