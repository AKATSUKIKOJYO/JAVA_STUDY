package icehs.science.chapter09;

public class HumanPolyTest {

	public static void main(String[] args) {
		Person [] persons = {
				new Person(),
				new Student(),
				new Teacher()
		};
		
		persons[0].eat();
		persons[1].eat();
		persons[2].eat();
		
		for(int i = 0; i < persons.length; i++) {
			persons[i].eat();
		}

	}

}
