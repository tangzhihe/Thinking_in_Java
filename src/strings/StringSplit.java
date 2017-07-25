package strings;

public class StringSplit {
	public static void main(String[] args){
		String str = "XSUWHQ";
		String[] chr = str.split(" ");
		for(int i = 0; i < chr.length; i++){
			if(i==(chr.length-1)){
				System.out.println("最后一个单词的长度: " + chr[i].length());
			}
		}
	}
}
