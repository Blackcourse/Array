package test;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] myArray = new int[5];
        myArray [0] = 3;
        myArray [1] = 6;
        myArray [2] = 7;
        myArray [3] = 15;
        myArray [4] = 40;
        int tmp = myArray[0];
        myArray [0] = myArray [4];
        myArray [4] = tmp;
        System.out.println(myArray [0] + myArray[2]);

    }
}
