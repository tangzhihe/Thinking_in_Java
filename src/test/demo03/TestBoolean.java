package test.demo03;

public class TestBoolean {
	public static boolean returnTest(){
		try {
			return true;
		} catch (Exception e) {
			
		} finally {
			return false;
		}
	}
	
	public static void main(String[] args){
		System.out.println(returnTest());
	}
}




























