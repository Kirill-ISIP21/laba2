package laba2;

import java.util.Scanner;

public class SamRab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();

        if (num >= 5 && num <= 10)
        {
            System.out.println("Попадает в диапазон");
        }
        else
        {
            System.out.println("Не попадает в диапазон");
        }
    }
}
