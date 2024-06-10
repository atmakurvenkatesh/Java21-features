package package1;

import java.util.Objects;

public class RecordUsage {

	public record PersonRecord(String name, String address) {

	}

	public static void main(String[] args) {
		PersonRecord personRecord = new PersonRecord("ewf","gew");
	}
}

class Person {

	private final String name;
	private final String address;

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

}