import java.util.Scanner;

public class FindCity
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter alphabet: ");      //asking for user input
        char ch = scanner.next().charAt(0);//storing user input into character variable

        switch (ch)             //using switch to compare ch character variable
        {
            case 'a':                         //checking for ch=a
                System.out.println("Agra");
                break;
            case 'b':                          //checking for ch=b
                System.out.println("Bombay");
                break;
            case 'c':                            //checking for ch=c
                System.out.println("Chennai");
                break;
            case 'd':                              //checking for ch=d
                System.out.println("Dehli");
                break;
            case 'e':                               //checking for ch=e
                System.out.println("Edimberge");
                break;
            case 'f':                                //checking for ch=f
                System.out.println("faridabad");
                break;
            default:
                System.out.println("invalid entry");  //executed when all above condition are false
        }
    }
}
