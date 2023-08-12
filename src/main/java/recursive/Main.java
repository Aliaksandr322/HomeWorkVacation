package recursive;

public class Main {
    public static void main(String[] args) {
//        System.out.println(task1(4));
//        System.out.println(task2(4));
        System.out.println(task3(9));
    }
    public static int task1(int n){
        int fact = 0;
        if (n == 1){
            return 1;
        }
        fact = task1(n - 1) * n;
        return fact;
    }
    public static int task2(int n){
        int result = 0;
        if (n == 1){
            return 1;
        }
        result = task2(n - 1) + n;
        return result;
    }
    public static int task3(int n){
        int result = 0;

        if (n == 1){
            return 1;
        }else if (n == 0){
            return 0;
        }
        result = task3(n - 1) + task3(n - 2);
        return result;
    }
}
