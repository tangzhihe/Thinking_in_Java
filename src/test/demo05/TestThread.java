package test.demo05;

public class TestThread {
	public static void main(String[] args) throws InterruptedException{
		Thread t = new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
				System.out.println("2");
			}
		});
		t.start();
		t.join();
		System.out.print("1");
	}
}























