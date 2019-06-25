package com.annonymousInnerclass;

class A {
	public A() {
		System.out.println("A");
	}
}
class B extends A {
	public C c = new C();
	public B() {
		System.out.println("B");
	}
}
class C {
	public C() {
		System.out.println("C");
	}
}
public class Test {

	public static void main(String[] args) {
		new B();
	}

}
