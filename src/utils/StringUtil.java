package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat();
	
	public static boolean isEmpty(String src){
		return (src == null) || ("".equals(src));
	}
	
	public static boolean isPattern(String src,String pattern){
		if(src == null){
			if(pattern == null){
				return true;
			}
			return false;
		}
		if(isEmpty(pattern)){
			return false;
		}
		return src.matches(pattern);
	}
	
	public static boolean isNumber(String src){
		if(isEmpty(src)){
			return false;
		}
		return isPattern(src, "-?\\d{1,10}");
	}
	
	public static boolean isDate(String src, String pattern){
		if(isEmpty(src)){
			return false;
		}
		return parseDate(src, pattern) != null;
	}
	
	public static Date parseDate(String src, String pattern){
		if((isEmpty(src)) || (isEmpty(pattern))){
			return null;
		}
		try {
			dateFormat.applyPattern(pattern);
			return dateFormat.parse(src);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Date parseDate(String src){
		return parseDate(src, "yyyyMMdd");
	}
	
	public static String dateToString(Date date, String pattern){
		if((date == null) || (isEmpty(pattern))){
			return null;
		}
		try {
			dateFormat.applyPattern(pattern);
			return dateFormat.format(date);
		} catch (Exception e) {
		}
		return null;
	}
	
	public static String dateToString(Date date){
		return dateToString(date,"yyyyMMdd");
	}
	
	public static boolean equals(String src, String dest){
		if(src == null){
			if(dest != null)
				return false;
			return true;
		}
		if(dest == null){
			if(src == null)
				return true;
			return false;
		}
		return src.equals(dest);
	}
	
	public static boolean equalsIgnoreCase(String src, String dest){
		if(src == null){
			if(dest != null)
				return false;
			return true;
		}
		if(dest == null){
			if(src == null)
				return true;
			return false;
		}
		return src.equalsIgnoreCase(dest);
	}
	
	public static boolean equalsIgnoreNull(String src, String dest){
		if(src == null){
			src = "";
		}
		if(dest == null){
			dest = "";
		}
		return src.equals(dest);
	}
	
	public static String emptyToNull(String src){
		if(isEmpty(src)){
			return null;
		}
		return src;
	}
	
	public static String nullToEmpty(String src){
		if(src == null){
			return "";
		}
		return src;
	}
	
	public static String securityFilter(String src){
		if(isEmpty(src)){
			return src;
		}
		return filterSql(filterXss(src));
	}
	
	public static String filterSql(String src){
		if(isEmpty(src)){
			return src;
		}
		int len1;
		int len2;
		do{
			len1 = src.length();
			src = src.replaceAll("\n\r", "").replaceAll("(?i)(( ?SELECT )|( FROM )|( AND )|( OR )|( ?DELETE )|( ?UPDATE )|( COUNT )|( UNION )|( JOIN )|( ?EXEC )|( ?INSERT )|( ?DECLARE )|( ?DBMS_ )|( ?WHERE )|( ?CREATE )|( ?ALTER )|( SYSTEM )|( ?GROUP )|( ?ORDER )|( ?CHR\\()|( ?SELECT/*)|( ?/*FROM ))", 
			        "").replaceAll(";", "；").replaceAll("--", "--");
			len2 = src.length();
		}while(len1 != len2);
		return src;
	}
	
	public static String filterXss(String src){
		if(isEmpty(src)){
			return src;
		}
		int len1;
		int len2;
		do{
			len1 = src.length();
		      src = src.replaceAll("\n\r", "").replaceAll(">", "&gt;").replaceAll("<", "&lt;").replaceAll("\"", "&quot;").replaceAll("/\\*", "")
		        .replaceAll("\\*/", "").replaceAll("'", "&acute;").replaceAll("(?i)((alert)|(expression)|(iframe)|(cookie)|(document)|(location)|(onerror)|(onload)|(document))", 
		        "");
		      len2 = src.length();
		}while(len1 != len2);
		return src;
	}
	
	public static String newString(String src, String fromCode, String toCode){
		if(isEmpty(src)){
			return src;
		}
		if((fromCode == null) || (toCode == null)){
			return src;
		}
		try {
			return new String(src.getBytes(fromCode),toCode);
		} catch (Exception e) {
		}
		return null;
	}
	public static String newString(String src, String toCode){
		return newString(src, "ISO8859-1", toCode);
	}
	
}







































