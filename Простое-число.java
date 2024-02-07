import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        simple(a);
        simple(b);
        simple(c);
    }
    private static void simple(int a) {
        if (a >= -1 && a <= 1) {
            System.out.println("NO");
        } else if (a > 3 && (a % 2 == 0 || a % 3 == 0)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
    

    //разместите свою функцию, например здесь
}