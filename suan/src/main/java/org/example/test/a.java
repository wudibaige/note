//package org.example.test;
//
//
//import java.util.Arrays;
//
//public class a {
//    public static void main(String[] args) {
//        int arr[] = {5, 6, 3, 9, 8, 56, 55, 1, 565, 41, 35};
//        bubble(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void bubble(int[] a) {
//        int n=a.length-1;
//        while (true){
//            int last=0;
//            for (int j = 0; j < n; j++) {
//                System.out.println("比较次数" + j);
//                if (a[j] > a[j + 1]) {
//                    swap(a, j + 1, j);
//                    last=j;
//                }
//            }
//            n=last;
//            System.out.println(Arrays.toString(a));
//            if (n==0){
//                break;
//            }
//        }
//    }
//
//    public static void swap(int[] a, int i, int j) {
//        int tem = a[i];
//        a[i] = a[j];
//        a[j] = tem;
//    }
//}

















package org.example.test;


import java.util.Arrays;

public class a {
    public static void main(String[] args) {
        int arr[] = {5, 6, 3, 9, 8, 56, 55, 1, 565, 41, 35};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] a) {
        int n=a.length-1;
        while (true){
        int last=0;
        for (int i=0;i<n;i++){
            if (a[i]>a[i+1]){
                swap(a,i,i+1);
                last=i;
            }}
            n=last;

        if (n==0){
            break;
        }}
    }
//    public static void bubble(int[] a) {
//        int n=a.length-1;
//        while (true){
//            int last=0;
//            for (int j = 0; j < n; j++) {
//                System.out.println("比较次数" + j);
//                if (a[j] > a[j + 1]) {
//                    swap(a, j + 1, j);
//                    last=j;
//                }
//            }
//            n=last;
//            System.out.println(Arrays.toString(a));
//            if (n==0){
//                break;
//            }
    public static void swap(int[] a, int i, int j) {
        int tem = a[i];
        a[i] = a[j];
        a[j] = tem;
    }
}

