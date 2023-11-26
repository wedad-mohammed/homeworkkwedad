// سؤال 1
import java.util.Scanner;
public class InputAllBaseTypes {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int inttheValue= scanner.nextInt();
        System.out.println(" Enter the int number :");

        boolean booleantheValue= scanner.nextBoolean();
        System.out.println(" Enter the boolean number :");

        double doubletheValue= scanner.nextDouble();
        System.out.println(" Enter the double number :");

        char chartheValue= scanner.next().charAt(0);
        System.out.println(" Enter the char number :");


        scanner.close();
        System.out.println("the integer entered :"+inttheValue);
        System.out.println("the boolean entered :"+booleantheValue);
        System.out.println("the double entered :"+doubletheValue);
        System.out.println("the char entered :"+chartheValue);
    }



    //*******************************************
    }

