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
		System.out.println("�̸�:" + this.name);
		System.out.println("����:" + this.age + "��");
		System.out.println("����:" + this.kind);
	}
	
	public void hunt() {
		System.out.println("�㸦 ��������!!");
	}
	
	public void play() {
		System.out.println("��� ���̰� ���ƿ�~");
	}

}
