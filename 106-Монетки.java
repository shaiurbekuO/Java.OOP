import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s0 = 0, s1 = 0;
		for(int i=0; i<n; i++){
		    int x = sc.nextInt();
		    if(x == 0){
		        s0++;
		    }else{
		        s1++;
		    }
		}
		System.out.println(Math.min(s0, s1));
	}
}
