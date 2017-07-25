package coreJava.test03;

import java.util.HashSet;
import java.util.Set;


public class HashSetTest2 {
	public static void main(String[] args){
		Set<Name> set = new HashSet<>();
		set.add(new Name("abc","123"));
		set.add(new Name("abc","456"));
		System.out.println(set);
	}
}






















