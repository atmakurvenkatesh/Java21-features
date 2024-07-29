package package1;

public class UnNamedPatterns {

	public record Car(String name, String color, String engine) {

	}

	public static void main(String[] args) {
		Object s = "red";
		switch (s) {
		case Car(String name,_,_) -> System.out.println(name);
		default-> System.out.println("unknown object");
		}
	}

	// before java 21
	static String getObjectsColor(Object object) {
		if (object instanceof Car(String name, String color, String engine)) {
			return color;
		}
		return "No color!";
	}
	
	// from java 21
	static String getObjectsColorWithUnnamedPattern(Object object) {
	    if (object instanceof Car(_, String color, _)) {
	        return color;
	    }
	    return "No color!";
	}

}
