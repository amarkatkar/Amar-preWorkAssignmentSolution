import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    //function to checkPalindrome

    public void checkPalindrome() {

        System.out.print("Enter the number to find Palindrome: ");
        int number = sc.nextInt();
        int remainder;
        int sum=0;
        int temp;
        temp=number;
        while(number>0)
        {
            remainder =number %10;  //getting remainder
            sum=(sum*10)+ remainder;
            number=number/10;
        }
        if(temp == sum)
        {
            System.out.println(temp + " is a palindrome number ");
        }else
        {
            System.out.println(temp + " is not a palindrome number ");
        }
        System.out.print("\n");
    }

    //function to printPattern

    public void printPattern() {

        System.out.print("Enter the Number to Print Pattern: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    //function to check no is prime or not

    public void checkPrimeNumber() {

        System.out.println("Enter the Number: \n ");
        int number = sc.nextInt();

        boolean count = false;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                count = true;
                break;
            }
        }
        if (!count) {
            System.out.println( +number +" is prime number.\n ");
        } else {
            System.out.println(+number +"  is not prime number.\n ");
        }
        System.out.print("\n");
    }


    // function to print Fibonacci Series

    public void printFibonacciSeries() {
        System.out.print("Enter the number to Print Fibonacci series: ");
        int number = sc.nextInt();
        System.out.print("Fibonacci series  :  ");

        int sum = 0;
        int num1 =0;
        int num2 =1;

        System.out.print(num1 +" , " + num2);

        for (int i = 0; sum < number; i++) {
            sum = num1 +num2;
            num1 = num2;
            num2 = sum;
            System.out.print(" , " + sum);
        }
        System.out.print("\n");
    }


//main method which contains switch and do while loop

    public static void main(String[] args) {

        Main obj = new Main();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            choice = sc.nextInt();

            switch (choice) {

                case 0:
                    choice = 0;
                    break;

                case 1: {
                    obj.checkPalindrome();
                }
                break;

                case 2: {
                   obj.printPattern();
                }
                break;

                case 3: {
                    obj.checkPrimeNumber();
                }
                break;

                case 4: {
                   obj.printFibonacciSeries();
                }
                break;

             default:
                    System.out.println("Invalid choice. Enter a valid no.\n");
            }
        } while (choice != 0);

        System.out.println("Exited Successfully!!!");
        sc.close();
    }
}
