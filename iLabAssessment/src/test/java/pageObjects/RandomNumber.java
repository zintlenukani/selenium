package pageObjects;

import java.util.Random;

public class RandomNumber {
    public String randoNumber(){
        Random randTen = new Random();
        int randNum;
        int code = 0;

        String m [] =new String[9];
        for (int i = 0; i<9;i++){
            randNum = randTen.nextInt(9);
            m[i] = Integer.toString(randNum);
        }

        return (code + m[5]+m[1]+" "+m[2]+m[3]+m[4]+" "+m[5]+m[6]+m[7]+m[8]);

    }
}
