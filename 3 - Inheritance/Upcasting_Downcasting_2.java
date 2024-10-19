
class Parent {
	String name = "Homer";


	void parentMethod()
	{
		System.out.println("leaving for work");
	}
}


class Child extends Parent {
	String name = "Bart";

	void childMethod()
	{
		System.out.println("playing with toys");
	}
}


public class Upcasting_Downcasting_2 {

	public static void main(String[] args)
	{

        Parent p1 = new Parent();
		System.out.println(p1.name);
		p1.parentMethod();

		Child c1 = new Child();
		System.out.println(c1.name);
		c1.childMethod();

		System.out.println("----------------------------");

		Parent p2 = new Child();
		System.out.println(p2.name);
		p2.parentMethod();
		//p2.childMethod();

		Child c2 = (Child) p2;
		System.out.println(c2.name);
		c2.childMethod();
		c2.parentMethod();

		/* 
		Parent p = new Child();
		p.name = "Bill";
		System.out.println(p.name);
		p.method();

		Child c = (Child) p;

		System.out.println(c.name);
		c.method();
		*/


	}
}

