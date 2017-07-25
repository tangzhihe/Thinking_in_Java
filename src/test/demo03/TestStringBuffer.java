package test.demo03;

public class TestStringBuffer {
	public static void operator(StringBuffer x, StringBuffer y){
		x.append(y);
		y = x;
	}
	public static void main(String[] args){
		StringBuffer a = new StringBuffer("A"); 
	    StringBuffer b = new StringBuffer("B"); 
	    operator(a, b); 
	    System.out.println(a + "," + b);
	}
}
