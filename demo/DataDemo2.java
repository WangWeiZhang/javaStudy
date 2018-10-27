public class DataDemo2{
	public static void main(String [] args) {
		//自动类型转换（隐式转换）
		byte num1 = 10;
		int num2 = num1;
		System.out.println(num2); //10
		long num3=num2;
		System.out.println(num3); //10
		
		float f = 10.5f;
		double d = f;
		System.out.println(d); //10.5
		
		int num4=100;
		float num5=num4;
		System.out.println(num5); //100.0 整型数据范围的大小小于 float ， 可以自动类型转换
		
		char c1='a';
		int num6=c1; //字符赋值给整型变量 a 通过asscl表转换二进制，从而转换整数
		System.out.println(c1);   // a
		System.out.println(num6); // 97
		System.out.println(c1+10);// 字符小于整型的数据范围，可以转换，找到asscm值；
		
		//强制类型转换（显示转换）
		int num7=10;
		short num8 = (short)num7;
		System.out.println(num8);
		
		float num9=(float)10.25;
		System.out.println(num9);
		
		int num10=65;
		char num11=(char)num10;
		System.out.println(num11);
		
		int num12=10;
		double num13=10.6;
		double res=num12+num13; //根据大的数据类型走 （double）
		System.out.println(res);
		
		//总结：数值型：byte<short(char)<int<long<float<double
		
		
		//自己练习
		System.out.println("--------------------------下面---------------------------------------");
		
		//int的数据范围没有单精度浮点型的高，符合自动转换类型
		int data=12;
		float data1=data;
		System.out.println(data1);//12.0
		//byte 数据范围 小于 short，符合
		byte data2=127;
		short data3=data2;
		System.out.println(data3);
		//short 和 char 不满足自动类型转换的第一个条件----> 两种类型要兼容
		short data4=12;
		char data5=(char)data4;
		System.out.println(data5);
		//int的数据范围远远大于char，需要强制类型转换。 转换后将65对应阿斯克码表找到对应的字符为大写'A'；
		int data6=65;
		char data7=(char)data6;
		System.out.println(data7);//A
		
		
		//byte字节型<short短整型(char)字符型<int整型<long长整型<float单精度浮点型<double双精度浮点型
		
		
		/*
		 // byte  
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);  
        System.out.println("包装类：java.lang.Byte");  
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);  
        System.out.println("包装类：java.lang.Short");  
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);  
        System.out.println("包装类：java.lang.Integer");  
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);  
        System.out.println("包装类：java.lang.Long");  
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);  
        System.out.println("包装类：java.lang.Float");  
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);  
        System.out.println("包装类：java.lang.Double");  
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);  
        System.out.println("包装类：java.lang.Character");  
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
        System.out.println("最小值：Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
        System.out.println("最大值：Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
		*/
		
		
	}
}