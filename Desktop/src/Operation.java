
public class Operation {
	public static void main(String[] args) {
		RedEnveLope redEnveLope = new RandomRedEnveLope(8.50, 4);//设定红包金额以及人数
		System.out.printf("以下用循环输出%d个人抢%.2f元的随机红包：\n",redEnveLope.remainPeople ,redEnveLope.remainMoney);
		showProcess(redEnveLope);
	}
	
	public static void showProcess (RedEnveLope redEnveLope) {
	double sum = 0;
	while(redEnveLope.remainPeople>0) {
		double money = redEnveLope.giveMoney();//第一个人抢钱
		System.out.printf("%.2f\t",money);
		sum = sum+money;
	}
	String s = String.format("%.2f",sum);
	sum = Double.parseDouble(s);
	System.out.printf("\n%.2f元的红包被抢完" ,sum);
	}
}
	


		


