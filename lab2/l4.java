package lab2;
import java.util.Scanner;
public class l4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Ввод");
        a = in.nextInt();


        if (5 <= a && a <= 10) {
            System.out.println("+");

        }
        else{
            System.out.println("-");
        }
    }

}
