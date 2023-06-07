package assignemnt7;

public class LargerandSmaller
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = findLargestSmallest(array);

        int smallest = result[0];
        int largest = result[1];

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

    public static int[] findLargestSmallest(int[] numbers) {
        if (numbers.length == 0) {
            return null;
        }

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] < smallest)
            {
                smallest = numbers[i];
            }
            if (numbers[i] > largest)
            {
                largest = numbers[i];
            }
        }

        int[] result = {smallest, largest};
        return result;
    }
}