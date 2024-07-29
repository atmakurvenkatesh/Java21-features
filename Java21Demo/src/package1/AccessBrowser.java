package package1;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class AccessBrowser {
	public static void main(String[] args) throws URISyntaxException, IOException {
		System.out.println(Desktop.isDesktopSupported());
		Desktop d = Desktop.getDesktop();
		URI uri = new URI(
				"http://cst1102.appsdev.fusionappsdphx1.oraclevcn.com:8000/OA_HTML/OA.jsp?OAFunc=OANEWHOMEPAGE#dummyAnchor1");
		d.browse(uri);

	}
}
