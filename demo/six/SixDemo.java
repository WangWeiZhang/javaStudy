public class SixDemo{
	public static void main(String [] args){
		int num1=10;
		int num2=8;
		int res=num1+num2;
		System.out.println(res);
		String str="���������";//���ǻ����������ͣ� �����������ͣ����ڴ������str������ջ���棬ָ���������ڴ�ռ䣻
		System.out.println(str+res);//�ַ�������
		System.out.println(str+res+10);//�ַ������� �������� ���������1810
		System.out.println(str+(res+10));//����������ӣ�������
		System.out.println(str+res+10.5);// ���������1810.5
		System.out.println(str+res+'��');// ���������18��
		System.out.println(str+res+true);// ���������18true
		System.out.println(res+10+str);//   28���������
		
		//System.out.println(str+num1-num2);//���� ������������������
		System.out.println(str+(num1-num2));//���������2
		System.out.println(str+(num1*num2));//���������80
		System.out.println(str+(num1/num2));//���������1
		System.out.println(str+(num1%num2));//���������2
		
		//num1++;
		++num1;
		//������ʹ��++��ʱ�򣬲���++��ǰ�滹�Ǻ��涼��������һ
		System.out.println(num1);
		
		//--num1
		--num1;
		System.out.println(num1);
		
		int data=++num1;
		//�൱�� num1++; int data=num1;
		//���и�ֵ�������ʱ��++��ǰ�棬��ô����������һ��������ֵ���㣻
		
		//int data=num1++;
		//�൱��int data=num1; num1++;
		//���и�ֵ�������ʱ��++�ں��棬��ô���ȸ�ֵ��Ȼ����������һ��
		System.out.println("res="+data+",num1="+num1);
		
		num2+=2;//num2=num2+2;
		System.out.println("num2="+num2);
		
		short s=5;
		//s=s+3;
		s+=3;
		System.out.println("s="+s);
		
		//��ϵ�����
		System.out.println(num1==num2);
		System.out.println(num1>num2);
	}
}