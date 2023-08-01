package dataType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();

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

}
