package lab1;
import java.util.Scanner;
public class l6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("введите имя ");
        String name = in.nextLine();

        System.out.printf("введите год рождения ");
        int age = in.nextInt();
        age= 2023-age;

        System.out.printf("%s - %d лет \n", name, age);
    }
}


