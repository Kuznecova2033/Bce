package lab4;
import java.util.Random;
import java.util.Scanner;
public class l5 {
    public static void main(String[] args) {
        Random random = new Random(  200);
        Scanner id = new Scanner(System.in);
        System.out.print("введите количество столбцов массива: ");
        int a = id.nextInt();
        System.out.print("введите количество строк массива: ");
        int b = id.nextInt();
        int[][] c = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0; i < b; j++) {
                c[i][j] = random.nextInt(100);
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

                int[][] d = new int[b][a];
                for (int i = 0 ; i <b; i++) {
                    for (int j = 0; j < a; j++) {
                        d[i][j] = c[j][i];
                        System.out.print(d[i][j] + " ");
                    }
                    System.out.println(" ");
                }
    }

}
