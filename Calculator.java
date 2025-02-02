import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First Number = ");
        int a = s.nextInt();
        System.out.println("Enter the Second Number = ");
        int b = s.nextInt();
        System.out.println("make a choice ( + , - , * , /)");
        String choice = s.next();
        int result;

        switch (choice){
            case "+" : result = a + b;
                System.out.println("Addition is " + result);
                break;
            case "-" : result = a - b;
                System.out.println("Subtraction is " + result);
                break;
            case "*" : result = a * b;
                System.out.println("Multiplication is " + result);
                break;
            case "/" : result = a / b;
                System.out.println("Division is " + result);
                break;

                default: System.out.println("Your choice is not valid");
                break;
        }


    }
}
