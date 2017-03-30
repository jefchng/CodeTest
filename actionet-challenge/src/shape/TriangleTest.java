package shape;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgument1() {
		new Triangle(-1,2,3);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgument2() {
		new Triangle(1,2,3);
	}
	
	@Test
	public void testPerimeter1() {
		Triangle t = new Triangle(15,20.5,25.72);
		double p = t.getPerimeter();
		assertEquals(p, 61.22, 0);
	}
	
	@Test
	public void testPerimeter2() {
		Triangle t = new Triangle(1./3,1./3,1./3);
		double p = t.getPerimeter();
		assertEquals(Double.compare(p, 1), 0);
	}
	
	@Test 
	public void testArea1() {
		Triangle t = new Triangle(3,4,5);
		double a = t.getArea();
		assertEquals(6, a, 0);
	}
	
	@Test 
	public void testArea2() {
		Triangle t = new Triangle(1./3, 1./3, 1./3);
		double a = t.getArea();
		double p = t.getPerimeter()/2;
		assertEquals(0, Double.compare(a, Math.sqrt(p*Math.pow(p - 1./3, 3))));
	}

	@Test
	public void testSameTriangles() {
		Triangle t1 = new Triangle(3,4,5);
		Triangle t2 = new Triangle(4,3,5);
		assertEquals(t1.getArea(), t2.getArea(), 0);
		assertEquals(t1.getPerimeter(), t2.getPerimeter(), 0);
		assertEquals(t1, t2);
	}
}
