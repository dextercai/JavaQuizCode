package e1;

import java.util.Scanner;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static Boolean isPrimenum(int n){
		int k = (int) Math.sqrt(n);
		for(int i = 2; i <= k; i++){
			if (n % i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("输入一个数：");
		a = in.nextInt();
		if(isPrimenum(a)){
			System.out.println("是素数");
		}else{
			System.out.println("不是素数");
		}

	}
}
