package test.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * 写一个函数，例如：给你的a b c 则输出 abc acb bac bca cab cba
 * @author tangzhihe
 *
 */
public class NumTest {
	public static List<String> list(String base, String buff){
		List<String> result = new ArrayList<String>();
		if(base.length() <= 0){
			result.add(buff);
		}
		for(int i = 0; i < base.length(); i++){
			List<String> temp = list(new StringBuilder(base).deleteCharAt(i).toString(), buff+base.charAt(i));
			result.addAll(temp);
		}
		return result;
	}
	
	public static void main(String[] args){
		String s = "abc"; //原字符串
		List<String> result = list(s, "");//列出字符的组合，放入result
		System.out.println(result.size());
		System.out.println(result);
	}
}



































