import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        int x = sc.nextInt();
        perimeter(figure, x);
        area(figure, x);
    }
    private static void area(String figure, int x){
	    if("Круг".equals(figure)){
	        System.out.println((int) Math.ceil(Math.PI * Math.pow(x, 2)));
	    }else {
	        System.out.println((int) Math.ceil(x*x));
	    }
	}
	private static void perimeter(String figure, int x){
	    if("Квадрат".equals(figure)){
	        System.out.println(4*x);
	    }else{
	        System.out.println((int) Math.ceil(Math.PI*x*2));
	    }
	}
    //разместите свои функции, например здесь
}