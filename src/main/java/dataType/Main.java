package dataType;

import java.math.BigInteger;
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
        task11();
    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit:");
        double far = sc.nextDouble();
        double cels = (5*(far - 32))/9;
        System.out.println(far + " degree Fahrenheit is equal to " + cels + " in Celsius");
    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a value for inch: ");
        double inch = sc.nextDouble();
        double meter = inch * 0.0254;
        System.out.println(inch + " inch is " + meter + " meters");
    }

    public static void task3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer between 0 and 1000: ");
        int num = sc.nextInt();
        int numCount = num;
        int count = 0;
        int sum = 0;
        while (numCount != 0){
            count++;
            numCount/=10;
        }
        for (int i = 0 ; i < count; i++){
            sum += (num%10);
            num/=10;
        }
        System.out.println(sum);
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of minutes: ");
        double minutes = sc.nextDouble();
        double days = Math.round(minutes / 1440);
        int years = 0;
        if (Math.floor(days / 365) ==  0){
            System.out.println( minutes + " minutes is approximately " + years + " years and " + days + " days");
        }
        else {
            years = (int)Math.floor(days / 365);
            days = days - (years * 365);
            System.out.println( minutes + " minutes is approximately " + years + " years and " + days + " days");
        }
    }

    public static void task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the time zone offset to GMT:");
        int GMT = sc.nextInt();
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = currentSeconds % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = (totalHours + GMT)% 24;
        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }
    public static void task6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input weight in pounds: ");
        int weight = sc.nextInt();
        System.out.println("Input height in inches: ");
        int height = sc.nextInt();

        double weightInKil = weight / 2.205;
        double heightInMeter = height *  0.0254;

        System.out.println("Body Mass Index is " + (weightInKil / (Math.pow(heightInMeter,2))));
    }

    public static void task7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input distance in meters: ");
        int meters = sc.nextInt();
        System.out.println("Input hour: ");
        int hour = sc.nextInt();
        System.out.println("Input minutes: ");
        int minutes = sc.nextInt();
        System.out.println("Input seconds: ");
        int seconds = sc.nextInt();

        double sumSecond = seconds + (minutes * 60) + (hour * 3600);
        System.out.println("Your speed in meters/second is " + meters / sumSecond);
        double kilometers = meters / 1000.0 ;
        double miles = kilometers / 1.609;
        double sumHours = sumSecond / 3600;
        System.out.println("Your speed in km/h is " + kilometers / sumHours);
        System.out.println("Your speed in miles/h is " + miles / sumHours);
    }
    public static void task8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = sc.nextInt();
        System.out.println("Square: " + Math.pow(num,2));
        System.out.println("Cube: " + Math.pow(num,3));
        System.out.println("Fourth power: " + Math.pow(num,4));
    }
    public static void task9(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st integer: ");
        int num1 = sc.nextInt();
        System.out.println("Input 2nd integer: ");
        int num2 = sc.nextInt();
        System.out.println("Sum of two integers: " + num1 + num2);
        System.out.println("Difference of two integers: " + (num1 - num2));
        System.out.println("Product of two integers: " + num1 * num2);
        System.out.println("Average of two integers: " + ((num1 + num2)/2));
        System.out.println("Distance of two integers: " + (num1 - num2));
        System.out.println("Max integer: " + (num1 > num2 ? num1 : num2));
        System.out.println("Min integer: " + (num1 < num2 ? num1 : num2));
    }
    public static void task10(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input six non-negative digits: ");
        String num = sc.next();
        String[] strArray = num.split("");
        for (int i = 0 ; i < strArray.length; i++){
            System.out.print(strArray[i] + " ");
        }
    }
    public static void task11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        String num = sc.next();
        try {
            Integer.parseInt(num);
            System.out.println("Number is integer");
        }catch (NumberFormatException nfe){
            System.out.println("Number is double or float");
        }
    }
    public static void task12(){
        int in1 = Integer.MIN_VALUE;
        int in2 = Integer.MAX_VALUE;
        System.out.println("Signed integers: " + in1 + ", " + in2);
        System.out.println("-----------------------------------------");
        int compare_Signed_num = Integer.compare(in1, in2);
        System.out.println("Result of comparing signed numbers: " + compare_Signed_num);
        int compare_Unsigned_num = Integer.compareUnsigned(in1, in2);
        System.out.println("Result of comparing unsigned numbers: " + compare_Unsigned_num);
    }
    public static void task13(){
        int x = -2365;
        int y = 125;
        System.out.println();
        System.out.println("Floor division using '/' operator: " + (x / y));
        System.out.println("Floor division using floorDiv() method is: " + Math.floorDiv(x, y));
        System.out.println();
        System.out.println("Floor modulus using '%' operator: " + (x % y));
        System.out.println("Floor modulus using floorMod() method is: " + Math.floorMod(x, y));
    }
    public static void task14(){
        BigInteger bigval = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("\nBigInteger value: "+bigval);
        long val_Long = bigval.longValue();
        System.out.println("\nConvert the said BigInteger to an long value: "+val_Long);
        int val_Int = bigval.intValue();
        System.out.println("\nConvert the said BigInteger to an int value: "+val_Int);
        short val_Short = bigval.shortValue();
        System.out.println("\nConvert the said BigInteger to an short value: "+val_Short);
        byte val_Byte = bigval.byteValue();
        System.out.println("\nConvert the said BigInteger to byte: "+val_Byte);
        long val_ExactLong = bigval.longValueExact();
        System.out.println("\nConvert the said BigInteger to exact long: "+val_ExactLong);
    }
    public static void task15(){
        float fn = 0.2f;
        System.out.println("\nInitial floating number: " + fn);
        float next_down_fn = Math.nextDown(fn);
        float next_up_fn = Math.nextUp(fn);
        System.out.println("Float " + fn + " next down is " + next_down_fn);
        System.out.println("Float " + fn + " next up is " + next_up_fn);
        double dn = 0.2d;
        System.out.println("\nInitial double number: " + dn);
        double next_down_dn = Math.nextDown(dn);
        double next_up_dn = Math.nextUp(dn);
        System.out.println("Double " + dn + " next down is " + next_down_dn);
        System.out.println("Double " + dn + " next up is " + next_up_dn);
    }
}
