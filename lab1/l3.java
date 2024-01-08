package lab1;
import java.util.Scanner;
public class l3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("введите дату ");
        int age = in.nextInt() ;

        System.out.printf("введите меяц(число) ");
        int age1 = in.nextInt() ;

        System.out.printf("введите год ");
        int age2 = in.nextInt() ;

        System.out.printf("%d.%d.%d \n",age,age1,age2);

    }
}


