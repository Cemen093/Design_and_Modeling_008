import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        Реализовать калькулятор с использованием GitFlow
//        Версии :
//        1.0.0 - действия + и -
//        2.0.0 - действия * и /
//        2.1.0 - пофиксить / на ноль 0
//        3.0.0 - добавлены действия > и <
//        3.0.1 - добавлены действия >= и <=
                Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("exit? y/n");
            if (scanner.nextLine().equals("y")){
                System.out.println("By");
                break;
            }

            int a;
            int b;
            try {
                System.out.print("input a >> ");
                a = Integer.parseInt(scanner.nextLine());

                System.out.print("input b >> ");
                b = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception){
                System.out.println("not a number");
                continue;
            }

                System.out.print("input operation >> ");
                String operation = scanner.nextLine();

                String result;
            switch (operation) {
                case "+" -> result = addition(a, b);
                case "-" -> result = subtraction(a, b);
                case "*" -> result = multiplication(a, b);
                case "/" -> result = division(a, b);
                default -> {
                    System.out.println("operation don't found");
                    continue;
                }
            }
                System.out.println("result=" + result);
        }
    }

    private static String addition(int a, int b){
        return String.valueOf(a + b);
    }

    private static String subtraction(int a, int b){
        return String.valueOf(a - b);
    }

    private static String multiplication(int a, int b){
        return String.valueOf(a * b);
    }

    private static String division(int a, int b){
        if (b != 0)
            return String.valueOf(a / b);
        return "result is not defined";
    }
}
