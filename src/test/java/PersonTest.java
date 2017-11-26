import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {

	// First chois to have all tests of the classes all methods in one case

	// Ska man bara testa med en person? Makes sense I guess. If it works with one
	// it might work for everybody?
	// Question: Is there a point to have all created persons here?
	Person p = new Person("Rafael", "Silva", 30, 'M');

	// Needed to look. I made seperate tests for get and set and couldn't figure out
	// the setter
	@Test
	public void testSetAndGetAge() {
		// Guess we test the setter by setting a new value and then extracting that with
		// the get
		p.setAge(25);
		assertEquals(p.getAge(), 25);
	}

	@Test
	public void testGetAndSetFirstName() {
		p.setFirstName("Mad");
		assertEquals(p.getFirstName().equals("Mad"), true);
	}

	// Can you only test get methods? Because they setters don't have a return? Look
	// into later
	// @Test
	// public void testSetFirstName() {
	// String value = p.getFirstName();
	// assertEquals(p.setFirstName().equals(value), true);
	// }

	@Test
	public void testGetAndSetLastName() {
		p.setLastName("Bar");
		assertEquals(p.getLastName().equals("Bar"), true);
	}

	@Test
	public void testGetAndSetGender() {
		p.setGender('F');
		assertEquals(p.getGender(), 'F');
	}
}
