package package1;

import static java.lang.StringTemplate.RAW;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StringTemplatesTest {
	public static void main(String[] args) throws SQLException {

		Connection conn;

		String name = "Bheem";
		StringTemplate st = RAW."SELECT * FROM Person p WHERE p.last_name = \{name}";
		System.out.println(st);

		String query = String.join("?", st.fragments());
		System.out.println(query);

		PreparedStatement ps = conn.prepareStatement(query);
		int index = 1;
		for (Object value : st.values()) {
			switch (value) {
			case Integer i -> ps.setInt(index++, i);
			case Float f -> ps.setFloat(index++, f);
			case Double d -> ps.setDouble(index++, d);
			case Boolean b -> ps.setBoolean(index++, b);
			default -> ps.setString(index++, String.valueOf(value));
			}
		}
		System.out.println(ps);
	}
}
