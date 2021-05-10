
public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println("Id numaras� '" + instructor.getId() + "' olan Instructor eklendi..");
	}
	public void display(Instructor instructor) {
		System.out.println(instructor.getFirstname()
				+ instructor.getLastname()
				+ instructor.getEmail()
				+ instructor.getEditor()
				+ instructor.getInstructerLesson());
	}
	
}
