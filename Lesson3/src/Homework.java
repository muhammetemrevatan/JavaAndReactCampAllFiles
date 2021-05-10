
public class Homework {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstname("Muhammet Emre");
		student1.setLastname(" VATAN");
		student1.setEmail(" muhammetemrevatan@gmail.com");
		student1.setLessons(" Java");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstname("Kenan");
		student2.setLastname(" MERİÇ");
		student2.setEmail(" kenanm@gmail.com");
		student2.setLessons(" C#");
		
		StudentManager studentManager = new StudentManager();
		Student[] students = {student1,student2};
		
		studentManager.multipleAdd(students);
		
		Instructor instructor1 = new Instructor(); 
		instructor1.setId(1);
		instructor1.setFirstname("Engin");
		instructor1.setLastname(" Demiroğ");
		instructor1.setEmail(" engindemirog@gmail.com");
		instructor1.setEditor(" düzenleyici");
		instructor1.setInstructerLesson(" JavaAndReactCamp");
		
		InstructorManager instructerManager = new InstructorManager();
		instructerManager.add(instructor1);
		
		studentManager.display(student1);
		studentManager.display(student2);
		instructerManager.display(instructor1);
		
		
	}

}
