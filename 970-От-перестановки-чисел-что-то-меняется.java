import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
		if(n1+n2==n3){
		    System.out.println("YES");
		}else if(n1+n3==n2){
		    System.out.println("YES");
		}else if(n2+n3==n1){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
	}
}
