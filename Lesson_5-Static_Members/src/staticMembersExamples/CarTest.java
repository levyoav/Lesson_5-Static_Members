package staticMembersExamples;

public class CarTest {
	
	public static void main(String[] args) {
		
		//The CarClassWithStaticMembersExample class is being referenced for the first time and thus loaded to the virtual
		//memory along with its static members. The getCount() method is invoked via the class itself. Either 100 or 200 is printed
		//according to the random result.
		System.out.println("counter: " + Car.getCount());
		
		//After instantiating 2 objects of the class, the 'counter' attribute is incremented by 2.
		Car c1 = new Car(20, "Red");
		Car c2 = new Car(100, "Blue");
		
		System.out.println(c1.getSpeed());
		System.out.println(c2.getSpeed());
		
		System.out.println("counter: " + Car.getCount()); //102 or 202 is printed.
		
		System.out.println("car id" + c1.getId());
		System.out.println("car id" + c2.getId());
		
		//When printing out each of the objects details, the 'counter' attribute is not printed since it is not associated with any object.
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
