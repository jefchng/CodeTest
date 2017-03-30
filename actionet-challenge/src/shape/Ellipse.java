package shape;

public class Ellipse implements Shape {
	protected final double major;
	protected final double minor;
	
	Ellipse(double major, double minor) {
		if (major < 0 || minor < 0) {
			throw new IllegalArgumentException("Axes must be of positive length");
		} else {
			this.major = major;
			this.minor = minor;
		}
	}
	
	public double getMajor() {
		return major;
	}
	
	public double getMinor() {
		return minor;
	}
	
	@Override
	public double getArea() {
		return major * minor * Math.PI;
	}

	/*
	 * Ramanujan's Second Approximation
	 */
	@Override
	public double getPerimeter() {
		double h = Math.pow(major - minor, 2) / Math.pow(major + minor, 2);
		return Math.PI * (major + minor) * (1 + (3*h)/(10 + Math.sqrt(4-3*h)));
	}
	
	@Override
	public boolean equals(Object o) {
		Ellipse e = (Ellipse) o;
		return (Double.compare(this.getMajor(), e.getMajor()) == 0 && Double.compare(this.getMinor(), e.getMinor()) == 0); 

		
	}

}
