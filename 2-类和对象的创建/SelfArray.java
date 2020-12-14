
public class SelfArray {
	private int[] a;
	private int l;
	public SelfArray(){
		this.l = 10;
		this.a = new int[this.l];
		for(int i = 0; i < this.l; i++){
			this.a[i] = (int)(Math.random() * 100 + 1);
		}
	}
	public SelfArray(int[] _a, int _l){
		this.a = new int[_l];
		this.a = _a;
		this.l = _l;
	}
	public void setLength(int _l){
		this.l = _l;
	}
	
	public void setA(int[] _a){
		this.a = _a;
	}
	public void output(){
		System.out.println("总长度：" + this.l + "各元素为：");
		for(int i = 0; i < this.l; i++){
			System.out.print(this.a[i] + " ");
		}
		System.out.print("\r\n");
	}
	public int max(){
		int max = this.a[0];
		for(int i = 1; i < this.l; i++){
			if(this.a[i] > max){
				max = this.a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		SelfArray Sa = new SelfArray();
		Sa.output();
		System.out.println("Max: " + Sa.max());
	}

}
