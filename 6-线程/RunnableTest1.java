
class Run1 implements Runnable {
	public void run() {
		for(int year = 2000; year <= 3000; year++){
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
class Run2 implements Runnable {
	public void run() {
		for(int num = 100; num <= 200; num++){
			if(num % 3 ==0){
				System.out.println(num + "被3整除");
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
class Run3 implements Runnable {
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
public class ThreadTest1 {
	public static void main(String[] args) {
		new Thread(new Run1()).start();
		new Thread(new Run2()).start();
		new Thread(new Run3()).start();
	}
}