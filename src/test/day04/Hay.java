package test.day04;

class Base{
	public void amethod(){
		System.out.println("Base");
	}
}
public class Hay extends Base{
	public void amethod(){
		System.out.println("Hay");
	}
	public static void main(String[] args){
		Hay h = new Hay();
		h.amethod();
	}
}
