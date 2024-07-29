package package1;

import java.awt.Desktop;
import java.net.http.HttpClient;

public class Test {
	public static void main(String[] args) {

		HttpClient client = HttpClient.newHttpClient();// closing mechanisms

		// repeat() function
		StringBuilder str = new StringBuilder();
		str = str.repeat("Oracle", 10);
		System.out.println(str);

		StringBuffer strbuf = new StringBuffer();
		System.out.println(strbuf.repeat("repeat ", 5));

	}
}
