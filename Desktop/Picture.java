package homework;

public class Picture {
//û����Ҫ��������Ժ͹��췽��
	public void one() {
		for(int i=1; i<7; i++)
			if(i == 4)
				System.out.print("*");
			else
				System.out.print(" ");
		System.out.println(" "); 
	}
//ͨ��forѭ��ʵ�ֵ�һ�е�����
	public void two() {
		for(int i=1; i<7; i++)
			if(i == 3 || i == 4 || i ==5)
				System.out.print("*");
			else
				System.out.print(" ");
		System.out.println(" ");
	}
	
	public void three() {
		for(int i=1; i<7; i++)
			if(i == 1)
				System.out.print(" ");
			else
				System.out.print("*");
		System.out.println(" ");
	}
	
	public void four() {
		for(int i=1; i<7; i++)
			if(i == 4)
				System.out.print("+");
			else
				System.out.print("*");
		System.out.println("*");
	}
	
	public static void main(String[] args) {
		Picture a = new Picture();
		a.one();
		a.two();
		a.three();
		a.four();
		a.three();
		a.two();
		a.one();
	}
}
/*(1)�����߸�ģ��ֿ���ʵ��
*��2��ÿһ�е�ͼ��ʵ�������߸���������*����+���ɣ�������Ҫѭ����ʵ��
*/