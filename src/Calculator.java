import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double operand1 = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        double operand2 = scanner.nextDouble();
        switch (operation) {
            case '+':
                System.out.println("Результат: " + (operand1 + operand2));
                break;
            case '-':
                System.out.println("Результат: " + (operand1 - operand2));
                break;
            case '*':
                System.out.println("Результат: " + (operand1 * operand2));
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                } else {
                    System.out.println("Результат: " + (operand1 / operand2));
                }
                break;
            default:
                System.out.println("Ошибка: неподдерживаемая операция!");
                break;
        }
        scanner.close();
    }
}