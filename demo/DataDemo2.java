public class DataDemo2{
	public static void main(String [] args) {
		//�Զ�����ת������ʽת����
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
		System.out.println(num5); //100.0 �������ݷ�Χ�Ĵ�СС�� float �� �����Զ�����ת��
		
		char c1='a';
		int num6=c1; //�ַ���ֵ�����ͱ��� a ͨ��asscl��ת�������ƣ��Ӷ�ת������
		System.out.println(c1);   // a
		System.out.println(num6); // 97
		System.out.println(c1+10);// �ַ�С�����͵����ݷ�Χ������ת�����ҵ�asscmֵ��
		
		//ǿ������ת������ʾת����
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
		double res=num12+num13; //���ݴ������������ ��double��
		System.out.println(res);
		
		//�ܽ᣺��ֵ�ͣ�byte<short(char)<int<long<float<double
		
		
		//�Լ���ϰ
		System.out.println("--------------------------����---------------------------------------");
		
		//int�����ݷ�Χû�е����ȸ����͵ĸߣ������Զ�ת������
		int data=12;
		float data1=data;
		System.out.println(data1);//12.0
		//byte ���ݷ�Χ С�� short������
		byte data2=127;
		short data3=data2;
		System.out.println(data3);
		//short �� char �������Զ�����ת���ĵ�һ������----> ��������Ҫ����
		short data4=12;
		char data5=(char)data4;
		System.out.println(data5);
		//int�����ݷ�ΧԶԶ����char����Ҫǿ������ת���� ת����65��Ӧ��˹������ҵ���Ӧ���ַ�Ϊ��д'A'��
		int data6=65;
		char data7=(char)data6;
		System.out.println(data7);//A
		
		
		//byte�ֽ���<short������(char)�ַ���<int����<long������<float�����ȸ�����<double˫���ȸ�����
		
		
		/*
		 // byte  
        System.out.println("�������ͣ�byte ������λ����" + Byte.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Byte");  
        System.out.println("��Сֵ��Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
        System.out.println("���ֵ��Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
        System.out.println();  
  
        // short  
        System.out.println("�������ͣ�short ������λ����" + Short.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Short");  
        System.out.println("��Сֵ��Short.MIN_VALUE=" + Short.MIN_VALUE);  
        System.out.println("���ֵ��Short.MAX_VALUE=" + Short.MAX_VALUE);  
        System.out.println();  
  
        // int  
        System.out.println("�������ͣ�int ������λ����" + Integer.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Integer");  
        System.out.println("��Сֵ��Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
        System.out.println("���ֵ��Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
        System.out.println();  
  
        // long  
        System.out.println("�������ͣ�long ������λ����" + Long.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Long");  
        System.out.println("��Сֵ��Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("���ֵ��Long.MAX_VALUE=" + Long.MAX_VALUE);  
        System.out.println();  
  
        // float  
        System.out.println("�������ͣ�float ������λ����" + Float.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Float");  
        System.out.println("��Сֵ��Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("���ֵ��Float.MAX_VALUE=" + Float.MAX_VALUE);  
        System.out.println();  
  
        // double  
        System.out.println("�������ͣ�double ������λ����" + Double.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Double");  
        System.out.println("��Сֵ��Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("���ֵ��Double.MAX_VALUE=" + Double.MAX_VALUE);  
        System.out.println();  
  
        // char  
        System.out.println("�������ͣ�char ������λ����" + Character.SIZE);  
        System.out.println("��װ�ࣺjava.lang.Character");  
        // ����ֵ��ʽ�������ַ���ʽ��Character.MIN_VALUE���������̨  
        System.out.println("��Сֵ��Character.MIN_VALUE="  
                + (int) Character.MIN_VALUE);  
        // ����ֵ��ʽ�������ַ���ʽ��Character.MAX_VALUE���������̨  
        System.out.println("���ֵ��Character.MAX_VALUE="  
                + (int) Character.MAX_VALUE);  
		*/
		
		
	}
}