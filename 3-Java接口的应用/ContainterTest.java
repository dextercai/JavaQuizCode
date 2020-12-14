
public class ContainterTest {

	static double totalArea(Container c[]){
		double result = 0;
		for (Container container : c) {
			result += container.area();
		}
		return result;
	}
	static double totalVolume(Container c[]){
		double result = 0;
		for (Container container : c) {
			result += container.volume();
		}
		return result;
	}
	public static void main(String[] args) {
		Container c[] = new Container[3];
		c[0] = new Cube(3);
		c[1] = new Sphere(2);
		c[2] = new Cylinder(5, 6);
		for (Container container : c) {
			System.out.println(container.area() + " " + container.volume());
		}
		System.out.println("总面积: " + totalArea(c));
		System.out.println("总体积: " + totalVolume(c));
	}

}
