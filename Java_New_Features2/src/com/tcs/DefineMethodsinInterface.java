package com.tcs;

interface Employees
{
	void call();
	
	default void message() {
		System.out.println("Defined method in interface.");
	}
}
class TcsEmployees implements Employees{
	public void call() {
		System.out.println("Inside  class method");
	}
}


public class DefineMethodsinInterface {
	
	public static void main(String[] args) {
		
		Employees emp = new TcsEmployees();
		emp.call();
		emp.message();
	}

}
