package hello;

// import joda time library to display local date/time
import org.joda.time.LocalTime;

/*
 * Class to display message to console with date & time
 */

public class HelloWorld {
	public static void main(String[] args) {
		// create new LocalTime object
		LocalTime currentTime = new LocalTime();
		// display currentTime to console
		System.out.println("The current local time is: " + currentTime);
		// create new Greeter object
		Greeter greeter = new Greeter();
		// display greeter to console
		System.out.println(greeter.sayHello());
	}
}
