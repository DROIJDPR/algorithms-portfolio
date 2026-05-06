/*

- Search 1: Linear Search vs Binary Search
- David Y Ríos Rivera
- 
- Compara los dos algoritmos buscando varios targets en un array
- pequeño, contando cuántos pasos toma cada uno.
  */

public class SearchComparison {

```
static int linearSteps = 0;
static int binarySteps = 0;

public static int linearSearch(int[] arr, int target) {
    linearSteps = 0;
    for (int i = 0; i < arr.length; i++) {
        linearSteps++;
        if (arr[i] == target) return i;
    }
    return -1;
}

public static int binarySearch(int[] arr, int target) {
    binarySteps = 0;
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        binarySteps++;
        int mid = (low + high) / 2;
        if (arr[mid] == target)      return mid;
        else if (arr[mid] < target)  low = mid + 1;
        else                         high = mid - 1;
    }
    return -1;
}

static void printResult(String method, int index, int steps) {
    String location = (index == -1) ? "not found" : "index " + index;
    System.out.println(method + " -> " + location);
    System.out.println("  Steps: " + steps);
}

public static void main(String[] args) {
    int[] data = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
    int[] targets = {8, 23, 91, 100};

    for (int target : targets) {
        System.out.println("Searching for " + target + ":");
        printResult("Linear Search", linearSearch(data, target), linearSteps);
        printResult("Binary Search", binarySearch(data, target), binarySteps);
        System.out.println();
    }
}
```

}
