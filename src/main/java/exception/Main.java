package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List <Integer> list;


    public static void main(String[] args) throws Odd {
//        task1();
//        task2(1);
//        try {
//            task3("src/main/java/File.txt");
//        }catch (FileNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//        try {
//            task4("src/main/java/File.txt");
//            boolean isPizitiv = false;
//            int pozitiveNum = 0;
//            for(Integer element : list){
//                if (element > 0){
//                    isPizitiv = true;
//                    pozitiveNum = element;
//                }
//            }
//            if (isPizitiv) throw new PositivException(pozitiveNum);
//            System.out.println("All numbers are non-positive.");
//        }catch (FileNotFoundException | PositivException e){
//            System.out.println("Error: Positive number found: " + e.getMessage());
//        }
//        try {
//            task5("src/main/java/File.txt");
//
//        }catch (FileNotFoundException | FileIsEmpty e){
//            System.out.println(e.getMessage());
//        }
//        try {
//            task6("src/main/java/File.txt");
//            int dupl = 0;
//            boolean isDif = true;
//            for(int i = 0; i < list.size();i++){
//                int num = list.get(i);
//                for(int j = i + 1; j < list.size();j++){
//                    int num1 = list.get(j);
//                    if (num1 == num){
//                        isDif = false;
//                        dupl = num;
//                        break;
//                    }
//                }
//            }
//            if (!isDif){
//                throw new NonDifNum(dupl);
//            }
//        }catch (FileNotFoundException e){
//            System.out.println(e.getMessage());
//        }catch (NonDifNum e){
//            System.out.println("File contains a duplicate " + e.getMessage());
//        }
        try {
            task7("vde");
        } catch (NoVowelsException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void task1(){
        try {
            int i = 5;
            int a = i / 0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void task2(int num) throws Odd {
        if (num % 2 != 0) throw new Odd("The number is less then 0", num);
        System.out.println("The pozetiv number is" + num);
    }
    public static void task3(String fileName)throws FileNotFoundException{
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        // Read and process the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }
    public static void task4(String fileName)throws FileNotFoundException{
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        list = new ArrayList<>();
        // Read and process the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            list.add(Integer.parseInt(line));
        }
        scanner.close();
    }

    public static void task5(String fileName) throws FileNotFoundException, FileIsEmpty {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        if (!scanner.hasNextLine()){
            throw new FileIsEmpty("File is empty");
        }
        // Read and process the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
    public static void task6(String fileName)throws FileNotFoundException{
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        list = new ArrayList<>();
        // Read and process the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            list.add(Integer.parseInt(line));
        }
        scanner.close();
    }
    public static void task7(String line) throws NoVowelsException {
        boolean containVowels = false;
        String vowel = "aeiouAEIOU";
        for (int i = 0; i < line.length();i++){
            char ch = line.charAt(i);
            if (vowel.contains(String.valueOf(ch))){
                containVowels = true;
                break;
            }
        }
        if(!containVowels){
            throw new NoVowelsException("String does not contain any vowels.");
        }
    }
}
