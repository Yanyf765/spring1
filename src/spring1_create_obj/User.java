package spring1_create_obj;

public class User {
	private int id;
	private String name;
	
	public User() {
		super();
		System.out.println("����ͨ���޲ι�����������");
	}
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("����ͨ���вι�����������");
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}
