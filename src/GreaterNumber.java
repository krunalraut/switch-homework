import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number ");    //asking for user input
        int num1 = scanner.nextInt();                 //storing user input into integer variable
        System.out.print("Enter second number ");    //asking for user input
        int num2 = scanner.nextInt();                 //storing user input into integer variable
        System.out.print("Enter third number ");     //asking for user input
        int num3 = scanner.nextInt();                //storing user input into integer variable
        switch (num1 >= num2 ? 1 : 2) {              //checking num1 is grater than or equal to num2
            case 1:
                switch (num1 > num2 ? 1 : 2) {       //checking num1 greater than num2
                    case 1:
                        switch (num1 >=num3 ? 1 : 3) {   //checking num1 is grater than or equal to num3
                            case 1:
                                switch(num1>num3?1:3)     //checking num1 is grater than num3
                                {
                                    case 1:
                                        System.out.println("first number " + num1 + " is greatest");//printing when num1 greatest
                                        break;
                                    case 3:
                                        System.out.println("number first "+num1+" third number " + num3 + " is greatest");
                                        break;

                                }
                                break;
                        }
                        break;
                    case 2:
                        switch (num1 > num3 ? 1 : 3) {
                            case 1:
                                System.out.println("first number " + num1 + " & second number " + num2 + " are greater");
                                break;
                            case 2:
                                System.out.println(num3 + " is greatest");
                                break;
                        }
                        break;
                }
                break;
            case 2:
                switch (num2 >= num3 ? 2 : 3) {
                    case 2:
                        switch (num2 > num3 ? 2 : 3) {
                            case 2:
                                System.out.println("second number " + num2 + " is greatest");
                                break;
                            case 3:
                                System.out.println("second number " + num2 + " & third number " + num3 + " are grater ");

                                break;
                        }
                        break;
                    case 3:
                        System.out.println(" third number " + num3 + " are greatest ");
                        break;
                }


        }

    }
}
