import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter number: ");        //asking for user input
        double num1=scanner.nextDouble();                  //storing user input into double variable
        System.out.print("Please enter second number: ");   //asking for user input
        double num2=scanner.nextDouble();                  //storing user input into double variable
        System.out.print("enter maths operator: ");      //asking for user input
        char operator=scanner.next().charAt(0);        //storing user input into character variable
        switch(operator)
        {
            case '+':                                             //checking operator = +
                System.out.println("answer is "+(num1+num2));    //printing if above condition true
                break;
            case '-':                                            //checking operator = -
                System.out.println("answer is "+(num1-num2));    //printing if above condition true
                break;
            case '*':                                            //checking operator = *
                System.out.println("answer is "+(num1*num2));    //printing if above condition true
                break;
            case '/':                                            //checking operator = /
                System.out.println("answer is "+(num1/num2));    //printing if above condition true
            default:
                System.out.println("invalid operator entered");   //when all above condition are false
        }

    }
}
