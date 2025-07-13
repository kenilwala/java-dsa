import java.util.Scanner;

public class Day4_Functions_n_UserDefinedMethods {
    //no return no parameter
    public static void sayHi() {
        System.out.println("Hi there!");
    }

    //method no return, with parameter
    public static void greetUser(String name){
        System.out.println("Hello, "+name);
    }
    //return, no parameter
    public static int getNumber() {
        return 7;
    }
    //return with parameters
    public static void swapMethod(int a, int b){
        System.out.printf("Before Swapping: %d and %d",a,b);
        System.out.println("");
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.printf("After Swapping: %d and %d",a,b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = input.next();
        greetUser(name);
        sayHi();
        getNumber();
        int num1 =10;
        int num2 = 20;
        swapMethod(num1,num2);

    }

}
