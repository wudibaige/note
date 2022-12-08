package org.example.paixu;

import java.util.Arrays;

public class InsetSort {
    public static void main(String[] args) {
        int[] a = {5, 36, 35, 98, 65, 69, 74, 15, 3, 9, 100, 101};
        inset(a);
    }

    public static void inset(int[] a) {
        for (int i = 1; i < a.length; i++) {
            //待插区域的元素值
            int t = a[i];
            //已插区域的元素值
            int j = i - 1;
            while (j >= 0) {
                if (t < a[j]) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
                j--;
            }
            a[j + 1] = t;
            System.out.println(Arrays.toString(a));
        }
    }

}
