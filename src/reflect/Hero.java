package reflect;

public class Hero{
	public String name;
	public float hp;
	public int damage;
	public int id;
	static String copyright;
	
	static{
		System.out.println("初始化 copyright");
		copyright = "版权由Riot Games公司所有";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
