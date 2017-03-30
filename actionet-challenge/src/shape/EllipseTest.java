package shape;

import static org.junit.Assert.*;

import org.junit.Test;

public class EllipseTest {
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgument() {
		new Ellipse(-1, 1);
	}
	
	@Test
	public void testPerimeter() {
		Ellipse e = new Ellipse(3, 10);
		double p = e.getPerimeter();
		double expected = 43.8591; // via google
		assertEquals(p, expected, 0.0001);
	}
	
	@Test 
	public void testArea() {
		Ellipse e = new Ellipse(5, 10);
		double a = e.getArea();
		assertEquals(50*Math.PI, a, 0);
	}
	

	@Test
	public void testSameEllipses() {
		Ellipse e1 = new Ellipse(3, 4);
		Ellipse e2 = new Ellipse(3, 4);
		assertEquals(e1.getArea(), e2.getArea(), 0);
		assertEquals(e1.getPerimeter(), e2.getPerimeter(), 0);
		assertEquals(e1, e2);
	}

}
