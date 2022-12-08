package org.example.paixu;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class QuickSort2 {
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
        int pv=a[l];
        int i =l;
        int j=h;
        while (i<j){
            while (i<j&&a[j]>pv){
                j--;
            }
            while (i<j&&a[i]<=pv){
                i++;
            }
            swap(a, j, i);
        }
        swap(a,i,l);
        System.out.println(Arrays.toString(a)+"pv   "+pv);
        return i;
    }
    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
