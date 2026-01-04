package edu.touro.mcon264.sorting;

import java.util.Comparator;

public class InsertionSort implements Sorter {

    @Override
    public <T> void sort(T[] a, Comparator<? super T> comp) {

        for (int i = 1; i < a.length; i++) {
            T key = a[i];
            int j = i - 1;

            while (j >= 0 && comp.compare(a[j], key) > 0) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }
    }
}