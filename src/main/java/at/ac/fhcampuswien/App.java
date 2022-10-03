package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.print("       \\ }{ /");
        System.out.println("\\ )_ / _\\");
        System.out.print("       /\\__/");
        System.out.println("\\ \\__O (__");
        System.out.print("      (--/\\--)");
        System.out.println("    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char example1 = 'Z';
        int example2 = 0xface;
        int example3 = 012;
        long example4 = 80L;
        float example5 = 44e-1f;
        float example6 = 5.5f;
        double example7 = 8.88e1;
        double example8 = 99.9;

        int a = (int) example7;
        int b = (int) example8;

        int c = (int) example4;
        int d = (int) example5;
        int e = (int) example6;

        int sum;
        sum = example1 + example2 + example3 + c + d + e + a + b;

        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here

        Scanner myFirstScanner = new Scanner(System.in);
        int a = myFirstScanner.nextInt();
        int b = myFirstScanner.nextInt();

        System.out.println(a + b);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here

        Scanner scannerTask5 = new Scanner(System.in);


        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scannerTask5.nextInt();
        System.out.print("y: ");
        int y = scannerTask5.nextInt();
        System.out.println("After Swap:");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner scanTask6 = new Scanner(System.in);

        System.out.print("n1: ");
        int n1 = scanTask6.nextInt();
        System.out.print("n2: ");
        int n2 = scanTask6.nextInt();
        if(n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n2 > n1) {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }


    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here

        Scanner scanTask7 = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int annualRev = scanTask7.nextInt();

        if (annualRev < 0 || annualRev >= 100000) {
            System.out.println("Invalid Revenue");
        }

        if (annualRev >= 0 & annualRev < 20000) {
            System.out.println("Poor Sales Revenue");
        }

        if (annualRev >= 20000 & annualRev < 50000) {
            System.out.println("Average Sales Revenue");
        }

        if (annualRev >= 50000 & annualRev < 80000) {
            System.out.println("Good Sales Revenue");
        }

        if (annualRev >= 80000 & annualRev < 100000) {
            System.out.println("Excellent Sales Revenue");
        }

    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner scanTask8 = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int userInput = scanTask8.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Your Commission Rate was set to " + userInput * 0.01);
                break;

            case 2:
                System.out.println("Your Commission Rate was set to " + userInput * 0.01);
                break;

            case 3:
                System.out.println("Your Commission Rate was set to " + userInput * 0.01);
                break;

            case 4:
                System.out.println("Your Commission Rate was set to " + userInput * 0.01);
                break;

            default:
                System.out.println("Your Commission Rate was set to " + userInput * 0.00);
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here

        Scanner scanTask9 = new Scanner(System.in);

        System.out.print("Year: ");
        int userInput = scanTask9.nextInt();

        if (userInput % 4 == 0) {

            if (userInput % 100 == 0) {

                if (userInput % 400 == 0) {
                    System.out.println("Leapyear");
                } else {
                    System.out.println("Not a Leapyear");
                }
            } else {
                System.out.println("Leapyear");
            }

        } else {
            System.out.println("Not a Leapyear");
        }

    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here

        Scanner scanTask10 = new Scanner(System.in);

        System.out.print("Number: ");

        int num = scanTask10.nextInt();

        if (num >= 0 && num < 1000) {
            int tempMod1 = num % 10;
            int temp1 = num / 10;

            int tempMod2 = temp1 % 10;
            int temp2 = temp1 / 10;

            int tempMod3 = temp2 % 10;

            int newNum = tempMod1 * 100 + tempMod2 * 10 + tempMod3;

            System.out.println(newNum);

        }

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}