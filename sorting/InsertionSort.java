Basic Sorting Code 
Alejandro J. Vargas Pedroza
    //Insertion Sort organizes numbers by comparing values and placing them in the correct position.

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 3};

        System.out.println("Original Array:");
        printArray(data);

        insertionSort(data);

        System.out.println("Sorted Array:");
        printArray(data);
    }
}
