package lab5;

public class l5 {
    public static void main(String[] args) {
        Example myexample = new Example(21);
        System.out.println("Число = " + myexample.PrintInt());
        myexample.Set(15); System.out.println("Число = " + myexample.PrintInt());
        myexample.Set(125);
        System.out.println("Число = " + myexample.PrintInt());
        myexample.Set(-15); System.out.println("Число = " + myexample.PrintInt());
        myexample.Set();
        System.out.println("Число = " + myexample.PrintInt()); }
    static class Example {
        private int a;
        public void Set(int n) {
            System.out.println("Метод Set() c аргументом"); a = n;
            if (n >= 100) { a = 100;
            } if (n <= 0) {
                a = 0; }
        } public void Set() {
            System.out.println("Метод Set() без аргумента"); a = 0;
        } public int PrintInt() {
            return a; }
        Example(int a) { System.out.println("Example() конструктор");
            this.Set(a); }
    }
}



