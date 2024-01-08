package lab5;
import java.util.Scanner;

public class l3 {
        public static void main(String[] args) {
            Scanner id = new Scanner(System.in);
            System.out.println("Введите c");
            int a = id.nextInt();
            System.out.println("Введите d");
            int b = id.nextInt();
            Example myexample1 = new Example();
            Example myexample2 = new Example(a);
            Example myexample3 = new Example(a,b); }
        static class Example {
            private int c;
            private int d;

            Example() {
                System.out.println("Koнcтpyиpoвaниe объекта test Example(1)\n");
            }

            Example(int c) {
                System.out.println("Koнcтpyиpoвaниe объекта Example(2)");
                this.c = c;
                System.out.println("c^c = " + exponentOwnPow(c) + "\n");
            }

            public int exponentOwnPow(int c) {
                this.c = c;
                int e = 1;
                for (int i = 1; i <= c; i++) {
                    e = c * e;
                }
                return e;
            }

            Example(int c, int d) {
                System.out.println("Koнcтpyиpoвaниe объекта Example(3)");
                this.c = c;
                this.d = d;
                System.out.println("c^d = " + exponentPow(c, d) + "\n");
            }

            public int exponentPow(int n1, int n2) {
                n1 = c;
                n2 = d;
                int e = 1;
                for (int i = 1; i <= d; i++) {
                    e = c * e;
                }
                return e;
            }
        }
    }


