import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {

	// First chois to have all tests of the classes all methods in one case

	// Ska man bara testa med en person? Makes sense I guess. If it works with one
	// it might work for everybody?
	// Question: Is there a point to have all created persons here?
	Person p = new Person("Rafael", "Silva", 30, 'M');

	@Test
	public void testGetAge() {

		assertEquals(p.getAge(), 30);
	}
	
	@Test
	public void testGetFirstName() {

		assertEquals(p.getFirstName().equals("Rafael"), true);
	}

	//Can you only test get methods? Because they setters don't have a return? Look into later
//	@Test
//	public void testSetFirstName() {
//
//		assertEquals(p.setFirstName().equals("Rafael"), true);
//	}
	
	@Test
	public void testGetLastName() {

		assertEquals(p.getLastName().equals("Silva"), true);
	}
	
	@Test
	public void testGetGender() {

		assertEquals(p.getGender(),'M');
	}
}
