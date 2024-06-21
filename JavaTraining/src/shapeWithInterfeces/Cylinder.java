package shapeWithInterfeces;

public class Cylinder extends SolidOfRevolution {

	double height;
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	@Override
	public double getVolume() {
		double radius = this.getRadius();
		return (Math.PI * radius * radius * height);
	}
}
