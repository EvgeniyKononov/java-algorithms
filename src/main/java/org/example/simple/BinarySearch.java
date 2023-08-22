package org.example.simple;

public class BinarySearch {
    public static int intBinarySearch(int[] array, int item) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            if (array[(low + high) / 2] == item) {
                return (low + high) / 2;
            } else if (array[high / 2] < item) {
                low = low / 2 + 1;
            } else {
                high = high / 2 - 1;
            }
        }
        return -1;
    }
}
