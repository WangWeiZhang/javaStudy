public class SixDemo{
	public static void main(String [] args){
		int num1=10;
		int num2=8;
		int res=num1+num2;
		System.out.println(res);
		String str="操作结果：";//不是基本数据类型， 引用数据类型（堆内存里），而str变量在栈里面，指向堆里面的内存空间；
		System.out.println(str+res);//字符串连接
		System.out.println(str+res+10);//字符串连接 从左往右 操作结果：1810
		System.out.println(str+(res+10));//先算数字相加，在连接
		System.out.println(str+res+10.5);// 操作结果：1810.5
		System.out.println(str+res+'男');// 操作结果：18男
		System.out.println(str+res+true);// 操作结果：18true
		System.out.println(res+10+str);//   28操作结果：
		
		//System.out.println(str+num1-num2);//错误 减号智能做数字运算
		System.out.println(str+(num1-num2));//操作结果：2
		System.out.println(str+(num1*num2));//操作结果：80
		System.out.println(str+(num1/num2));//操作结果：1
		System.out.println(str+(num1%num2));//操作结果：2
		
		//num1++;
		++num1;
		//当单独使用++的时候，不管++在前面还是后面都是自身加一
		System.out.println(num1);
		
		//--num1
		--num1;
		System.out.println(num1);
		
		int data=++num1;
		//相当于 num1++; int data=num1;
		//当有赋值运算符的时候，++在前面，那么会先自增加一，在做赋值运算；
		
		//int data=num1++;
		//相当于int data=num1; num1++;
		//当有赋值运算符的时候，++在后面，那么会先赋值，然后在自身加一；
		System.out.println("res="+data+",num1="+num1);
		
		num2+=2;//num2=num2+2;
		System.out.println("num2="+num2);
		
		short s=5;
		//s=s+3;
		s+=3;
		System.out.println("s="+s);
		
		//关系运算符
		System.out.println(num1==num2);
		System.out.println(num1>num2);
	}
}