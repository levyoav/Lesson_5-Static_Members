package staticMembersExamples;

public class CarTest2 {
	
	public static void main(String[] args) {
		
		System.out.println("counter: " + Car.getCount());
		
		Car c1 = new Car(0, "Red");
		Car c2 = new Car(0, "Red");
		Car c3 = new Car(0, "Red");
		Car c4 = new Car(0, "Red");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
