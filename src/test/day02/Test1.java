package test.day02;

public class Test1 {
	public static Test1 t1 = new Test1();
	{
		System.out.println("blockA");
	}
	static{
		System.out.println("blockB");
	}
	public static void main(String[] args){
		Test1 t2 = new Test1();
	}
}










