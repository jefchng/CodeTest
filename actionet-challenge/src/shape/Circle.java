package shape;

public class Circle implements Shape {
	private final double r;

	Circle(double radius) {
		if (radius < 0) {
			throw new IllegalArgumentException("Radius of circle cannot be negative");
		} else {
			r = radius;
		}
	}
	
	public double getRadius() {
		return r;
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(r, 2);
	}

	@Override
	public double getPerimeter() {
		return Math.PI * r * 2.0;
	}
	
	@Override
	public boolean equals(Object o) {
		Circle c = (Circle) o;
		
		return r == c.getRadius();
	}

}
