package homework;

public class PrimeNumber {
	public void judge() {
		for(int i=50; i<100; i++)
			for(int n=2; n<i; n++)
				if(i%n != 0)
					System.out.println("������" +i);
	}
	//���������������Ҿ��ý���ͨ��
	public static void main (String[] args) {
		PrimeNumber a = new PrimeNumber();
		a.judge();
	}
}
