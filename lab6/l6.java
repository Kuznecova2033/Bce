package lab6;

public class l6 {
    public static int[] getSubArray(int[] array, int num) {
        int[] newArray = new int[num>array.length? array.length : num];
        for(int i=0; i<newArray.length; i++){
            newArray[i]=array[i];
        }
        return newArray;
    }
}


