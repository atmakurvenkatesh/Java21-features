package package1;

public class RecordPatterns {

	public record Point(int x, int y) {
	}

	static void printSumBeforeJava16(Object obj) {
		if (obj instanceof Point) {
			Point p = (Point) obj;
			int x = p.x();
			int y = p.y();
			System.out.println(x + y);
		}
	}

	static void printSumBeforeJava21(Object obj) {
		if (obj instanceof Point p) {
			int x = p.x();
			int y = p.y();
			System.out.println(x + y);
		}
	}

	static void printSumAfterJava21(Object obj) {
		if (obj instanceof Point(int x, int y)) {
			System.out.println(x + y);
		}
	}

	public static void main(String[] args) {
		Point p1 = new Point(2, 8);
		printSumBeforeJava16(p1);
		printSumBeforeJava21(p1);
		printSumAfterJava21(p1);

	}
}
