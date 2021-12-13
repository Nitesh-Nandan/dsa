package org.dsa.basic;

public class ArrayDemo {

    private static void fun(int arr[]) {
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;

        fun(arr);

        for(int a : arr) {
            System.out.println(a);
        }
        int num = (int) 1e6;
        System.out.println(num);
    }
}
