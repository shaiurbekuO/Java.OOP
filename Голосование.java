import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = sc.nextInt() == 1 ? true : false;
        boolean s = sc.nextInt() == 1 ? true : false;
        boolean t = sc.nextInt() == 1 ? true : false;
        System.out.println(election(f, s, t));
    }
    static boolean election(boolean ... bools){
        int trus = 0;
        int fals = 0;
        for(int i=0; i<3; i++){
            if(bools[i] == true){
                trus++;
            }else{ fals++; }
        }
        if(trus>fals){
            return true;
        }if(fals>trus){
            return false;
        }
        return true;
    
    }
        

}