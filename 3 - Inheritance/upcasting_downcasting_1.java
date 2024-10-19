
/*
 
— Constructors: the purpose is to initialize the object you’re creating

— The POJO (the automatic generation of Getters and Setters, toString, Constructors, etc. It comes with a lot of boilerplate code, that is, code that is repetitive)

— Record (better alternative to POJOs, its purpose is to replace POJO)

— public class Dog **extends** Animal {

— **java.lang.Object:** Every class you create in Java extends a special class called java.lang package.

— this vs super


 */

// Java program to demonstrate

class Parent {
	String name = "Homer";

	void method() {
		System.out.println("leaving for work");
	}
}

class Child extends Parent {
	String name = "Bart";

	@Override
	void method() {
		System.out.println("playing with toys");
	}
}

public class Upcasting_Downcasting_1 {

	public static void main(String[] args) {

		Parent p1 = new Parent();
		System.out.println(p1.name);
		p1.method();

		Child c1 = new Child();
		System.out.println(c1.name);
		c1.method();

		System.out.println("----------------------------");

		// upcasting
		Parent p2 = new Child();
		System.out.println(p2.name);
		p2.method();

		// downcasting
		Child c2 = (Child) p2;
		System.out.println(c2.name);
		c2.method();

		/*
		 * Parent p = new Child();
		 * p.name = "Bill";
		 * System.out.println(p.name);
		 * p.method();
		 * 
		 * Child c = (Child) p;
		 * 
		 * System.out.println(c.name);
		 * c.method();
		 */

	}
}
