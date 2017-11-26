import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {

	Student s = new Student("Fredrik", "Mellgren", 20, 'M', 8.0, 8.8, 6.1);
	
	@Test
	public void testGetAndSetFirstGrade() {
		s.setFirstGrade(5.2);
		assertEquals(s.getFirstGrade(), 5.2, 1);
	}

	@Test
	public void testGetAndSetSecondGrade() {
		s.setSecondGrade(5.2);
		assertEquals(s.getSecondGrade(), 5.2, 1);
	}
	
	@Test
	public void testGetAndSetThirdGrade() {
		s.setThirdGrade(5.2);
		assertEquals(s.getThirdGrade(), 5.2, 1);
	}

	@Test
	public void testGetAndSetAverageGrade() {
		s.setAverageGrade(5.2);
		assertEquals(s.getAverageGrade(), 5.2, 1);
	}

	@Test
	public void testCalculateAverage() {
//		s.setAverageGrade(5.2);
//		assertEquals(s.getAverageGrade(), 5.2, 1);
	}
}
