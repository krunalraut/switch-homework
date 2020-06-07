import java.util.Scanner;

public class CheckNumber
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number ");   //asking for use input
        int num=scanner.nextInt();             //storing user input intp integer variable
        switch (num>=0?1:0)               //ckecking for number greater than or equal to or less than zero
        {
            case 0:
                System.out.println("you negative number "); //printing if number less than zero
                break;
            case 1:
                switch (num>0?1:0)         //checking for number grater than or equal to zero
                {
                    case 0:                                    //checking for num =0
                        System.out.println("you entered zero");//printing when num=0
                        break;
                    case 1:                                               //checking for num greater than 0
                        System.out.println("you entered positive number");//printing when above condition true
                        break;
                }
            default:
                System.out.println("invalid entry");  //printing if all above conditions are false


        }

    }
}
