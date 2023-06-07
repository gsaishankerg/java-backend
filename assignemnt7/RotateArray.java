package assignemnt7;
import java.util.Arrays;

public class RotateArray
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int pos = 2;

        rotate(arr, pos);

        System.out.println("Rotated array: " + Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int pos) {
        int n = arr.length;
        pos = pos % n; // Adjust x if it's greater than the array length

        reverse(arr, 0, pos - 1);
        reverse(arr, pos, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
