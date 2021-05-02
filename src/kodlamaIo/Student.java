package kodlamaIo;

public class Student extends User {
	double completionPercent;
	
	public Student() {
		
	}

	public Student(double completionPercent) {
		super();
		this.completionPercent = completionPercent;
	}

	public double getCompletionPercent() {
		return completionPercent;
	}

	public void setCompletionPercent(double completionPercent) {
		this.completionPercent = completionPercent;
	}
}
