public class DataDemo1{
	public static void main(String [] args) {
		//�ֽ��� 1�ֽ�
		byte age= 20;
		//byte age = 128; //�������Χ -128 - 127��
		//age = true;//���Ͳ�����
		System.out.println(age);
		
		//������ ��Χ -2��15�η� ---- 2��15�η� - 1��
		short number1 = 200; 
		System.out.println(number1);
		//���� ��Χ -2��31�η� ---- 2��31�η� - 1��
		int number2 = 100;
		System.out.println(number2);
		//������ ��Χ -2��63�η� ---- 2��63�η� - 1��
		long number3 = 2000;
		System.out.println(number3);
		//������
		float data1 = 10.5f; // �� f ָ��float
		double data2 = 10.456;
		double data3 = .125;
		double data4 = 0.3456e3; //��10�����η�
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		
		//Boolean 
		boolean flag = true;
		System.out.println(flag);
		
		//ǿ���� ֤��
		//boolean flag = true;
		//flag = 1;
		//System.out.println(flag); //����
		
		//�ַ��ͱ����� ������ ������
		char c1 = 'A';
		char c2 = '\u0041';
		char c3 = 65;
		//��java�е��ַ�char����ʹ�õ���Unicode�ַ�����
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}
}