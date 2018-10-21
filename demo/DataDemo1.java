public class DataDemo1{
	public static void main(String [] args) {
		//字节型 1字节
		byte age= 20;
		//byte age = 128; //超出最大范围 -128 - 127；
		//age = true;//类型不兼容
		System.out.println(age);
		
		//短整型 范围 -2的15次方 ---- 2的15次方 - 1；
		short number1 = 200; 
		System.out.println(number1);
		//整型 范围 -2的31次方 ---- 2的31次方 - 1；
		int number2 = 100;
		System.out.println(number2);
		//长整型 范围 -2的63次方 ---- 2的63次方 - 1；
		long number3 = 2000;
		System.out.println(number3);
		//浮点型
		float data1 = 10.5f; // 加 f 指定float
		double data2 = 10.456;
		double data3 = .125;
		double data4 = 0.3456e3; //×10的三次方
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		
		//Boolean 
		boolean flag = true;
		System.out.println(flag);
		
		//强类型 证明
		//boolean flag = true;
		//flag = 1;
		//System.out.println(flag); //报错
		
		//字符型必须用 单引号 扣起来
		char c1 = 'A';
		char c2 = '\u0041';
		char c3 = 65;
		//在java中的字符char类型使用的是Unicode字符编码
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}
}