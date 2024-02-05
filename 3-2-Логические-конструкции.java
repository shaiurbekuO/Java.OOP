import java.util.Scanner;
class MyProgram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
        System.out.print(x%2+y%2+z%2==1);
	}
}