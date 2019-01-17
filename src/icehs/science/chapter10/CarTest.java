package icehs.science.chapter10;

public class CarTest {

	public static void main(String[] args) {
		Car taxi = new Taxi();
		Car truck = new Truck();
		
		taxi.setOilSize(10);
		truck.setOilSize(10);
		
		Car[] cars = {new Car(), new Car()};
		
		cars[0].setOilSize(10);
		cars[1].setOilSize(10);
		
		cars[0].go(20);
		cars[1].go(30);

	}

}
