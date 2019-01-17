package icehs.science.chapter09;

public class VccTest {

	public static void main(String[] args) {
		Person person = new Person();
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		System.out.println(" === Student ===");
		person.eat();
		student.eat();
		System.out.println(" === Teacher ===");
		person.eat();
		teacher.eat();

	}

}
