Bubble Sort 
Alejandro J. Vargas Pedroza
//Bubble Sort compares numbers next to each other and swaps them until the list is sorted.

  public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] data = {5, 1, 4, 2, 8};

        System.out.println("Original Array:");
        printArray(data);

        bubbleSort(data);

        System.out.println("Sorted Array:");
        printArray(data);
    }
}
