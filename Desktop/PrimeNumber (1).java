package homework;

public class PrimeNumber {
	
	public void judge() {
		for(int number=50; number<100; number++)
			for(int denominator=2; denominator<number; denominator++)
				if(number % denominator == 0)
					break;
				else if(number % denominator != 0)
					     if(denominator == number-1)
						     System.out.println("������" +number);
	}
	//�����м���ѭ������һ��ѭ����ѭ��50��10.�ڶ���ѭ���Ƿ�ĸ��2������-1.
	//˫��for������ѭ��˫��ѭ����˫��if���Խ���˫���жϡ�
	public static void main (String[] args) {
		PrimeNumber a = new PrimeNumber();
		a.judge();
	}
}
