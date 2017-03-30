package shape;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgument1() {
		new Rectangle(-1,2);
	}
	
	@Test
	public void testPerimeter1() {
		Rectangle r = new Rectangle(17.3, 21.5);
		double p = r.getPerimeter();
		assertEquals(p, 77.6, 0);
	}
	
	@Test
	public void testPerimeter2() {
		Rectangle r = new Rectangle(1./3, 1./3);
		double p = r.getPerimeter();
		assertEquals(Double.compare(p, 4./3), 0);
	}
	
	@Test 
	public void testArea1() {
		Rectangle r = new Rectangle(5, 6);
		double a = r.getArea();
		assertEquals(30, a, 0);
	}
	
	@Test
	public void testArea2() {
		Rectangle r = new Rectangle(1./3, 1./3);
		double a = r.getArea();
		assertEquals(0, Double.compare(a, 1./9));
	}

	@Test
	public void testSameRectangles() {
		Rectangle r1 = new Rectangle(10, 4);
		Rectangle r2 = new Rectangle(4, 10);
		assertEquals(r1.getArea(), r2.getArea(), 0);
		assertEquals(r1.getPerimeter(), r2.getPerimeter(), 0);
		assertEquals(r1, r2);
	}
}
