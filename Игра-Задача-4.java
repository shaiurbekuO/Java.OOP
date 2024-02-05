import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                System.out.println("198");
                break;
            case 2:
                System.out.println("297");
                break;
            case 3:
                System.out.println("396");
                break;
            case 4:
                System.out.println("495");
                break;
            case 5:
                System.out.println("594");
                break;
            case 6:
                System.out.println("693");
                break;
            case 7:
                System.out.println("792");
                break;
            case 8:
                System.out.println("891");
                break;
            case 9:
                System.out.println("990");
                break;
            default:
                System.out.println("Введенное число не соответствует условиям.");
        }
    }
}