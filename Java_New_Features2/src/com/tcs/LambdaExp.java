package com.tcs;

interface I{
	void show();
}

class C implements I{
	
	public void show() {
		System.out.println("Hello");
	}
}
public class LambdaExp {

	public static void main(String[] args) {

//		I obj;
//		obj = new C();  // unnecessary usage of interface C here. 
		
		C obj = new C()
				{
					public void show() {
						System.out.println("Hello in Anonymous class");
					}
				};
			obj.show();
			
			
		
	}

}
