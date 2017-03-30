package shape;

import java.util.Arrays;

public abstract class Quadrilateral implements Shape {
	protected final double[] s = new double[4];
	
	Quadrilateral(double s1, double s2, double s3, double s4) {
		double[] temp = {s1, s2, s3, s4};
		Arrays.sort(temp);
		if (s1 < 0 || s2 < 0 || s3 < 0 || s4 < 0) {
			throw new IllegalArgumentException("Sides must be of positive length");
		} else if (temp[0] + temp[1] + temp[2] <= temp[3]) {
			throw new IllegalArgumentException("The length of the largest side must be less than the sum of the other three");
		} else {
			s[0] = s1;
			s[1] = s2;
			s[2] = s3;
			s[3] = s4;
			Arrays.sort(s);
		}
	}
	
	public double[] getSides() {
		return s;
	}

	@Override
	public abstract double getArea();

	@Override
	public double getPerimeter() {
		return s[0] + s[1] + s[2] + s[3];
	}
	
}
