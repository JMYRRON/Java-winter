package lesson1;

import java.util.ArrayList;

public class Task2 {

    static int i = 100;

    public static void main(String[] args) {
        findAbsoluteNumbers(i);
    }

    public static void findAbsoluteNumbers(int i) {
        int absolutenumber = 0;
        for (int j = 1; j<i+1; j++) {
            absolutenumber = absolutenumber + j;
            if (absolutenumber>i){
                break;
            }
            printNumber(absolutenumber);
        }
    }

    public static void printNumber (int number) {
        System.out.print(number + ", ");
    }

    public static boolean toCompare(int first, int second) {
        if (first>second)
        {
            return true;
        }
        return false;
    }
}
