package package1;

public class SealedClasses {
	public static void main(String[] args) {
//		Child2 child2 = new Child2();
		Child3 child3 = new Child3();
	}
}

sealed interface Parent permits Child2, Child1, Child3 {
	public void run();
}

final class Child1 implements Parent {
	Child1() {
		System.out.println("inside child1");
	}

	@Override
	public void run() {
		System.out.println("Executing run() in child1");
	}
}

non-sealed class Child2 implements Parent {
	Child2() {
		System.out.println("inside child2");
	}

	@Override
	public void run() {
		System.out.println("Executing run() in child2");
	}
}

class Child3 implements Parent {
	Child3() {
		super.run();
		System.out.println("inside child3");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}