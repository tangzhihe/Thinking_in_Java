package test.demo03;

public class Test {
	public static int aMethod(int i) throws Exception{
		try {
			return i/10;
		} catch (Exception e) {
			throw new Exception("exception in a aMethod");
		} finally {
			System.out.printf("finally");
		}
	}
	
	public static void main(String[] args){
		try {
			aMethod(0);
		} catch (Exception e) {
			System.out.println("exception in main");
		} 
		System.out.printf("finished");
	}
}























