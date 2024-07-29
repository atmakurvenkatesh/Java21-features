package package1;

import static java.lang.StringTemplate.RAW;
import static java.lang.StringTemplate.STR;

public class StringTemplates2 {
	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		// RAW
		StringTemplate st = RAW."\{x} plus \{y} equals \{x + y}";
		String s = st.toString();
		System.out.println(s);
		
//		List<String> fragments = st.fragments();
//		String result = String.join("\\{}", fragments);
//		System.out.println(result);
		
		System.out.println("st.interpolate() : " + st.interpolate());
		
		// RAW AND STR
		String name = "Joan";
		StringTemplate st1 = RAW."My name is \{name}";
		String info = STR.process(st1);
		System.out.println(info);
	}
}
