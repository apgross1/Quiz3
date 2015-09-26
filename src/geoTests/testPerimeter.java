package geoTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import geoProj.Triangle;


public class testPerimeter {

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
	public void testPerimeters() {
		Triangle triangle1 = new Triangle(15.0, 34.0, 22.0);
		assertEquals(71.0, triangle1.getPerimeter(), 0);
		
		Triangle triangle2 = new Triangle(3.0, 4.0, 5.0);
		assertTrue("Did not work", triangle2.getPerimeter() == 12.0);
		
	}

}
