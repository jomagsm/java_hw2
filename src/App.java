import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        final float[] floatNumbers = { -23.45f, 2.45f, -3.45f, -3.5f, 3.5f, -5.87f, -3.45f, 6.5f, 2.54f,
                3.3f, 5.05f, 2.54f, 4.65f, 2.4f, 3.5f, };
        final int[] listNumber = { 0, -2, 5, -4, 1, 2 };

        System.out.println(getAverageNumber(floatNumbers));
        sortList(listNumber);
    }

    public static float getAverageNumber(float[] array) {
        int counter = 0;
        float sum = 0;
        boolean flag = false;
        for (float number : array) {
            if (number < 0) {
                flag = true;
            } else if (number > 0 && flag) {
                sum += number;
                counter += 1;
            }
        }
        return sum / counter;
    }

    public static void sortList(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i];
                if(array[i]> array[j]){
                    array[i] = array[j];
                    array[j] = temp;
                    break;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

}
