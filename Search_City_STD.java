import java.util.Scanner;
    public class Search_City_STD
    {
        public static void main(String[] args)
        {
            Scanner SC = new Scanner(System.in);
            System.out.print("Enter the Length of the Array");
            int l = SC.nextInt();
            String City [] = new String [l];
            int STDCode [] = new int [l];

            for(int i=0; i<l; i++)
            {
                System.out.print("Enter The City: ");
                City[i] = SC.next();
                System.out.print("Enter The City Code: ");
                STDCode[i] = SC.nextInt();
            }
            System.out.print("Enter the City Name to Search");
            String Search = SC.next();
            boolean flag = false;
            for(int i=0; i<l; i++)
            {
                System.out.println("STD code of " + Search + "City: " + STDCode[i]);
                flag = true;
                break;
            }
            if(flag == false)
                System.out.println("There is no such");
        }

    }

