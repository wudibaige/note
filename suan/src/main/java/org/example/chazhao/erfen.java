package org.example.chazhao;

public class erfen {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int target = 14;
        int idx = binarySearch(array, target);
        System.out.println(idx);
    }

    public static int binarySearch(int[] a, int t) {
        int l = 0;
        int r = a.length - 1, m;
        while (l <= r) {
            m = (l + r) / 2;
            if (a[m] == t) {
                return m;
            } else if (a[m] > t) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
