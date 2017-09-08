package spring1_hello;

public class User {
	private int id;
	private String name;
	
	public User() {
		super();
		System.out.println("User对象被创建");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
