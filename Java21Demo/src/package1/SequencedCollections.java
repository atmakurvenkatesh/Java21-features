package package1;

import java.util.Arrays;
import java.util.List;

public class SequencedCollections {
	public static void main(String[] args) {
//		SequencedCollection<E>
//		SequencedMap<K, V>
//		SequencedSet<E>
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
		l.reversed().forEach(System.out::println);
	}
}
