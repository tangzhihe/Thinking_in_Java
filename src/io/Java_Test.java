package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Java_Test {
	public static void main(String[] args) throws Exception{
		String obj = "ls ";
		//将序列化对象写入文件object.txt中
		FileOutputStream fos = new FileOutputStream("aa.ser");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(obj);
		os.close();
		//将文件object.txt中读取数据
		FileInputStream fis = new FileInputStream("aa.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//通过反序列化恢复对象obj
		String obj2 = (String)ois.readObject();
		System.out.println(obj2);
		ois.close();
	}
}


































