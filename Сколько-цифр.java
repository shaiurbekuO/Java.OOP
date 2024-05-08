import java.util.Scanner;
import java.io.*;
class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(digit_count(s));
    }
    static int digit_count(String s){
        return (s.replaceAll("[^0-9]", "").length());
    }
}