import java.util.Scanner;


public class Box {
	private double length, width, height, prop;
	public Box(){
		this.length = this.width = this.height = this.prop = 0;
	}
	public Box(double _l,double _w,double _h,double _p){
		this.length = _l;
		this.width = _w;
		this.height = _h;
		this.prop = _p;
	}
	public void setLength(double _l){
		this.length = _l;
	}
	public void setWidth(double _w){
		this.width = _w;
	}
	public void setHeight(double _h){
		this.height = _h;
	}
	public void setProp(double _p){
		this.prop = _p;
	}
	public double get(){
		return this.length;
	}
	public double setWidth(){
		return  this.width;
	}
	public double getHeight(){
		return this.height;
	}
	public double getProp(){
		return this.prop;
	}
	
	public double getVol(){
		return this.length * this.width * this.height;
	}
	
	public double getWeight(){
		return this.getVol() * this.prop;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入长宽高以及密度");
		double l,w,h,p;
		l = in.nextDouble();
		w = in.nextDouble();
		h = in.nextDouble();
		p = in.nextDouble();
		Box b = new Box(l,w,h,p);
		System.out.println("Length:" + l + " Width:" + w + " Height:" + h + " Prop:" + p);
		System.out.println("Vol:" + b.getVol());
		System.out.println("Weight:" + b.getWeight());
		
	}
}
