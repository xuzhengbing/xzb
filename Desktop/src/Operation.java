
public class Operation {
	public static void main(String[] args) {
		RedEnveLope redEnveLope = new RandomRedEnveLope(8.50, 4);//�趨�������Լ�����
		System.out.printf("������ѭ�����%d������%.2fԪ����������\n",redEnveLope.remainPeople ,redEnveLope.remainMoney);
		showProcess(redEnveLope);
	}
	
	public static void showProcess (RedEnveLope redEnveLope) {
	double sum = 0;
	while(redEnveLope.remainPeople>0) {
		double money = redEnveLope.giveMoney();//��һ������Ǯ
		System.out.printf("%.2f\t",money);
		sum = sum+money;
	}
	String s = String.format("%.2f",sum);
	sum = Double.parseDouble(s);
	System.out.printf("\n%.2fԪ�ĺ��������" ,sum);
	}
}
	


		


