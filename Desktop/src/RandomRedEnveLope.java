import java.util.Random;
public class RandomRedEnveLope extends RedEnveLope {
	double minMoney;  //可以抢到的最小金额
	int integerRemainMoney; //红包中的钱按分表示。
	int randomMoney;  //用户抢的钱
	Random random;    //用来获取随机数
	
	RandomRedEnveLope(double remainMoney, int remainPeople) { //红包的金额用double格式，人数用int表示
		random = new Random(); //目的是，当用户创建红包时，系统自动创建一个对象
		minMoney = 0.01; //规定最少抢0.01元
		this.remainMoney = remainMoney; //把构造方法中定义的红包金额设置为当前红包金额
		this.remainPeople = remainPeople;
		integerRemainMoney = (int)(remainMoney*100); //将红包按分表示
		
			if(integerRemainMoney<remainPeople*(int)(minMoney*100)); {
				integerRemainMoney = remainPeople*(int)(minMoney*100);
				this.remainMoney = (double) integerRemainMoney;
			} //判断红包中的钱是否满足每个人都能抢到的钱至少能满足最小值，如果不满足，则强行将红包总金额变为因有的最小数
		}
	
	public double giveMoney() {
		if(remainPeople<=0) {
			return 0;
		}//当前抢钱人数变为0，则方法结束，不能在抢钱了
		
		if (remainPeople == 1) {
			money = remainMoney;
			remainPeople --;
			return money;
		}//当人数只有一个的时候，直接将剩余的钱全部给他。返回用户抢到的钱
		
		randomMoney = random.nextInt(integerRemainMoney);
		//在0到剩余金额中随机获取一个随机数，做为用户抢到的钱。
		if(randomMoney<(int)(minMoney*100)) {
			randomMoney = (int)(minMoney*100);
		}
		//保证用户能抢到一分钱
		int leftOtherPeopleMoney = integerRemainMoney - randomMoney;//当前红包的钱
		int otherPeopleNeedMoney = (remainPeople - 1)*(int)(minMoney*100);
		//当前别人所需的钱。防止这个人抢多了。保证剩下的人能抢到一分
		if(leftOtherPeopleMoney<otherPeopleNeedMoney) {
			randomMoney -= (otherPeopleNeedMoney - leftOtherPeopleMoney);	
		}//如果多了，就减掉
		
		integerRemainMoney = integerRemainMoney - randomMoney; //剩余的钱
		remainMoney = (double)(integerRemainMoney/100.0);//把剩余的钱用元表示
		remainPeople --; //人数减少
		money = (double)(randomMoney/100.0); // 用户抢到的钱用元表示
		return money;//返回用户抢到的钱
	}
}

