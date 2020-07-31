import java.util.Scanner;
public class Menu
{
    public static void main(String[] args)
    {
        int ch, n, i;
        Scanner SC = new Scanner (System.in);
        System.out.println("Menu: \n1.To find factorial\n2.To find facts\nEnter your choice: ");
        ch = SC.nextInt();
        switch(ch)
        {
            case 1:
                int f = 1;
                System.out.print("Enter the Number to find the factorial: ");
                n = SC.nextInt();
                for(i=2; i<n; i++)
                    f=f*i;
                System.out.println(n + "!=" + f);
                break;

            case 2:
                System.out.print("Enter the Number to find factorial: ");
                n = SC.nextInt();
                System.out.println("Factors of " + n + " are: ");
                for(i=1; i<=n; i++)
                    if(n%1==0)
                        System.out.print(i+",");
                break;

            default:
                System.out.print("Invalid Input");


        }
    }

}
