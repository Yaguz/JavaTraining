import java.util.ArrayList;

public class Box extends Shape {
	ArrayList<Shape> shapes = new ArrayList<Shape>();
	private double allValue;
	
	public Box(double volume) {
		super(volume);
		allValue = volume;
	}
	
	public boolean add(Shape shape) {
		if(shape.getVolume() < allValue) {
			shapes.add(shape);
			allValue -= shape.getVolume();
			return true;
		} else {
			return false;
		}
		
	}
}
