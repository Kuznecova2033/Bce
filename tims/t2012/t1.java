package tims.t2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        PrintWriter out = new PrintWriter(System.out);

        int numberOfTasks = in.nextInt();
        int difference = 12 - numberOfTasks;
        int time = difference * 45;
        if (time<=240){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        out.flush();
    }
}
