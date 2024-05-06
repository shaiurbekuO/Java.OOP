import java.util.Scanner;

class Example{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] mas = new int[n][];
        for (int i = 0; i < n; i++){
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            int[] a = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++)
                a[j] = Integer.parseInt(numbers[j]);
            mas[i] = a;
        }
        int ans = find_0(mas);
        if (ans != -1)
            System.out.println("0 in " + (ans+1) + " line");
        else
            System.out.println("0 not found");}
    
    
         static int find_0(int[][] mas){
        for(int i = 0; i < mas.length;i++)
            for(int j = 0; j < mas[i].length;j++)
                if(mas[i][j] == 0)
                    return i;
        return -1;
    }

    //разместите свою функцию, например здесь
}