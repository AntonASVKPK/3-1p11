import java.util.Scanner;

public class chet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введитете числа: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

    }
}
