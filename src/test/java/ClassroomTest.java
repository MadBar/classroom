import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;

public class ClassroomTest {

	// Raf does all tests of get and set in one test. Practice that, later!

	// ("TEST15", "Spring 16", students);�
	Student student1 = new Student("Rafael", "Silva", 20, 'M', 3.1, 5.4, 6.2);
	Student student2 = new Student("Fredrik", "Mellgren", 20, 'M', 8.0, 8.8, 6.1);
	// Student stu = new Student("sdf", "sdf", 30, 'M');

	// Den h�r skapas b�de f�r att fylla classroom s� vi kan anv�nda den f�r alla
	// metoder. Samt f�r att kunna set and getStudents.
	ArrayList<Student> students = new ArrayList<Student>();

	// Classroom cr = new Classroom("English", "Fall 17", new ArrayList<Student>());
	Classroom cr = new Classroom("English", "Fall 17", students);

	@Test
	public void testGetAndSetClassroomName() {
		cr.setClassroomName("Java");
		assertEquals(cr.getClassroomName().equals("Java"), true);

	}

	@Test
	public void testGetAndSetClassroomTerm() {
		// cr.setClassroomTerm("Spring 18");
		// assertEquals(cr.getClassroomTerm().equals("Spring 18"), true);

		cr.setClassroomTerm("Spring 18");
		assertEquals(cr.getClassroomTerm().equals("Spring 18"), true);
	}

	@Test
	public void testGetAndSetStudents() {
		// This needs to be filled... But with what?
		// Varf�r funkar inte detta:
		// Student student2 = new Student("Fredrik", "Mellgren", 20, 'M', 8.0, 8.8,
		// 6.1);

		// I think this should work, since its the same principle as the methods with ex
		// Strings. Filled directly in get method. But Arraylists work differently.
		// Needs to be creted outside og get. I create it outside ot method since I use
		// it in other methods aswell. Otherwise it could probably be created here.
		// cr.csetStudents(ArrayList<Student> students = new ArrayList<Student>());

		// Why works?
		// ArrayList<Student> students = new ArrayList<Student>();
		cr.setStudents(students);

		// Why not work?
		// assertArrayEquals(cr.getStudents(), students);
		// assertEquals(cr.getStudents().equals(students), true);
		// Also works, with of under and above is best/correct
		assertEquals(cr.getStudents(), students);

		// assertArrayEquals(cr.getStudents(), Student);
		// assertEquals(cr.getClassroomTerm().equals("Spring 18"), true);

	}

	// Works but not pretty haha.
	@Test
	public void testANewStudent() {

		cr.addANewStudent(student1);

		// ---------------------------------------
		// Man kanske m�ste h�mta en student 1 i arrayen f�r att kunna kolla om den
		// finns
		// Inte s� h�r:
		boolean yes = cr.getStudents().contains(student1);
		// assertEquals(cr.addANewStudent(student1), yes);

		// On�digt:?
		// Student studentTest = new Student("Emmet", "Trollqvist", 5, 'M');

		// ---------------------------------------
		// G�r Add med student1.
		// Assert that arraylist contains student1
		// assertTrue(cr.addANewStudent(student1), yes);
		// assertThat(stu,(Integer)resizingArray.at(resizingArray.length()-1),
		// equalTo(valueToAddOne));

		// Student studentTest = cr.getStudents().contains(student1);

		// assertThat((cr.getStudents().indexOf(0)), true);

		// ---------------------------------------------------

		if (yes) {
			String appWentHere = "yey!";
		}

	}

	@Test
	public void testRemoveAStudent() {

		// For security should you create a ned classroom and fill a new arraylist with
		// add new student?

		// For security create new student. Don't know if tests..? Not like this:
		// cr.addANewStudent(student1);

		// cr.removeAStudent("");
		// String student1Name = cr.ge

		// student1. ("Emmet");
		// String studentName = "Rafael";
		// student1.getFirstName();
		// boolean yes = false;

		// if ("Emmet" == student1.getFirstName()) {
		// String appWentHere = "yey!";
		// }else {
		// String appWentHere = "Emmet didn't exist";
		// }

		// Kolla om
		// if ("Emmet" == student1.getFirstName()) {
		// yes = true;
		// }

		// ------------------------------------
		// Student studentTest = null;
		// boolean studentExists = false;
		// // G� igenom listan efter Emmet f�r att sedan kunna ta bort den. Sedan m�ste
		// vi
		// // testa om borttagen
		// for (int i = 0; i < this.students.size(); i++) {
		// student1 = this.students.get(i);
		// if (student1.getFirstName().contains("Emmet")) {
		// studentExists = true;
		// System.out.println("Student Emmet existed");
		// this.students.remove(i);
		// }
		// }
		//
		// if (!studentExists) {
		// System.out.println("The student does not exist!");
		// }
		//
		// for (int i = 0; i < this.students.size(); i++) {
		// student1 = this.students.get(i);
		// if (student1.getFirstName().contains("Emmet")) {
		// System.out.println("Student Emmet still exist");
		// } else {
		// studentExists = false;
		// }
		// }
		//
		// if (!studentExists) {
		// System.out.println("The student does not exist!");
		// }

		// --------------------------------------
		// Olika senarion att testa:
		// 1. Om add inte lyckades fr�n b�rjan s� det inte fanns n�got att testa. Fail
		// 2. Om add fungerade, s� student exist �ndrades till true, men remove inte
		// fungerade och remove fortsatte vara false. Failed test
		// 3. Om add fungerade, s� student exist �ndrades till true, och remove
		// fungerade och remove blev tru l�ngre ned. Success
		//
		//
		//
		// metoden remove g�r att kolla med en boolean i en ifsats f�r att se vilken v�g
		// prog tar. metoden f�r ett namn. Vi m�ste skapa ett eget s� vi m�ste skapa en
		// student som har ett namn:
		cr.addANewStudent(student1);
		boolean studentExists = false;
		boolean studentShouldBeRemoved = false;
		boolean studentRemoved = false;
		Student loopStudent = null;
		String name = student1.getFirstName();

		// VARI: kan anv�nda studentexist som ocks� �r false fr�n b�rjan?
		if (!studentRemoved) {
			// Kolla igenom listan om studenten �r inlaggd/exists:
			for (int i = 0; i < this.students.size(); i++) {
				loopStudent = this.students.get(i);
				// om add lyckats g�r prog in h�r:
				if (loopStudent.getFirstName().contains(name)) {
					studentExists = true;
					// Tar bort den
					this.students.remove(i);
					studentShouldBeRemoved = true;
					System.out.println("Student " + name + " Should be removed!");

				}
			}
			// efter kollat hela listan och den inte finns: om ej g�tt in i if, har ej tagit
			// bort
			if (!studentExists) {
				System.out.println("The student didn't exist, so nothing to remove. Add failed?");
			}

			// Kolla igenom listan igen f�r verifiera att verkligen inte finns l�ngre:
			for (int i = 0; i < this.students.size(); i++) {
				loopStudent = this.students.get(i);

				if (loopStudent.getFirstName().contains(name)) {
					studentExists = true;

					System.out.println("Student " + name + "still exist!");
				}
			}
			if (!studentRemoved) {
				System.out.println("Remove failed test");
			}
			if(studentShouldBeRemoved) {
				for (int i = 0; i < this.students.size(); i++) {
					loopStudent = this.students.get(i);

					if (loopStudent.getFirstName().contains(name)) {
						studentExists = true;

						System.out.println("Student " + name + "still exist!");
					}
				}
				if(studentRemoved) {
					
				}
				
			}

		}
		// //oavsett om stuidentExist �r false eller true. removed or not
		// if(!studentRemoved){
		// //Kolla igenom listan om studenten �r fortfarande exists:
		// for (int i = 0; i < this.students.size(); i++) {
		// loopStudent = this.students.get(i);
		//
		// if (loopStudent.getFirstName().contains(name)) {
		// System.out.println("Student " + name + "still exist!");
		//
		// studentExists = true;
		// }
		// }
		// if (!studentExists) {
		// System.out.println("The student does not exist!");
		// studentRemoved = true;
		// }
		// }
		// if(studentExists) {
		// System.out.println("Remove failed test");
		// }
		//
	}
}
