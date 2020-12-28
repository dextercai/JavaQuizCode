import java.io.*;
import java.lang.Math;
public class DataDemo{
	public static void main(String[] args) {
		DataInputStream input = new DataInputStream(System.in);
		
		try{
			String in = input.readLine();
			int i,j;
			int num = Integer.parseInt(in, 10);
			j = (int) Math.sqrt(num);
			for(i = 2; i<=j; i++){
				if(num % i == 0){
					break;
				}
			}
			if(i>j){
				System.out.println(num + "is a prime number");
			}else{
				System.out.println(num + "is not a prime number");
				input.close();
			}
		}catch (IOException e) {
			
		}
	}
}