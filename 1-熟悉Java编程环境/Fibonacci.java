package e2;

public class Fb {

	public static int Fb(int n){
		if(n == 1 || n == 2){
			return 1;
		}else{
			return Fb(n - 1) + Fb(n - 2);
		}
		
	}
	public static void main(String[] args) {
		int n = 1;
		while(n <= 20){
			System.out.printf("%d \t",Fb(n));
			n++;
		}

	}

}
