public class SevenDemo {
	public static void main(String [] args){
		
		/*
		计算机内部对二进制，通过"补码"的方式进行运算；
		比如：1-1=1+（-1）=0； 补码就是为了简化计算机的执行过程，让运算变得简单明了；
		
		原码：3(2进制)--->0000 0011:第一位0是符号位，0代表正，1代表负；
		反码：正数的反码和原码一样，负数的反码，保留符号位，其余按位取反；
			  1000 0011(原码)-->(反码)1111 1100
	   *补码：正数的补码和原码、反码一样，负数的补码=负数反码+1；
	          1000 0011(原码)-->(反码)1111 1100-->1111 1100 + 1 = 1111 1101(补码)
			  
			负数的原码和补码之间的转换：
				*负数的原码 = 负数的补码 - 1  再取反；
				*负数的原码 = 负数的补码 取反 再加1
				
				
				1、已知原码求补码：10001(原码) --> 1111 0 + 1 = 11111； 
				2、已知补码求原码：11111(补码) --> 11111-1 = 11110 再取反 = 10001;
				3、已知补码求原码：补码取反+1 = 原码：
				   11111-->(反码)10000 -->10000 + 1 = 10001(原码)；
		*/
		int num1=128;
		int num2=129;
		System.out.println("num1与num2的结果是："+(num1&num2));//128
		/*
			因为int占4个字节，由32位个0或1组成
			num1->128: 0000 0000 0000 0000 0000 0000 1000 0000 (原码、反码、补码)->（补码）
			num2->129: 0000 0000 0000 0000 0000 0000 1000 0001 (原码、反码、补码)->（补码）
			------------------------------------------------------------------------------
			因为num1和num2做的是"与"操作，所以二进制数都是1的部分返回1，其余返回0，所以
			res-->     0000 0000 0000 0000 0000 0000 1000 0000
			所以res和num1一样，所以输出128
		*/
		System.out.println("num1或num2的结果是："+(num1|num2));//129
		/*
			因为int占4个字节，由32位个0或1组成
			num1->128: 0000 0000 0000 0000 0000 0000 1000 0000 (原码、反码、补码)->（补码）
			num2->129: 0000 0000 0000 0000 0000 0000 1000 0001 (原码、反码、补码)->（补码）
			------------------------------------------------------------------------------
			因为num1和num2做的是"或"操作，所以二进制数有一个是1的部分就返回1，一个没有的位数返回0，所以
			res-->     0000 0000 0000 0000 0000 0000 1000 0001
			所以res和num2一样，所以输出129
		*/
		System.out.println("num1异或num2的结果是："+(num1^num2));//1
		/*
			因为int占4个字节，由32位个0或1组成
			num1->128: 0000 0000 0000 0000 0000 0000 1000 0000 (原码、反码、补码)->（补码）
			num2->129: 0000 0000 0000 0000 0000 0000 1000 0001 (原码、反码、补码)->（补码）
			------------------------------------------------------------------------------
			因为num1和num2做的是"异或"操作，所以二进制数位数相异的返回1，相同的返回0；所以
			res-->     0000 0000 0000 0000 0000 0000 1000 0001
			所以num1和num2最后一位相异，所以输出0000 0000 0000 0000 0000 0000 0000 0001；最后输出"1"
		*/
		System.out.println("num1非num2的结果是："+(~num1));//-129
		/*
			因为int占4个字节，由32位个0或1组成
			num1->128: 0000 0000 0000 0000 0000 0000 1000 0000 (原码、反码、补码)->（补码）
			取反->:    1111 1111 1111 1111 1111 1111 0111 1111 (原码、反码、补码)->（补码）
			------------------------------------------------------------------------------
			计算结果需要看原码：补码转原码，公式：原码=补码取反+1；
			补码取反： 1000 0000 0000 0000 0000 0000 1000 0000 加1
					   1000 0000 0000 0000 0000 0000 1000 0001 后八位是 129 因为 符号位是1，1代表负；所以整体是负数 所以结果为 -129
			
		*/
		
		//正数左移 n*n的m次方 2<<3 2*2的3次方
		System.out.println("2<<3 2左移3位,结果是"+(2<<3));//16
		/*
			0000 0000 0000 0000 0000 0000 0000 0010(补) 左移三位，应该在右面补3个0，前面删除3个0；如下
			0000 0000 0000 0000 0000 0000 0001 0000(补)
			16
		*/
		//负数左移 -n*n的m次方 2<<3 -2*2的3次方
		System.out.println("-2<<3 -2左移3位,结果是"+(-2<<3));//-16
		/*
			1000 0000 0000 0000 0000 0000 0000 0010(原) 左移三位，应该在右面补3个0，前面删除3个0；如下
			1111 1111 1111 1111 1111 1111 1111 1110(补)
			1111 1111 1111 1111 1111 1111 1111 0000(补)左移3位
			----------------------------------------------------下面求原码：补码取反+1
			1000 0000 0000 0000 0000 0000 0000 1111 +1
			1000 0000 0000 0000 0000 0000 0001 0000
			-16
		*/
		
		//正数右移 结果：16/2的3次方
		System.out.println("16>>3 16右移3位,结果是"+(16>>3));//2
		/*
			0000 0000 0000 0000 0000 0000 0001 0000（补）
		移位0000 0000 0000 0000 0000 0000 0000 0010（补）
			2
		*/
		//负数右移 结果：-16/2的3次方
		System.out.println("-16>>3 -16右移3位,结果是"+(-16>>3));//-2
		/*
			1000 0000 0000 0000 0000 0000 0001 0000（原）
			1111 1111 1111 1111 1111 1111 1111 0000（补）
		移位1111 1111 1111 1111 1111 1111 1111 1110（补）
			----------------------------------------------
			1000 0000 0000 0000 0000 0000 0000 0001 + 1
			-------------------------------------------
			1000 0000 0000 0000 0000 0000 0000 0010(原码)
			
			-2
			
		*/
		
	}
}