package basicPart1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //10
//        task1();
//        System.out.println(task2(74,36));
//        System.out.println(task3(74,36));
//        task4();
//        System.out.println(task5(25,5));
//        task6(125,24);
//        task7(8);
//        task8();
//        task9();
//        task10();
        //20
//        task11(7.5);
//        System.out.println(task12(1,2,3));
//        task13(5.6,8.5);
//        task14();
//        task15(5,6);
//        task16();
//        task17();
//        task18();
//        task19();
//        task20();
        //30
//        task21();
//        task22();
//        task23();
//        task24();
//        task25();
//        task26();
//        task27();
//        task28();
//        task29();
//        task30();
        //40
//        task31();
//        task32();
//        task33();
//        task34();
//        task35();
//        task36();
//        task37();
//        task38(); // TO DO

    }

    public static void task1(){
        System.out.println("Hello");
        System.out.println("Alexandr Azaronak");
    }

    public static int task2(int a , int b){
        return a + b;
    }

    public static int task3(int a , int b){
        return a / b;
    }

    public static void task4(){
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + (-3 * 5) / 8;
        int d = 5 + 15/3 * 2 - 8 % 3;
        System.out.println(a + "\n" + b +"\n" + c + "\n" + d + "\n");
    }

    public static int task5(int a, int b){
        return a * b;
    }

    public static void task6(int a , int b){
        System.out.println(a + " + "+ b + " = " + (a + b));
        System.out.println(a + " - "+ b + " = " + (a - b));
        System.out.println(a + " * "+ b + " = " + a * b);
        System.out.println(a + " / "+ b + " = " + a / b);
        System.out.println(a + " % "+ b + " = " + a % b);
    }

    public static void task7(int num){
        for (int i = 1 ; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
    public static void task8(){
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }
    public static void task9(){
        double result = (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5);
        System.out.println(result);
    }
    public static void task10(){
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
    }
    public static void task11(double radius){
        System.out.println("Perimeter is = " + 2 * Math.PI * radius);
        System.out.println("Area is = " + Math.PI * Math.pow(radius, 2));
    }
    public static double task12(double num1,double num2, double num3){
        return (num1 + num2 + num3)/3;
    }
    public static void task13(double width, double height){
        System.out.println("Area is " + width + " * " + height + " = " + width * height );
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + 2*(width*height));
    }
    public static void task14(){
        System.out.println("* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================");
    }
    public static void task15(int a, int b){
        System.out.println("Before swapping a = " + a + " b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a = " + a + " b = " + b);
    }
    public static void task16(){
        System.out.println(" +\"\"\"\"\"+                                                 \n" +
                "[| o o |]                                                \n" +
                " |  ^  |                                                 \n" +
                " | '-' |                                                 \n" +
                " +-----+");
    }
    public static void task17(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first binary number: ");
        Integer a = sc.nextInt();
        System.out.println("Input second  binary number: ");
        Integer b = sc.nextInt();
        Integer num1 = Integer.parseInt(a.toString(),2);
        Integer num2 = Integer.parseInt(b.toString(),2);

        System.out.println("Sum of two binary numbers: " + (Integer.toBinaryString(num1 + num2)));
    }
    public static void task18(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first binary number: ");
        Integer a = sc.nextInt();
        System.out.println("Input second  binary number: ");
        Integer b = sc.nextInt();
        Integer num1 = Integer.parseInt(a.toString(),2);
        Integer num2 = Integer.parseInt(b.toString(),2);

        System.out.println("Product of two binary numbers: " + (Integer.toBinaryString(num1 * num2)));
    }
    public static void task19(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Decimal Number : ");
        Integer num1 = sc.nextInt();
        System.out.println("Binary number is: " + (Integer.toBinaryString(num1)));
    }
    public static void task20(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Decimal Number : ");
        Integer num1 = sc.nextInt();
        System.out.println("Hexadecimal number is  " + (Integer.toHexString(num1)));
    }
    public static void task21(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Decimal Number : ");
        Integer num1 = sc.nextInt();
        System.out.println("Octal number is  " + (Integer.toOctalString(num1)));
    }
    public static void task22(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a binary  Number : ");
        Integer num1 = sc.nextInt();
        num1 = Integer.parseInt(num1.toString(),2);
        System.out.println("Decimal Number: " + num1);
    }
    public static void task23(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a binary  Number : ");
        Integer num1 = sc.nextInt();
        num1 = Integer.parseInt(num1.toString(),2);
        System.out.println("Decimal Number: " + Integer.toHexString(num1));
    }
    public static void task24(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a binary  Number : ");
        Integer num1 = sc.nextInt();
        num1 = Integer.parseInt(num1.toString(),2);
        System.out.println("Decimal Number: " + Integer.toOctalString(num1));
    }
    public static void task25(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a octal   Number : ");
        Integer num1 = sc.nextInt();
        num1 = Integer.parseInt(num1.toString(),8);
        System.out.println("Decimal Number: " + Integer.parseInt(num1.toString(),10));
    }
    public static void task26(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a octal   Number : ");
        Integer num1 = sc.nextInt();
        num1 = Integer.parseInt(num1.toString(),8);
        System.out.println("Binary Number: " + Integer.toBinaryString(num1));
    }
    public static void task27(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a octal   Number : ");
        Integer num1 = sc.nextInt();
        num1 = Integer.parseInt(num1.toString(),8);
        System.out.println("Binary Number: " + Integer.toHexString(num1));
    }
    public static void task28(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a hexadecimal Number : ");
        Integer num1 = sc.nextInt();
        num1 = Integer.parseInt(num1.toString(),16);
        System.out.println("Decimal Number: " + Integer.parseInt(num1.toString(),10));
    }
    public static void task29(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a octal   Number : ");
        Integer num1 = sc.nextInt();
        num1 = Integer.parseInt(num1.toString(),16);
        System.out.println("Binary Number: " + Integer.toBinaryString(num1));
    }
    public static void task30(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a octal   Number : ");
        Integer num1 = sc.nextInt();
        num1 = Integer.parseInt(num1.toString(),16);
        System.out.println("Octal Number: " + Integer.toOctalString(num1));
    }
    public static void task31(){
        System.out.println("\nJava Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
    }
    public static void task32(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 != num2){
            System.out.println(num1 + "!=" + num2);
        }
        if(num1 < num2){
            System.out.println(num1 + "<" + num2);
        }
        if(num1 <= num2){
            System.out.println(num1 + "<=" + num2);
        }
    }
    public static void task33(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer:");
        int num = sc.nextInt();
        int result = 0;
        while (num % 10 != 0){
            result += num%10;
            num/=10;
        }
        System.out.println("The sum of the digits is: " + result);
    }
    public static void task34(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of a side of the hexagon: ");
        int length = sc.nextInt();
        System.out.println("The area of the hexagon is: " + ((6 * Math.pow(length,2))/(4 * Math.tan(Math.PI/6))));
    }
    public static void task35(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of sides on the polygon: ");
        int number = sc.nextInt();
        System.out.println("Input the length of one of the sides: ");
        int side = sc.nextInt();
        System.out.println("The area is:  " + ((number * Math.pow(side,2))/(4 * Math.tan(Math.PI/number))));
    }
    public static void task36(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the latitude of coordinate 1: ");
        double x1 = sc.nextDouble();
        System.out.println("Input the longitude of coordinate 1:");
        double y1 = sc.nextDouble();
        System.out.println("Input the latitude of coordinate 2: ");
        double x2 = sc.nextDouble();
        System.out.println("Input the longitude of coordinate 2:");
        double y2 = sc.nextDouble();
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        final double RADIUS_OF_THE_EARTH = 6371.01;
        double result = RADIUS_OF_THE_EARTH * Math.acos(((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2))));
        System.out.println("The distance between those points is: " + result);
    }
    public static void task37(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("Reverse string: " + stringBuilder.reverse());
    }
    public static void task38(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = sc.nextLine();
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;
        String[] array = str.split("");
        for (int i = 0; i < array.length;i++){
            Pattern pattern = Pattern.compile(array[i]);
            Matcher matcherLetter = pattern.matcher("^[a-zA-Z]");
            Matcher matcherSpace = pattern.matcher("^[\\s]");
            Matcher matcherNumber = pattern.matcher("^[0-9]");
            Matcher matcherOther = pattern.matcher("^[^a-zA-Z][^\\s][^0-9]");
            if (matcherLetter.matches()){
                letter++;
            }
            if(matcherNumber.matches()){
                number++;
            }
            if(matcherSpace.matches()){
                space++;
            }
            if(matcherOther.matches()){
                other++;
            }
        }
        System.out.println("The string is :  " + str);
        System.out.println("letters: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);
    }
}
