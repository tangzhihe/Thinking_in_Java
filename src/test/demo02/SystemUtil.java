package test.demo02;

public class SystemUtil {
	public static boolean isAdmin(String userId){
		return userId.toLowerCase() == "admin";
	}
	
	public static void main(String[] args){
		System.out.println(isAdmin("Admin"));
	}
}
