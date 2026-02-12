import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = sc.nextDouble();

        System.out.print("Введите операцию (+ - * /): ");
        char op = sc.next().charAt(0);

        System.out.print("Введите второе число: ");
        double b = sc.nextDouble();

        double result;

        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/':
                if (b != 0)
                    result = a / b;
                else {
                    System.out.println("Деление на ноль!");
                    return;
                }
                break;
            default:
                System.out.println("Неизвестная операция");
                return;
        }

        System.out.println("Результат: " + result);
    }
}