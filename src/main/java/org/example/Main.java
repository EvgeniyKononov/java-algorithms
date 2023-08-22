package org.example;

import org.example.simple.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        System.out.println(BinarySearch.intBinarySearch(array, 3));
        System.out.println(BinarySearch.intBinarySearch(array, -1));
    }
}