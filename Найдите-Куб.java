import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        boolean a = true;
        while (!s1.equals("СТОП")) { 
                if (s1.equals("Куб")) {
                a = false; 
            }

            s1 = sc.nextLine();
        }

        System.out.println(a == false ? "YES" : "NO");
    }
}