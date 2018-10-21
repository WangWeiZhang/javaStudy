public class VarDemo {
	public static void main(String [] args){
		//先声明后赋值
		//int number;
		//number = 10;
		//System.out.println(number);
		
		//声明的同时赋值
		//int dataOne = 20;
		//System.out.println(dataOne);
		
		//声明一个变量必须给其值之后才能使用；
		/*int dataTwo;
		System.out.println(dataTwo);*/
		
		//同时声明多个变量
		//int data3, data4, data5 = 100;
		//System.out.println(data3); // 错误: 可能尚未初始化变量data3 上面同时声明的多个变量只有data5赋值了；
		//System.out.println(data5);
		
		//连续等号
		//int data3=data4=data5 = 100; //找不到符号，报错
		
		//正确的方式 声明多个 赋值多个
		//int data6 = 6,data7 = 7, data8 = 80;
		//System.out.println(data6);
		//System.out.println(data7);
		//System.out.println(data8);
		
		//不能声明同名变量，也就是不能重复声明 ；
		//int data6 = 8; //报错
		
		//关键字不能当作变量名
		//int final = 20;
		//System.out.println(final);//报错
		
		//变量名区分大小写
		int mySocre = 20;
		int mysocre = 30;
		System.out.println(mySocre);
		System.out.println(mysocre);
		
		//变量名字可以修改
		int mySocre = 20;
		int mysocre = 30;
			mySocre = 40;
			mysocre = 50;
		System.out.println(mySocre);
		System.out.println(mysocre);
		
		
	}
}