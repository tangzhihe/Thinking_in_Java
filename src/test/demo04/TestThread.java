package test.demo04;

public class TestThread {
	public void waitForSignal() throws InterruptedException{
		Object obj = new Object();
		synchronized (Thread.currentThread()) {
			obj.wait();
			obj.notify();
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		TestThread testThread = new TestThread();
		testThread.waitForSignal();
	}
}



















