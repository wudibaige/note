package org.example.paixu;

import java.util.Arrays;

public class QuickSort1 {
    public static void main(String[] args) {
        int[] a = {5, 36, 35, 98, 65, 69, 74, 15, 3, 9, 100, 101};
        quick(a, 0, a.length - 1);
    }

    public static void quick(int[] a, int l, int h) {
        if (l >= h) {
            return;
        }
        int partition = partition(a, l, h);
        quick(a, l, partition - 1);
        quick(a, partition + 1, h);

    }

    public static int partition(int[] a, int l, int h) {
        int pv = a[h];
        int i = l;
        for (int j = l; j < h; j++) {
            if (a[j] < pv) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, h, i);
        System.out.println(Arrays.toString(a));
        return i;
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
