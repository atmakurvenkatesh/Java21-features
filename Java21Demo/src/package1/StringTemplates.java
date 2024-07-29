package package1;

import static java.lang.StringTemplate.STR;

import java.text.MessageFormat;
import java.time.LocalDate;

public class StringTemplates {
	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		// String concatenation using '+' operater
		String s1 = x + " plus " + y + " equals " + (x + y);

		// StringBuilder append() function
		String s2 = new StringBuilder().append(x).append(" plus ").append(y).append(" equals ").append(x + y)
				.toString();

		// using String::format
		String s3 = String.format("%2$d plus %1$d equals %3$d", x, y, x + y);

		// String::formatted
		String s4 = "%2$d plus %1$d equals %3$d".formatted(x, y, x + y);

		// java.text.MessageFormat
		String s5 = MessageFormat.format("{0} plus {1} equals {2}", x, y, x + y);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

		// Using java 21

		String s6 = STR."\{x} plus \{y} equals \{x + y}";
		System.out.println(s6);

		System.out.println(STR."Date : \{LocalDate.now()}");

//		Multiline 
				String title = "My Web Page";
		String text = "Hello, world";
		String htmlCode = STR."""
		        <html>
		          <head>
		            <title>\{title}</title>
		          </head>
		          <body>
		            <p>\{text}</p>
		          </body>
		        </html>
		        """;
		System.out.println(htmlCode);

		String empName = "abc xyz";
		String empOrg = "company1";
		String empEmail = "abc.xyz@company1.com";
		String jsonMessage = STR."""
				{
					"employee": {
						"name": "\{empName}",
						"org": "\{empOrg}",
						"email": "\{empEmail}"
					}
				}
				""";
		System.out.println(jsonMessage);
	}
}
