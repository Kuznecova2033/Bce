package lab4;
import java.util.Scanner;
public class l7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("введите количество строк массива: ");
        int a =id.nextInt();
        System.out.print("введите количество столбцов массива: ");
        int b = id.nextInt();
        int[][] d = new int[a][b];
        int c = 0;
        int e = 0;
        int f = 0;
        for (int i = 0; f < d.length ; f++) {
            for (int j = 0; j <(d[i].length - c); j++) {
                d[i][j] = e;
                e++;
            }
            if(i< d.length-1) {
                i++;}
            for (int o=a-1; o > c; o--) {
                d[o][d[i].length-1-c] = e;
                e++;
            }
            c++;
        }
        int z = 0;
        for (int i = 0; i < d.length; i++){
            int count = i+1;
            for (int j = 0; j < d[i].length; j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}


