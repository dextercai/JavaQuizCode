
public class Cylinder implements Container {
	double radius, height;
	Cylinder(double r, double h){
		this.radius = r;
		this.height = h;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI * Math.pow(this.radius, 2) + this.height * 2 * PI * this.radius;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return PI * Math.pow(this.radius, 2) * this.height;
	}

}
