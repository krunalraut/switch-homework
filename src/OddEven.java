import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number ");  //asking for user input
        int num=scanner.nextInt();            //storing user input into integer variable
        switch (num%2)                        //checking for num modulus 2 value
        {
            case 0:                                            //checking for num%2 =0
                System.out.println("you entered even number");  //printing if above condition is true
                break;
            default:
                System.out.println("you Entered odd number");  //printing when above condition false
                break;
        }

    }
}
