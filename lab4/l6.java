package lab4;
import java.util.Random;
import java.util.Scanner;

public class l6 {
    public static void main(String[] args) {
        Random random = new Random(200);
        Scanner id = new Scanner(System.in);
        System.out.print("введите количество строк массива: ");
        int a = id.nextInt();
        System.out.print("введите количество столбцов массива: ");
        int b = id.nextInt();
        int c[][] = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                c[i][j] = random.nextInt(200);
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        int dS = random.nextInt(a-1);
        int dK = random.nextInt(b-1);

        System.out.println("delete["+(dS)+"]["+(dK)+"]");
        System.out.println("");

        int d[][] = new int[a-1][b-1];
        for (int i=0, s = 0; i<a-1; s++) {
            if (s!=dS){
                for (int j =0, k = 0 ; j <b-1; k++) {
                    if (k != dK) {
                        d[i][j] = c[s][k];
                        System.out.print(d[i][j]+" ");
                        j++;
                    }
                }
                i++;
                System.out.println(" ");
            }
        }
    }
}


