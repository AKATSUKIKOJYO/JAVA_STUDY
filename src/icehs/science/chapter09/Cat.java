package icehs.science.chapter09;

public class Cat extends Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void AnimalInfo() {
		System.out.println("이름:" + this.name);
		System.out.println("나이:" + this.age + "살");
		System.out.println("종류:" + this.kind);
	}
	
	public void hunt() {
		System.out.println("쥐를 잡을꺼야!!");
	}
	
	public void play() {
		System.out.println("모빙 놀이가 좋아요~");
	}

}
