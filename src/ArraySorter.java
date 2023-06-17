import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraySorter {

    public static void sortArray(int[] array, Comparator<Integer> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Длина: ");
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // сортировка по возрастанию
        sortArray(array, (a, b) -> a-b);
        System.out.println("Отсортированный массив по возрастанию: " + Arrays.toString(array));

        // сортировка по убыванию
        sortArray(array, (a, b) -> b-a);
        System.out.println("Отсортированный массив по убыванию: " + Arrays.toString(array));
    }

}
