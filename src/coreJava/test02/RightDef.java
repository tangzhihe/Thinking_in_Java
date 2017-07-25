package coreJava.test02;

/**
 * static修饰的成员变量属于类，类变量会随着类初始化得到初始化，因此上面
 * 程序中的num2将会随着RightDef类的初始化而初始化；没有static修饰的成员
 * 变量则属于实例，实例变量随着对象的初始化而初始化，上面程序中的num1必须
 * 等到创建RightDef对象时才会初始化。在初始化一个对象之前，肯定得先初始化
 * 该对象所属的类，因此上面程序中的num2的初始化时机总是处于num1的初始化时机
 * 之前。
 * @author tangzhihe
 *
 */
public class RightDef {
	//下面代码将完全正常
	int num1 = num2 + 2;
	static int num2 = 20;
}
