package spring1_create_obj;
//��������������
public class ObjectFactory {
	// ʵ��������������
	public User getInstance(){
		return new User(101,"����ʵ������");
	}
	public static User getStaticInstance(){
		return new User(102,"������̬����");
	}
}
