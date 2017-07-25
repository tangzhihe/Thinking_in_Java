package exceptions;

import java.io.File;
import java.io.FileInputStream;

public class TestException {
	public static void main(String[] args){
		File file = new File("d:/LOL.exe");
		try{
			new FileInputStream(file);
		}catch(Throwable t){
			t.printStackTrace();
		}
	}
}























	