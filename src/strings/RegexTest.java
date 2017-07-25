package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args){
		String str = "北京市（海淀区）（朝阳区）（西城区）";
		Pattern pattern = Pattern.compile(".*?(?=\\()");
		Matcher matcher = pattern.matcher(str);
		if(matcher.find()){
			System.out.println(matcher.group(0));
		}
	}
}
