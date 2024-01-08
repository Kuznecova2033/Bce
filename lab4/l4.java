package lab4;
import java.util.Scanner;
public class l4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("введите ширину : ");
        int a = id.nextInt();
        System.out.print("введите высоту : ");
        int b = id.nextInt();
        int[][] c = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                c[i][j] = 2;
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(c[i][j] + " ");
            }
            a--;
            System.out.println(" ");

        }
    }
}

