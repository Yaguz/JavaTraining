package shapeWithInterfeces;

public class Pyramid implements Shape {
	private double s;
	private double h;
	
	public Pyramid(double s, double h) {
		this.h = h;
		this.s = s;
	}

	@Override
	public double getVolume() {
		return (s * h * 4 / 3);
	}
}
