package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int num = in.nextInt();
        int num1 = in.nextInt();
        int result,result1;
        result = num1-1;
        result1 = num-1;
        out.print(result+" "+result1);
        out.flush();
    }
}
