import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        simpleAB(x, y);
    }
    static void simpleAB(int a, int b){
        for(int i = a; i <= b; i++){
            System.out.println(i == 1 ? "1 - 1" :
                               (i > 3 && (i % 2 == 0 || i % 3 == 0) ? i + " - составное" : i + " - простое"));
        }
    }
    //разместите свои функции, например здесь
}