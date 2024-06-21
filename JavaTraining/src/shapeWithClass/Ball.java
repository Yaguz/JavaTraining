package shapeWithClass;

public class Ball extends SolidOfRevolution {
	
	public Ball(double radius) {
		super(radius);
	}
	
	@Override
	public double getVolume() {
		double radius = getRadius();
		return (4 * Math.PI * Math.pow(radius, 3) / 3);
	}
}
