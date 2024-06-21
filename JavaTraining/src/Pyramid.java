
public class Pyramid extends Shape {
	private double s;
	private double h;
	
	public Pyramid(double s, double h) {
		super(s * h * 4 / 3);
		this.h = h;
		this.s = s;
	}
}
