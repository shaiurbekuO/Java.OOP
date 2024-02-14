import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ball = 0;
		
		for(int i=0; i<n; i++){
		    int number1 = sc.nextInt();
		    int number2 = sc.nextInt();
		    int number3 = sc.nextInt();
		    
		int sum = number1+number2+number3;
		    if(sum>=2){
		        ball++;
		    }
		}
		System.out.println(ball);
	}
}
