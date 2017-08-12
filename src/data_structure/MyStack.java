package data_structure;

import java.util.Arrays;

public class MyStack<T> {
	//使用数组实现这个栈结构
	private T[] dataArr;
	//当前元素的个数
	private int theSize;
	//栈的容量
	private static final int DEFAULT_CAPACITY = 10;
	
	public MyStack(){
		clear();
	}
	
	//初始化数组，默认大小10，元素个数theSize初始化
	private void clear(){
		theSize = 0;
		ensureCapacity(DEFAULT_CAPACITY);
	}
	
	//栈元素容量
	public int size(){
		return theSize;
	}
	
	private void ensureCapacity(int newCapacity){
		if(newCapacity < theSize){
			return;
		}
		T[] oldArr = dataArr;
		dataArr = (T[])new Object[newCapacity];
		for(int i=0;i<size();i++){
			dataArr[i] = oldArr[i];
		}
	}
	
	//入栈
	public void push(T value){
		if(dataArr.length == size()){
			ensureCapacity(size()*2);
		}
		dataArr[theSize++] = value;
	}

	@Override
	public String toString() {
		return Arrays.toString(dataArr);
	}
}




























