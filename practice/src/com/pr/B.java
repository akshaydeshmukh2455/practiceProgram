package com.pr;


class A
{
	public void m1()
	{
		System.out.println("Method of A.....");
	}
}

class C extends A
{
	public void m1()
	{
		System.out.println("Method of C.....");
	}
}

public class B {

	public static void main(String[] args) {
	
//		C c=new C();
//		c.m1();
		
		A a=new C();
		a.m1();
		
		
		
	}
}
