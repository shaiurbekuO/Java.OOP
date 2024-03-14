import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++)
            mas[i] = sc.nextInt();
        monneub(mas);
    }
    static void monneub (int [] mas) {
        int k = 1;
        int max = k;
        for (int i = 0; i < mas.length -1;i++) {
            if (mas[i] <= mas[i + 1]) {
                k++;
                if (k > max)
                    max = k;
            }
            else
                k = 1;
        }
        System.out.println(max);
    //разместите свою функцию, например здесь
}}