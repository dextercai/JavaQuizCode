
public class Sphere implements Container {
	double radius;
	Sphere(double r){
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
		return 4 * PI * Math.pow(this.radius, 2);
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 4/3 * PI * Math.pow(this.radius, 3);
	}

}
