package shape;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgument1() {
		new Square(-1);
	}
	
	@Test
	public void testPerimetes1() {
		Square s = new Square(17);
		double p = s.getPerimeter();
		assertEquals(p, 17*4, 0);
	}
	
	@Test
	public void testPerimetes2() {
		Square s = new Square(1./3);
		double p = s.getPerimeter();
		assertEquals(Double.compare(p, 4./3), 0);
	}
	
	@Test 
	public void testArea1() {
		Square s = new Square(5);
		double a = s.getArea();
		assertEquals(25, a, 0);
	}
	
	@Test
	public void testArea2() {
		Square r = new Square(1./3);
		double a = r.getArea();
		assertEquals(0, Double.compare(a, 1./9));
	}

	@Test
	public void testSameSquares() {
		Square s1 = new Square(14);
		Square s2 = new Square(14);
		assertEquals(s1.getArea(), s2.getArea(), 0);
		assertEquals(s1.getPerimeter(), s2.getPerimeter(), 0);
		assertEquals(s1, s2);
	}
}
