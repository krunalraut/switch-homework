
import java.util.Scanner;

public class PrintNumber
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");         //asking for user input
        int num=scanner.nextInt();                  //storing user input into double variable
        switch(num)                            //checking num variable in switch
        {
            default:
                System.out.println("Not allowed");    //executed when all below condition are false
                break;
            case 0:                          //checking for num=0
                System.out.println("0");     //printing if above condition true
                break;
            case 1:                          //checking for num=0
                System.out.println("1");      //printing if above condition true
                break;
            case 2:                           //checking for num=0
                System.out.println("2");       //printing if above condition true
                break;
            case 3:                           //checking for num=0
                System.out.println("3");        //printing if above condition true
                break;
            case 4:                             //checking for num=0
                System.out.println("4");         //printing if above condition true
                break;
            case 5:                              //checking for num=0
                System.out.println("5");           //printing if above condition true
                break;
            case 6:                              //checking for num=0
                System.out.println("6");           //printing if above condition true
                break;
            case 7:                               //checking for num=0
                System.out.println("7");           //printing if above condition true
                break;
            case 8:                                //checking for num=0
                System.out.println("8");            //printing if above condition true
                break;
            case 9:                                 //checking for num=0
                System.out.println("9");             //printing if above condition true
                break;
        }

    }
}
