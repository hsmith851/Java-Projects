import java.io.*;
public class Frequency_of_Char_and_Num_of_Digits_ {

    public static void main(String[] args)throws IOException {
        // TODO Auto-generated method stub
        BufferedReader BR = new BufferedReader(new InputStreamReader (System.in));
        System.out.print("Enter a string : ");
        String S = BR.readLine();
        S = S.toUpperCase();
        int count = 0;


        for(char j = 'A'; j<='z'; j++)
        {
            for(int i=0; i<S.length(); i++)
            {
                if (S.charAt(i)== j)
                    count++;
            }
            if(count != 0)
                System.out.println("Count of   " + j + ": " + count);
            count = 0;
        }
    }

}
