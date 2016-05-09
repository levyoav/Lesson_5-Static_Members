package staticMembersExamples;

public class Car {
	//Static attribute - This attribute is associated with the class, not the objects of this class. It can not have the 'this' reference.
	//It is created in virtual memory right after the class loader loads the class, not when an object of this class is created. The class
	//is loaded to the virtual memory with its static members when it is referenced for the first time. Since this attribute has the private
	//access modifier, it can be accessed only by using a STATIC GET METHOD (see last method...). A static attribute can be initialised inline.
	//But when the initialisation involves calling functions, it must be initialised in a static code block.
	private static int counter;

	private int id;
	private int speed;
	private String color;

	//Static block - Also called STATIC INITIALIZER or STATIC CONSTRUCTOR. It is executed only once immediately when the class is loaded.
	//It is usually used to initialise static attributes. In this case, the static attribute 'counter' needs to be initialised using the random()
	//method. So it must be initialised in this static block.
	static {

		int r = (int) (Math.random() * 11);
		if (r % 2 == 0) {
			counter = 100;
		} else {
			counter = 200;
		}
	}

	public Car(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
		counter++; //The 'counter' static attribute is incremented each time an object is instantiated. 
		id = counter;
	}

	public int getId() {
		return id;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Car [id=" + id + ", speed=" + speed + ", color=" + color + "]";
	}

	//Static method - This method is associated with the class and can be invoked without instantiating an object. Can work only with
	//STATIC MEMBERS (static methods or static attributes). The static method does not have the 'this' reference. The static private 
	//attribute 'counter' is accessed by this method.   
	public static int getCount() {
//		return CarClassWithStaticMembersExample.counter;
		return counter;
	}
}
