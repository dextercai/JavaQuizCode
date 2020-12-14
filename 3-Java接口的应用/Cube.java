
public class Cube implements Container {
	double radius;
	Cube(double r){
		this.radius = r;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 6 * this.radius * this.radius;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return Math.pow(radius, 3);
	}

}
