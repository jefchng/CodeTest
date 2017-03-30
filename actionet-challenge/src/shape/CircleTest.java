package shape;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgument() {
		new Circle(-1);
	}
	
	@Test
	public void testPerimeter() {
		Circle c = new Circle(32);
		double p = c.getPerimeter();
		assertEquals(p, Math.PI * 64, 0);
	}
	
	@Test 
	public void testArea() {
		Circle c = new Circle(5);
		double a = c.getArea();
		assertEquals(25*Math.PI, a, 0);
	}
	

	@Test
	public void testSameCircles() {
		Circle c1 = new Circle(30);
		Circle c2 = new Circle(30);
		assertEquals(c1.getArea(), c2.getArea(), 0);
		assertEquals(c1.getPerimeter(), c2.getPerimeter(), 0);
		assertEquals(c1, c2);
	}

}
