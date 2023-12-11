package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1000 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int num = in.nextInt();
        int num1 = in.nextInt();
        int result;
        result = num+num1;

        out.print(result);
        out.flush();
    }
}
