package package1;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

public class AccessBrowser2 {
	public static void main(String[] args) throws URISyntaxException, IOException {

		String uri = "http://cst1102.appsdev.fusionappsdphx1.oraclevcn.com:8000/OA_HTML/OA.jsp?OAFunc=OANEWHOMEPAGE#dummyAnchor1";

		HttpClient client = new HttpClient();
		client.getParams().setParameter("usernameField", "mfg");

		GetMethod method = new GetMethod(uri);
		client.executeMethod(method);

	}
}
