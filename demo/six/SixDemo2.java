public class SixDemo2{
	public static void main(String [] args){
		int num1 = 10;
		int num2 = 8;
		int num3 = 5;
		boolean res=false;
		//��·��  ��
		System.out.println((num1>num2)&&(num2>num3));//true
		//��·��  ��
		System.out.println((num1<num2)&&(num2>num3));//true
		//��֤��·�룬��һ������Ϊfalseʱ���ڶ���������ִ���ж�
		System.out.println((num1<num2)&&(res=num2>num3));
		System.out.println(res);//false  �����ӡ����true֤�������Ǵ��ģ����Ǵ�ӡ�Ļ���false��˵��&&����û��ִ�У�
		
		//��·��  ��
		System.out.println((num1<num2)||(num2>num3));//true
		//��֤��·�򣬵�һ������Ϊtrueʱ���ڶ���������ִ���ж�
		System.out.println((num1>num2)||(res=num2>num3));
		System.out.println(res);//false  �����ӡ����true֤�������Ǵ��ģ����Ǵ�ӡ�Ļ���false��˵��||����û��ִ�У�
		
		//��·��  ��
		System.out.println(!(num1>num2));//false
		System.out.println(!(num1<num2));//true
		
		
		//�߼���
		/*System.out.println((num1<num2)&(res=num2>num3));
		System.out.println(res);//true  ֤��&����ı���ʽִ���ˣ�*/
		//�߼�������
		System.out.println((num1>num2)|(res=num2>num3));
		System.out.println(res);//true  ֤��|����ı���ʽִ���ˣ�
		//�߼����
		System.out.println((num1>num2)^(num2<num3));//true
		System.out.println((num1>num2)^(num2>num3));//false
		System.out.println((num1<num2)^(num2<num3));//false
		
	}
}