import java.util.Scanner;

public class calculato {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double oneN = scanner.nextDouble();

        System.out.println("Введите операцию(+, -, *, /):");
        String oper = scanner.next();

        System.out.println("Введите второе число:");
        Double twoN = scanner.nextDouble();

        double result = 0;

        switch (oper) {
            case "+":
                result = oneN + twoN;
                break;
            case "-":
                result = oneN - twoN;
                break;
            case "*":
                result = oneN * twoN;
                break;
            case "/":
                if (oneN != 0) {
                    result = oneN / twoN;
                } else {
                    System.out.println("Делить на ноль нельзя");
                }
                break;
            default:
                System.out.println("Неверная опреация");
                break;
        }
        System.out.println(result);
    }
}
