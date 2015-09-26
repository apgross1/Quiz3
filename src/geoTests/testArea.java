package geoTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import geoProj.Triangle;

public class testArea {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAreas() {
		Triangle triangle1 = new Triangle(15.0, 34.0, 22.0);
		assertEquals(121.39, triangle1.getArea(), .5);
		
		Triangle triangle2 = new Triangle(3.0, 4.0, 5.0);
		assertTrue("Did not work", triangle2.getArea() == 6.0);
		
	}

}
