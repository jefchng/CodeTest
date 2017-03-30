package shape;

import java.util.Arrays;

public class Rectangle extends Quadrilateral { 
	
	Rectangle(double s1, double s2) {
		super(s1,s1,s2,s2);
	}

	public double getArea() {
		return s[0] * s[2];
	}

	@Override 
	public boolean equals(Object o) {
		Rectangle r = (Rectangle) o;
		return Arrays.equals(this.getSides(), r.getSides());
	}
}
