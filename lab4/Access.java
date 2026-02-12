import java.util.Scanner;

public class Access {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("Доступ разрешён");
        else
            System.out.println("Доступ запрещён");
    }
}