package kodlamaIo;

public class InstructorManager {

	public void addDescription(Instructor instructor) {
		System.out.println(instructor.firstName + " " + instructor.lastName + " : "+ instructor.getDescription());
	}
}
