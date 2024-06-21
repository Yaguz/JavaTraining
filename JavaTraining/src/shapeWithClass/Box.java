package shapeWithClass;
import java.util.ArrayList;

public class Box extends Shape {
	ArrayList<Shape> shapes = new ArrayList<Shape>();
	private double allValue;
	private double Value;
	
	public Box(double volume) {
		allValue = volume;
		Value = volume;
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

	@Override
	public double getVolume() {
		return (Value);
	}
}
