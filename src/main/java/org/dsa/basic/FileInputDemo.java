package org.dsa.basic;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Solution {

    public void main() throws FileNotFoundException {

        Scanner scn = new Scanner(new File("input.txt"));
//        Scanner scn = new Scanner(System.in);

        int age = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();
        String city = scn.next();
        String state = scn.next();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("State: " + state);

    }
}

public class FileInputDemo {
    public static void main(String[] args) throws FileNotFoundException {
        new Solution().main();
    }
}
