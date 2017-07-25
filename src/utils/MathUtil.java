package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathUtil {
	/**
	 * 功能：如果参数是0到9之间的数字字符，函数返回非零值，否则返回零值
	 * @param num
	 * @return
	 */
	public static int isdigit(Object num){
		if(num != null && !"".equals(num)){
			for(int i = 0; i < 9; i++){
				if(Integer.parseInt(num.toString()) == i){
					return i;
				}
			}
		}
		return 0;
	}
	
	/**
	 * 功能：将字符串str转换成一个双精度数值并返回结果。参数str必须以有效
	 * 数字开头否则返回0
	 * @param str
	 * @return
	 */
	public static double atof(String str){
		int len = str.length();
		StringBuffer num = new StringBuffer();
		Pattern pattern = Pattern.compile("[0-9]*");
		int count = 0;//记录小数点个数
		if(len == 0){
			//如果是空串，那么返回0.0
			return 0.0;
		}
		for(int i = 0; i < len; i++){
			String tempChar = String.valueOf(str.charAt(i));//获取每一位字符
			Matcher isNum = pattern.matcher(tempChar);//验证是否为数字
			if(isNum.matches() || ".".equals(tempChar)){
				if(".".equals(tempChar)){
					count++;
				}
				if(count < 2){
					num.append(tempChar);//将数字字符和小数点放进去
				}else{
					//有两个小数点直接返回
					return Double.parseDouble(num.toString());
				}
			}else{
				if(num.length() == 0)//不是以数字开头的返回0
				{
					return 0.0;
				}
				return Double.parseDouble(num.toString());
			}
		}
		return Double.parseDouble(num.toString()); 
	}
	
	/**
	 * <一句话功能简述>功能：将字符串str转换成一个整数并返回结果。参数str 以数字开头，当函数
	 * 从str 中读到非数字字符则结束转换并将结果返回。
	 * @param str
	 * @return
	 */
	public static int atoi(String str){
		int len = str.length();
		StringBuffer num = new StringBuffer();
		Pattern pattern = Pattern.compile("[0-9]*");
		if(len != 0){
			for(int i = 0; i < len; i++){
				//获取每一位字符
				String tempChar = String.valueOf(str.charAt(i));
				//验证是否为数字
				Matcher isNum = pattern.matcher(tempChar);
				if(isNum.matches()){
					num.append(tempChar);
				}else{
					if(num.length() == 0){
						return 0;
					}
					return Integer.parseInt(num.toString());
				}
			}
		}else{
			return 0;
		}
		return Integer.parseInt(num.toString());
	}
	
	/**
	 * <一句话功能简述>功能：将字符串from 中至多count个字符复制到字符串to中。如果字符串from
	 *  的长度小于count，其余部分用'\0'填补。返回处理完成的字符串。
	 * @param from
	 * @param count
	 * @return
	 */
	public static String strncpy(String from, int count){
		String result = "";
		if(from != null){
			char[] timeArray = from.toCharArray();
			if(from.length() > count){
				result = String.copyValueOf(timeArray,0,count);
			}else{
				result = String.copyValueOf(timeArray);
			}
		}
		return result;
	}
	
	/**
	 * <一句话功能简述>功能：将字符串from 中至多count个字符复制到字符串to中。如果字符串from 
	 * 的长度小于count，其余部分用'\0'填补。返回处理完成的字符串。
	 * @param result
	 * @param from
	 * @param count
	 * @return
	 */
	public static String strncpy(String result,String from, int count){
		result = ""; //初始化，防止传来null，返回的null造成调用程序空指针
		if(from != null){
			char[] timeArray = from.toCharArray();
			if(from.length() > count){
				result = String.copyValueOf(timeArray, 0, count);
			}else{
				result = String.copyValueOf(timeArray);
			}
		}
		return result;
	}
}


































