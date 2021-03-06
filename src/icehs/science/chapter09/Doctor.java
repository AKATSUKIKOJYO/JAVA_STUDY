package icehs.science.chapter09;

public class Doctor {
	private String name;
	private String department;
	
	public Doctor(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}
	
	public void treatPatient() {
		System.out.println(this.department+ " : " + this.name);
		System.out.println("환자를 진료합니다.");
	}
}
