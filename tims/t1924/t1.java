package tims.t1924;

import java.util.Scanner;
public class t1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int r = Integer.parseInt(scanner.nextLine());
        long count = 0;
        for (double x = 0; x < r; x++) {
            count += (long) Math.ceil(Math.sqrt((double) r * r - x * x));
        }
        System.out.println(4 * count);
    }
}
