package homework;

public class Root {

	int a; int b; int c;
	
	public Root(int A, int B, int C) {
		a = A;
		b = B;
		c = C;
	}   /*���췽����Ϊ�˺���new��ʱ��ֱ���ڣ�������д����
	    *���췽���ж���Ĳ���Ҫ�����Թҹ��������췽���еĲ�����ֵ�������β�
	    *�Ա��ں���ķ�����ʹ�õ�����������ʱ��ž������� 
	    */
	
	
	public void judge() {
		double darta; double priceone = 0; 
		double pricetwo = 0; double price = 0;
		darta = b*b - 4*a*c;
		if(darta > 0) {
			priceone = ((-b) - (Math.sqrt(darta)))/2;
			pricetwo = ((-b) + (Math.sqrt(darta)))/2;
			System.out.print("��һ���⣺" +priceone);
			System.out.println("�ڶ����⣺" +pricetwo);
		}//����Ҫ����double���ͣ����Զ��嶼Ҫ��double.
		else if(darta == 0) {
				price = ((-b) - (Math.sqrt(darta)))/2;
				System.out.println("��Ϊ��" +price);
			}
		else if(darta < 0) {
		    	System.out.println("û�н�");
			}
	}//������������������������������ʹ��Ƕ��if��䡣ֻ��ʹ�ö���if��
	
	
	public static void main(String[] args) {
		Root a = new Root(5, 10, 3);
		a.judge();
	}
}
//Ϊʲô������else
//Ϊʲô��������㡣
