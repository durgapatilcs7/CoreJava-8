package com.lambda;

public class RunnableExample1 {

	public static void main(String[] args) {
		
		/**
		 * java 8 prior
		 */
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable 1");
				
			}
		};
		
		new Thread(runnable).start();
		
		/**
		 * java 8 lambda
		 */
		
		Runnable runnable2 = () -> {
			System.out.println("Runnable 2");
		};
		
		new Thread(runnable2).start();
		
		Runnable runnable3 = () -> System.out.println("Runnable 3");
		
		new Thread(runnable3).start();
		
		//new Thread(new Runnable()) = () -> System.out.println("Runnable 2");
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable 4");
				
			}
			
		}).start();
		
		new Thread( ( )-> System.out.println("Runnable 5")).start();
}

}
