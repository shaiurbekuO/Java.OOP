import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        multiply(a, b, c);
    }
    static void multiply(int a, int b, int c){
      int  sum = a*b*c;
        System.out.println(sum);
    }

}