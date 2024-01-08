package tims.t1293;

import java.io.PrintWriter;
import java.util.Scanner;

public class t1 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        int a = in.nextInt();

        int b = in.nextInt();
        int Res = (n*(a*b))*2;
        out.println("результат = " + Res);
        out.flush();
    }
}

