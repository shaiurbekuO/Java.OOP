import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		System.out.println(min(a, b, c, d));
	}
	static int min(int a, int b, int c, int d){
	    int mi = a;
	    if(b<mi)
	        mi=b;
	    if(c<mi)
	        mi=c;
	    if(d<mi)
	        mi=d;
	    return mi;
	}
}
