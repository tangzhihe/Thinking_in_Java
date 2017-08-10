package holding;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
	public static void main(String[] args){
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(2, "tangzhihe");
		hashMap.put(1, "daiyuanyuan");
		hashMap.put(3, "hahaha");
		System.out.println(hashMap);
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(2, "tangzhihe");
		treeMap.put(1, "daiyuanyuan");
		treeMap.put(3, "hahaha");
		System.out.println(treeMap);
	}
}


















