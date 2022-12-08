package org.example.paixu;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5, 36, 35, 98, 65, 69, 74, 15, 3, 9,100,101};
//        int[ ] a={1,2,3,4};
        bubble(a);
    }

    public static void bubble(int[] a) {
        int n=a.length-1;
        while (true){
            int last=0;
            for (int i = 0; i < n; i++) {
                System.out.println("比较次数"+i);
                if (a[i]>a[i+1]){
                    swap(a,i,i+1);
                    last=i;
                }
            }
            n=last;
            System.out.println("第"+"轮冒泡"+Arrays.toString(a));
            if (n==0){
                break;
            }
        }
    }
//    public static void bubble(int[] a) {
//        for (int j = 0; j < a.length - 1; j++) {
//            boolean swapped=false;
//            for (int i = 0; i < a.length - 1-j; i++) {
//                System.out.println("比较次数"+i);
//                if (a[i] > a[i + 1]) {
//                    swap(a, i, i + 1);
//                    swapped=true;
//                }
//            }
//            System.out.println("第"+j+"轮冒泡"+Arrays.toString(a));
//            if (!swapped){
//                break;
//            }
//        }
//    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
