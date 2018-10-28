public class SixDemo2{
	public static void main(String [] args){
		int num1 = 10;
		int num2 = 8;
		int num3 = 5;
		boolean res=false;
		//短路与  真
		System.out.println((num1>num2)&&(num2>num3));//true
		//短路与  假
		System.out.println((num1<num2)&&(num2>num3));//true
		//验证短路与，第一个条件为false时，第二个不进行执行判断
		System.out.println((num1<num2)&&(res=num2>num3));
		System.out.println(res);//false  如果打印出来true证明概念是错的，但是打印的还是false，说明&&右面没有执行；
		
		//短路或  真
		System.out.println((num1<num2)||(num2>num3));//true
		//验证短路或，第一个条件为true时，第二个不进行执行判断
		System.out.println((num1>num2)||(res=num2>num3));
		System.out.println(res);//false  如果打印出来true证明概念是错的，但是打印的还是false，说明||右面没有执行；
		
		//短路与  真
		System.out.println(!(num1>num2));//false
		System.out.println(!(num1<num2));//true
		
		
		//逻辑与
		/*System.out.println((num1<num2)&(res=num2>num3));
		System.out.println(res);//true  证明&右面的表达式执行了；*/
		//逻辑或运算
		System.out.println((num1>num2)|(res=num2>num3));
		System.out.println(res);//true  证明|右面的表达式执行了；
		//逻辑异或
		System.out.println((num1>num2)^(num2<num3));//true
		System.out.println((num1>num2)^(num2>num3));//false
		System.out.println((num1<num2)^(num2<num3));//false
		
	}
}