package test.demo05;

import java.util.Date;

public class SuperTest extends Date{
	private static final long serialVersionUID = 5286151002093655726L;
	private void test(){
		System.out.println(super.getClass().getName());
	}
	public static void main(String[] args){
		new SuperTest().test();
	}
}




















