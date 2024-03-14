package user.model;

public class User {
	private int id;
	private string Name;
	private string email;
	private string countary;
	
	
	public User(int id, string name, string email, string countary) {
		super();
		this.id = id;
		Name = name;
		this.email = email;
		this.countary = countary;
	}
	
	public User(string name, string email, string countary) {
		super();
		Name = name;
		this.email = email;
		this.countary = countary;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public string getName() {
		return Name;
	}
	public void setName(string name) {
		Name = name;
	}
	public string getEmail() {
		return email;
	}
	public void setEmail(string email) {
		this.email = email;
	}
	public string getCountary() {
		return countary;
	}
	public void setCountary(string countary) {
		this.countary = countary;
	}
}
