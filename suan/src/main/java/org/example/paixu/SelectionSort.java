package org.example.paixu;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {5, 36, 35, 98, 65, 69, 74, 15, 3, 9,100,101};
        selection(a);
    }

    public static void selection(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            int s=i;
            for (int j=s+1;j< a.length;j++){
                if (a[s]>a[j]){
                    s=j;
                }
            }
            if (s!=i){
                swap(a,s,i);
            }
            System.out.println(Arrays.toString(a));
        }
    }
    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
