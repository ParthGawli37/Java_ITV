package anonymus;

//interface to print greeting message
interface Greeting{
	void greet();
}

public class SampleClass {

	public static void main(String[] args) {
		//Anonymous class which implements the interface Greeting
		Greeting obj = new Greeting() {
			public void greet() {
				System.out.println("Hello, Greetings to all from anonymous class");
			}
		};
		//calling the implemented method of the interface
		obj.greet();
	}

}
