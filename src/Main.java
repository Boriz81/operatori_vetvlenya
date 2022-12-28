import java.util.Scanner;

public class Main {
    public static void function1() {
        System.out.println("exit");
    }
    public static String function2() {
        return "exit";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 0;
        int n = 0;

        while (i * i <= input) {

            System.out.println(i * i);
            if (n == 5) {
               // обрываем цикл по условию и перешли к функции function1()
                function1();
                break;
            }
            n++;
            i++;
        }
        // инициализировали переменную по условию и перешил к функции function1()
        String secondFunction = function2();
        System.out.println(secondFunction);
    }
}


/*
import java.util.Scanner;

public class Main {
    public static void function1() {
        System.out.println("exit");
    }
    public static String function2() {
        return "exit";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 0;
        int n = 0;

        while (i * i <= input) {

            System.out.println(i * i);
            if (n == input) {


                break;
            }
            n++;
            i++;
        }
        function1();
    }
}*/
