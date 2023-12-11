package laba2;

import java.util.Scanner;

public class SamRab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();

        System.out.println("В числе "+num);
        num = num % 10000 / 1000;
        System.out.print(num+ " тычяч");
    }
}
