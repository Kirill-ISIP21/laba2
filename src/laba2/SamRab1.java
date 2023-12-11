package laba2;

import java.util.Scanner;

public class SamRab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();

        if (num == 3*(num/3))
        {
            System.out.println("Ввведеное число делится на 3 без остатка");
        }
        else
        {
            System.out.println("Ввведеное число делится на 3 с остатком");
        }
    }

}
