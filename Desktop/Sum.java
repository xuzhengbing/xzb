package homework;

public class Sum {
	//û�����Ժ͹��췽��
	public void count() {
		double sum = 0;
		double b = 1;//���յĽ�����ܳ�����int��long���͹涨�ķ�Χ
		for(int n=1; n<21; n++)
			for(int m=1; m<n+1; m++)
				b = b*n;
			sum = sum + b;
		System.out.println("������" +sum);
	}
	//����ѭ����һ����ѭ��1-20����һ��ѭ����Ϊ��ʵ�ֳ˻�
	public static void main (String[] args) {
		Sum a = new Sum();
		a.count();		
	}
}
//�ڶ���������㷨�������Ľ�����ʱ����ʵ���Ѿ��̺����߼��ˣ�ֻ��Ҫ��������Ϊ���ľͺ��ˡ�
