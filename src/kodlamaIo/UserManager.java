package kodlamaIo;

public class UserManager {
	public void add(User user) {
		System.out.println(user.firstName + " " + user.lastName + " kaydedildi");

	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
		System.out.println("Bulk insert completed");
	}

	public void update(User user) {
		System.out.println(user.getId() + "g�ncellendi");
	}

	public void delete(User user) {
		System.out.println("Silindi");
	}
	
	public void getAll() {
		System.out.println("Kullan�c�lar listelendi");
	}
	
	

}
