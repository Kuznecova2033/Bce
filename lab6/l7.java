package lab6;

public class l7 {
    public static int[] getCodes(char[] symbols) {
        int[] codes=new int[symbols.length];
        int i = 0;
        for (char j : symbols) {
            codes[i]=(int) j;
            i++;
        }
        return codes;
    }

}
