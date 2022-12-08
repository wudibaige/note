package org.example.chazhao;

public class IntegerOverflow {
    public static void main(String[] args) {
        int l = 0;
        int r = Integer.MAX_VALUE - 1;
        int m = (l + r) / 2;
        System.out.println(m);
        l=m+1;
        m=l+(r-l)/2;
        System.out.println(m);
    }
}
