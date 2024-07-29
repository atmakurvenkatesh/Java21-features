package package1;

import java.util.Arrays;
import java.util.List;

public class UnNamedVariables {
	public static void main(String[] args) {

		List<String> junkList = Arrays.asList("jfs", "fsag", "gewd", "gwsd");
		int total = 0;
		for (String junkValue : junkList) { // vulnerability in code quality checker
			total += 1;
		}
		System.out.println(total);

		total = 0;
		try {
			for (String _ : junkList) {
				total += 1;
			}
			System.out.println(total);
		} catch (Exception _) {
			System.out.println("Error Occured");
		}

		junkList.forEach((_) -> System.out.println("accepted"));
	}
}
