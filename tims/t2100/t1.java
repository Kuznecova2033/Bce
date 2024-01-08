package tims.t2100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t1 {
    public static void main(String[] args) {
        String inputFileName ="src/t2100/txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") !=null;
        int marshalAndLilly = 2;

        try{
            BufferedReader bufferedReader =
                    oj? new BufferedReader(new InputStreamReader(System.in)):
                            new BufferedReader((new FileReader(inputFileName)));

            String readLine = "";
            int numberF = 0;
            int numberP = 0;

            while ((readLine = bufferedReader.readLine()) != null){
                if(numberF == 0){
                    numberF = Integer.parseInt(readLine);
                    continue;
                }
                if(readLine.contains("+")){
                    numberP++;
                }
            }
            int result;
            int quests = (marshalAndLilly + numberF + numberP);
            if(quests == 13) {
                result = (quests * 100) + 100;
            }else {
                result = quests * 100;
            }
            System.out.println(result);

        }catch(IOException exception){
            exception.printStackTrace();
        }
    }
}
