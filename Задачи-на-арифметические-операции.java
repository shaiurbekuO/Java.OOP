import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // рубли
        int b = scanner.nextInt(); // копейки
        int n = scanner.nextInt();
        int totalCostInKopeks = (a * 100 + b) * n;
        int rubles = totalCostInKopeks / 100;
        int kopeks = totalCostInKopeks % 100;
        
        // Выводим результат
        System.out.println(rubles + " " +kopeks);
    }
}
