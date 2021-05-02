package kodlamaIo;

public class Instructor extends User{

	private int authorizationId;
	private String Description;

	public Instructor() {

	}

	public Instructor(int authorizationId, String description) {
		super();
		this.authorizationId = authorizationId;
		Description = description;
	}

	public int getAuthorizationId() {
		return authorizationId;
	}

	public void setAuthorizationId(int authorizationId) {
		this.authorizationId = authorizationId;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
