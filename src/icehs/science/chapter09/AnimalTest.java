package icehs.science.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("야옹이");
		cat.setAge(3);
		cat.setKind("페르시안");
		
		cat.AnimalInfo();
		cat.run();
		cat.hunt();
		cat.play();

	}

}
