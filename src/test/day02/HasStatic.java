package test.day02;

public class HasStatic {
	private static int x = 100;
	public static void main(String[] args){
		HasStatic hs1 = new HasStatic();
		hs1.x++;//101
		System.out.println(hs1.x);
		HasStatic hs2 = new HasStatic();
		hs2.x++;//101
		System.out.println(hs2.x);
		hs1 = new HasStatic();
		hs1.x++;//101
		System.out.println(hs1.x);
		HasStatic.x--;
		System.out.println(HasStatic.x);
		System.out.println("x = " + x);
	}
}














