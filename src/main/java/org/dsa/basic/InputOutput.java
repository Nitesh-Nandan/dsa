package org.dsa.basic;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String wholeLine = scn.nextLine();
        String word = scn.next();
        int n = scn.nextInt();

        System.out.println(wholeLine);
        System.out.println(word);
        System.out.println(n);

    }
}
