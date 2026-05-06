/*

- Search 2: Linear Search vs Binary Search (escalado)
- David Y Ríos Rivera
- 
- OUTPUT:
- Array size: 50
- Linear Search steps: 50
- Binary Search steps: 7
- 
- Array size: 1000
- Linear Search steps: 1000
- Binary Search steps: 11
- 
- Array size: 10000
- Linear Search steps: 10000
- Binary Search steps: 15
- 
- REFLECTION:
- Binary Search requires fewer steps as the array grows because it eliminates
- half of the remaining elements with every single comparison. Instead of
- checking each element one by one like Linear Search does, Binary Search
- always looks at the middle of the remaining range and decides which half
- the target cannot be in, then discards it entirely. This is why its
- complexity is O(log n), every time the array doubles in size, Binary
- Search only needs one extra step. Linear Search has no such advantage;
- it checks every element in order, so if the target is at the end, it
- takes exactly n steps no matter what. With 10,000 elements, that gap
- becomes very clear: Linear Search took 10,000 steps while Binary Search
- only needed 15.
  */

public class SearchScaling {

```
// Linear Search: counts each element check as one step
public static int linearSearch(int[] arr, int target) {
    int steps = 0;
    for (int i = 0; i < arr.length; i++) {
        steps++;
        if (arr[i] == target) {
            System.out.println("Linear Search steps: " + steps);
            return i;
        }
    }
    System.out.println("Linear Search steps: " + steps);
    return -1;
}

// Binary Search: counts each halving as one step
public static int binarySearch(int[] arr, int target) {
    int steps = 0;
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
        steps++;
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            System.out.println("Binary Search steps: " + steps);
            return mid;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    System.out.println("Binary Search steps: " + steps);
    return -1;
}

// Builds a sorted array from 1 to n
public static int[] buildArray(int n) {
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = i + 1;
    }
    return arr;
}

public static void main(String[] args) {
    int[] small  = buildArray(50);
    int[] medium = buildArray(1000);
    int[] large  = buildArray(10000);

    System.out.println("Array size: 50");
    linearSearch(small, 50);
    binarySearch(small, 50);

    System.out.println();

    System.out.println("Array size: 1000");
    linearSearch(medium, 1000);
    binarySearch(medium, 1000);

    System.out.println();

    System.out.println("Array size: 10000");
    linearSearch(large, 10000);
    binarySearch(large, 10000);
}
```

}
