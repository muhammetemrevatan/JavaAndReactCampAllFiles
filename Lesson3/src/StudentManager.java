
public class StudentManager extends UserManager{
	public void add(Student student) {
		System.out.println("Id numarası '" + student.getId() + "' olan Student Eklendi..");
	}
	public void display(Student student) {
		System.out.println(student.getFirstname() 
				+ student.getLastname() 
				+ student.getEmail() 
				+ student.getLessons());
	}
	public void multipleAdd(Student[] students) {
		for(Student student : students) {
			add(student);
		}
	}
}
