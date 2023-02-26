package by.teachmeskills.kaymovich.homework13;

import java.util.Arrays;

public class IntList {
    private int[] array;

    public IntList() {
        array = new int[0];
    }

    public IntList(int[] array) {

        this.array = Arrays.copyOf(array, array.length);
    }

    public String toString() {
        return Arrays.toString(array);
    }

    public int get(int index) {
        if (index >= array.length || index < 0) {
            throw new IllegalArgumentException();
        }
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public int set(int index, int element) {
        if (index >= array.length || index < 0) {
            throw new IllegalArgumentException();
        }
        int previous = array[index];
        array[index] = element;
        return previous;
    }

    public void add(int element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
    }

    public int remove(int index) {
        if (index >= array.length || index < 0) {
            throw new IllegalArgumentException();
        }
        int removed = array[index];

        int[] smaller = new int[array.length - 1];
        System.arraycopy(array, 0, smaller, 0, index);
        System.arraycopy(array, index + 1, smaller, index, smaller.length - index);
        array = smaller;

        return removed;
    }

    public IntList subList(int startIndexInclusive, int endIndexExclusive) {
        if (startIndexInclusive < 0 || endIndexExclusive > array.length || startIndexInclusive > endIndexExclusive) {
            throw new IllegalArgumentException();
        }
        int[] subarray = Arrays.copyOfRange(array, startIndexInclusive, endIndexExclusive);
        return new IntList(subarray);
    }

    public IntList subList(int startIndexInclusive) {
        return subList(startIndexInclusive, array.length);
    }

    public int lastIndexOf(int element) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (element == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public void sort() {

        int swap;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }
}

