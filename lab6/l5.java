package lab6;

public class l5 {
    public static int getSumOfSqrs(int n) {
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=Math.pow(i, 2);
        }
        return sum;
    }
}

public void setNumber(int number) {

    int Number;
    if (number <= 100) {
        Number = number;
    } else {
        Number = 100;
    }






