package shape;

import java.util.Arrays;

public class Triangle implements Shape {
	
	private final double[] s = new double[3];
	
	Triangle(double s1, double s2, double s3) {
		if (s1 < 0 || s2 < 0 || s3 < 0) {
			throw new IllegalArgumentException("Lengths cannot be negative");
		}
		double[] temp = new double[3];
		temp[0] = s1;
		temp[1] = s2;
		temp[2] = s3;
		Arrays.sort(temp);
		if (temp[0] + temp[1] <= temp[2]) {
			throw new IllegalArgumentException("The length of the largest side must be less than the sum of the other two");
		} else {
			s[0] = s1;
			s[1] = s2;
			s[2] = s3;
			Arrays.sort(s);
		}
	}
	
	public double[] getSides() {
		return s;
	}
	/*
	 * Heron's Formula
	 */
	@Override
	public double getArea() {
		double p = getPerimeter()/2;
		return Math.sqrt(p*(p-s[0])*(p-s[1])*(p-s[2]));
	}

	@Override
	public double getPerimeter() {
		return s[0] + s[1] + s[2];
	}
	
	@Override
	public boolean equals(Object o) {
		Triangle t = (Triangle) o;
		return Arrays.equals(this.getSides(), t.getSides());
	}

}
