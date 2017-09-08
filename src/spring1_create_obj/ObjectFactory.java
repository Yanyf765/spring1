package spring1_create_obj;
//工厂，创建对象
public class ObjectFactory {
	// 实例方法创建对象
	public User getInstance(){
		return new User(101,"工厂实例方法");
	}
	public static User getStaticInstance(){
		return new User(102,"工厂静态方法");
	}
}
