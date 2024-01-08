package lab1;
import java.util.Scanner;
public class l10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age2, age3;

        System.out.printf("введите число ");
        int age = in.nextInt();

        System.out.printf("введите число ");
        int age1 = in.nextInt();


        age2=age+age1;
        age3=age-age1;

        System.out.printf("сумма - %d\nразность - %d\n", age2,age3);
    }
}


