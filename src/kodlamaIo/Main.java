package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.firstName="Engin";
		instructor.lastName="DEM�RO�";
		instructor.email="engin@kodlamaio";
		instructor.setAuthorizationId(123);
		instructor.setDescription("Java,C#");
		
		Student student=new Student();
		student.firstName="�zg�r";
		student.lastName="DEM�R";
		student.email="ozgur@kodlamaio";
		student.setCompletionPercent(45.66);
		
		UserManager userManager=new UserManager();
		userManager.addMultiple(new User[]{instructor,student});
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addDescription(instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.updateCompletionPercent(student);
		
		
				

	}

}
