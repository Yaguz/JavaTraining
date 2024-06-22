package shapeWithInterfeces;

import java.util.function.Function;

public class SolidFromFunc extends SolidOfRevolution {
	private Function<Double, Double> func;
	private double a;
	private double b;
	
	public SolidFromFunc(Function<Double, Double> func, double a, double b) {
		super(b - a);
		this.func = func;
		this.a = a;
		this.b = b;
	}

	@Override
	public double getVolume() {
		int iter = 10000;
		double delta = (b - a) / iter;
		Double res = 0.0;
		
		for(int i = 0; i < iter; i++) {
			res += delta * Math.pow(func.apply(a + i * delta), 2); 
		}
		
		res *= Math.PI;
		
		return res;
	}

}
