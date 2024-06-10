package package1;

import java.util.Date;

public class PatternMatchingForSwitch {

	public static void main(String[] args) {

		printTypeUsingSwitch("bhdf");
		printTypeUsingSwitch("bhdffwrbjbfdi");
		printTypeUsingSwitch(null);
		printTypeUsingSwitch(new Date());
		printTypeUsingSwitch(574);
	}

	static void printTypeUsingSwitch(Object o) {

		switch (o) {
		case String s when s.length() > 5 -> System.out.println("Larger String: " + s);
		case String s -> System.out.println("Smaller String: " + s);
		case Integer i -> System.out.println("Inter Object: " + String.valueOf(i));
		case null -> System.out.println("null object");
		default -> System.out.println("Unexpected value: " + o);
		}
	}

}