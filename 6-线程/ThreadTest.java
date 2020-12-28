
class Thread1 extends Thread {
	public void run() {
		for(int year = 2000; year <= 2100; year++){
			if((year%4 == 0 && year % 100 != 0) || year % 400 == 0){
				System.out.println(year + "是闰年");
			}
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
class Thread2 extends Thread {
	public void run() {
		for(int num = 100; num <= 200; num++){
			if(this.isPrimer(num)){
				System.out.println(num + "是素数");
			}
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	Boolean isPrimer(int num){
		int i,j;
		j = (int) Math.sqrt(num);
		for(i = 2; i<=j; i++){
			if(num % i == 0){
				break;
			}
		}
		if(i>j){
			return true;
		}else{
			return false;
		}
	}
}
class Thread3 extends Thread {
	public void run() {
		for(int num = 1; num <= 10; num++){
			System.out.println(num + "的阶乘为" + this.Fact(num));
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	int Fact(int num){
		if(num == 1){
			return 1;
		}else{
			return num * this.Fact(num - 1);
		}
	}
}
public class ThreadTest {
	public static void main(String[] args) {
		Thread1 t1= new Thread1();
		Thread2 t2= new Thread2();
		Thread3 t3= new Thread3();
		t1.start();
		t2.start();
		t3.start();
	}
}