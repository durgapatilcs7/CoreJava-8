package com.interveiw.program;

public class Exception1 {
	
	public static void main(String[] args) {
		
		Exception1 exception1 = new Exception1();
		System.out.println(exception1.doSomething());
		
	}

	public int doSomething() {

		try {
			System.out.println("try");
			int i = 20 / 0;
			return 1;
		} catch (Exception ex)

		{
			System.out.println("catch");
			return 2;
		}
		finally{
			System.out.println("finally");
			return 3;
		}
	}

}
