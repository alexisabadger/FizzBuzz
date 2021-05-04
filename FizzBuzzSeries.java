import java.util.Scanner;
public class FizzBuzzSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int userInteger = input.nextInt();
        System.out.println();
        for (int i = 1; i <= userInteger; i++) {
            fizzBuzzer(i);
        }
    }
    public static void fizzBuzzer(int num) {
        boolean aMultiple = false;

        switch(num % 3) {           // if multiple of 3, fizz
            case 0:
                System.out.print("fizz");
                aMultiple = true;
        }
        switch(num % 5) {           // if multiple of 5, buzz
            case 0:
                System.out.print("buzz");
                aMultiple = true;
        }
        if (!aMultiple) {           // otherwise, print num
            System.out.print(num);
        }  
        System.out.println();
    }
}