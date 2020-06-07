import java.util.Scanner;

public class AlphabetCheck
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter alphabet: ");        //asking for user input
        char ch=scanner.next().charAt(0);          //storing user input into character variable
        switch (ch)                              //checking ch variable in switch
        {
            case 'a':                                       //checking ch=a
                System.out.println("you entered vowel");    //printing if above condition is true
                break;
            case 'e':                                       //checking ch=e
                System.out.println("you entered vowel");
                break;
            case 'i':                                       //checking ch=i
                System.out.println("you entered vowel");
                break;
            case 'o':                                         //checking ch=o
                System.out.println("you entered vowel");
                break;
            case 'u':                                         //checking ch=u
                System.out.println("you entered vowel");
                break;
            default:                                          //if all above condition is false
                System.out.println("you entered consonant");
        }
    }
}
