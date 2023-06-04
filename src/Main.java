import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задача 1");
        var arrays = task1();
        System.out.println("No output required");

        System.out.println("\nЗадача 2");
        task2(arrays);

        System.out.println("\nЗадача 3");
        task3(arrays);

        System.out.println("\nЗадача 4");
        task4(Arrays.stream(arrays.getIntArray()).mapToInt(i -> i).toArray());
    }

    public static Data task1()
    {
        Integer[] integerArray = new Integer[]{1,2,3};
        Double[] doubleArray = {1.57, 7.654, 9.986};
        Character[] charArray = {'a','b','c','d','e','f'};
        return new Data(integerArray, doubleArray, charArray);
    }

    public static void task2(Data data)
    {
        printArray(data.getIntArray());
        printArray(data.getDoubleArray());
        printArray(data.getCharArray());
    }

    public static void task3(Data data)
    {
        printArrayReverse(data.getIntArray());
        printArrayReverse(data.getDoubleArray());
        printArrayReverse(data.getCharArray());
    }

    public static void task4(int[] array)
    {
        for (int i = 0; i< array.length; i++)
        {
            if (array[i] % 2 != 0)
            {
                array[i]++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static <T> void printArray(T[] array)
    {
        if(array == null || array.length == 0) System.out.println("array is null or empty");
        else
        {
            System.out.print(array[0]);
            for (int i = 1; i < array.length; i++)
            {
                System.out.printf(", %s", array[i]);
            }
            System.out.println();
        }
    }public static <T> void printArrayReverse(T[] array)
    {
        if(array == null || array.length == 0) System.out.println("array is null or empty");
        else
        {
            System.out.print(array[array.length - 1]);
            for (int i = array.length - 2; i >= 0; i--)
            {
                System.out.printf(", %s", array[i]);
            }
            System.out.println();
        }
    }

}