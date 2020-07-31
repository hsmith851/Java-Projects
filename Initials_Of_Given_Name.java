
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Initials_Of_Given_Name {

    public static void main(String[] args)throws IOException
    {
        // TODO Auto-generated method stub
        String Str; //String representation of an object
        BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
        //*BufferedReader is a class in Java that reads text from a character-input stream,
        System.out.print("Enter a name with First, Middle, and Last name: ");
        Str = BR.readLine(); //readLine() method of Console class in Java is used to read a single line of text from the console. ...
        Str = " " + Str; //Adds space between string
        String Str1 = " ";//Defines Str1
        for(int i = 0; i < Str.length(); i++)
        {
            if(Str.charAt(i)== ' ')
                Str1 = Str1 + Str.charAt(i+1)+".";
        }
        System.out.println("Initials of given name : " + Str1);
    }

}
