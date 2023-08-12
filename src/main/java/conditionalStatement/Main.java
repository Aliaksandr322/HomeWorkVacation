package conditionalStatement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
//        task12();
//        task13();
//        task14();
//        task15();
//        task16();
        task17();
    }



    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int a = sc.nextInt();
        if (a >= 0){
            System.out.println("Number is positive");
        }
        else System.out.println("Number is negative");
    }
    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = sc.nextInt();
        System.out.println("Input b: ");
        int b = sc.nextInt();
        System.out.println("Input c: ");
        int c = sc.nextInt();
        double D = Math.pow(b,2) - (4 * a * c);
        if (D > 0){
            System.out.println("x1 = " + ((-b + Math.sqrt(D))/(2*a)));
            System.out.println("x2 = " + ((-b - Math.sqrt(D))/(2*a)));
        }
        else if (D == 0){
            System.out.println("x = " + ((-b)/(2 * a)));
        }
        else System.out.println("No roots");
    }
    public static void task3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = sc.nextInt();
        System.out.println("Input b: ");
        int b = sc.nextInt();
        System.out.println("Input c: ");
        int c = sc.nextInt();
        if (a > b && a > c){
            System.out.println("The greatest number is " + a);
        }
        else if (b > a && b > c){
            System.out.println("The greatest number is " + b);
        }
        else System.out.println("The greatest number is " + c);
    }
    public static void task4(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = in.nextDouble();

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Positive small number");
            }
            else if (input > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
    public static void task5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = sc.nextInt();
        switch (number){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday ");
                break;
            case 4 :
                System.out.println("Thursday ");
                break;
            case 5 :
                System.out.println("Friday ");
                break;
            case 6 :
                System.out.println("Saturday ");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong number");
        }
    }
    public static void task6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1th number: ");
        double number1 = sc.nextDouble();
        System.out.println("Input 1th number: ");
        double number2 = sc.nextDouble();
        int num1 = (int) number1;
        int num2 = (int) number2;
        number1 -= num1;
        number2 -= num2;
        boolean isEquals = false;
        for (int i = 0 ; i < 3; i++){
            number1 *= 10;
            number2 *= 10;
            int res1 = (int)number1;
            int res2 = (int)number2;
            if (res1 == res2){
                isEquals = true;
            }
            else {
                isEquals = false;
                break;
            }
        }
        System.out.println(isEquals ? "They are same" : "They are different");
    }
    public static void task7(){
        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
    public static void task8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a letter: ");
        String letter = sc.next();
        if (letter.length() > 1 && letter.length() < 0){
            System.out.println("Wrong letter!!!");
            return;
        }
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u") || letter.equals("y")){
            System.out.println("Input letter is Vowel");
        }
        else if (letter.equals("A") || letter.equals("E") || letter.equals("I") || letter.equals("O") || letter.equals("U") || letter.equals("Y")){
            System.out.println("Input letter is Vowel");
        }
        else System.out.println("Input letter is Consonant");
    }
    public static void task9(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a year: ");
        int year = sc.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " isn't leap year");
        }
    }
    public static void task10(){
        System.out.println ("The first 10 natural numbers are:\n");
        for (int i = 1; i <=10 ; i++){
            System.out.println(i);
        }
    }

    public static void task11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number:  ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++){
            sum += i;
        }
        System.out.println("The Sum of Natural Number upto n terms : " + num + "" + sum);
    }
    public static void task12(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number:  ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        double sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("The sum of 5 no is : " + sum);
        System.out.println("The Average is : " + (sum/5));
    }
    public static void task13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of terms :  ");
        int num = sc.nextInt();
        for (int i = 1 ; i <= num; i++){
            System.out.println("Number is :" + i +" and cube of 1 is :" + Math.pow(i,3));
        }
    }
    public static void task14(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms : ");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
    public static void task15(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms : ");
        int num = sc.nextInt();
        int sum = 0;
        System.out.println("The odd numbers are : ");
        for (int i = 1; i <= num * 2; i++){
            if (i % 2 != 0){
                System.out.println(i);
                sum +=i;
            }
        }
        System.out.println("The Sum of odd Natural Number upto 5 terms is: " + sum);
    }
    public static void task16() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms : ");
        int num = sc.nextInt();
        String str = "";
        for (int i = 1; i <= num; i++){
            str += Integer.toString(i);
            System.out.println(str);
        }
    }
    public static void task17() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of terms : ");
        int num = sc.nextInt();
        String str = "";
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                str += Integer.toString(i);
            }
            System.out.println(str);
            str = "";
        }
    }

}
