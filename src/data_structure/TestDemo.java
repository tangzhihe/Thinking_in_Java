package data_structure;

import java.util.Stack;

public class TestDemo {
	public static void main(String[] args){
		Stack<String> stack = new Stack<>();
		stack.push("tangzhihe");
		stack.push("daiyuanyuan");
		System.out.println(stack);
		MyStack<String> myStack = new MyStack<>();
		myStack.push("tangzhihe");
		myStack.push("diayuanyuan");
		System.out.println(myStack);
	}
}





















