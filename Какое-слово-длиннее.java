import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        twoWords(s1, s2);
    }
    static void twoWords(String s1, String s2){
        System.out.println((s1.length() > s2.length() ? "Первая строка длиннее" :
            ((s2.length() > s1.length() ? "Вторая строка длиннее" : "Равная длина"))));

    }
}