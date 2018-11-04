import java.util.Random;
public class RandomRedEnveLope extends RedEnveLope {
	double minMoney;  //������������С���
	int integerRemainMoney; //����е�Ǯ���ֱ�ʾ��
	int randomMoney;  //�û�����Ǯ
	Random random;    //������ȡ�����
	
	RandomRedEnveLope(double remainMoney, int remainPeople) { //����Ľ����double��ʽ��������int��ʾ
		random = new Random(); //Ŀ���ǣ����û��������ʱ��ϵͳ�Զ�����һ������
		minMoney = 0.01; //�涨������0.01Ԫ
		this.remainMoney = remainMoney; //�ѹ��췽���ж���ĺ���������Ϊ��ǰ������
		this.remainPeople = remainPeople;
		integerRemainMoney = (int)(remainMoney*100); //��������ֱ�ʾ
		
			if(integerRemainMoney<remainPeople*(int)(minMoney*100)); {
				integerRemainMoney = remainPeople*(int)(minMoney*100);
				this.remainMoney = (double) integerRemainMoney;
			} //�жϺ���е�Ǯ�Ƿ�����ÿ���˶���������Ǯ������������Сֵ����������㣬��ǿ�н�����ܽ���Ϊ���е���С��
		}
	
	public double giveMoney() {
		if(remainPeople<=0) {
			return 0;
		}//��ǰ��Ǯ������Ϊ0���򷽷���������������Ǯ��
		
		if (remainPeople == 1) {
			money = remainMoney;
			remainPeople --;
			return money;
		}//������ֻ��һ����ʱ��ֱ�ӽ�ʣ���Ǯȫ�������������û�������Ǯ
		
		randomMoney = random.nextInt(integerRemainMoney);
		//��0��ʣ�����������ȡһ�����������Ϊ�û�������Ǯ��
		if(randomMoney<(int)(minMoney*100)) {
			randomMoney = (int)(minMoney*100);
		}
		//��֤�û�������һ��Ǯ
		int leftOtherPeopleMoney = integerRemainMoney - randomMoney;//��ǰ�����Ǯ
		int otherPeopleNeedMoney = (remainPeople - 1)*(int)(minMoney*100);
		//��ǰ���������Ǯ����ֹ����������ˡ���֤ʣ�µ���������һ��
		if(leftOtherPeopleMoney<otherPeopleNeedMoney) {
			randomMoney -= (otherPeopleNeedMoney - leftOtherPeopleMoney);	
		}//������ˣ��ͼ���
		
		integerRemainMoney = integerRemainMoney - randomMoney; //ʣ���Ǯ
		remainMoney = (double)(integerRemainMoney/100.0);//��ʣ���Ǯ��Ԫ��ʾ
		remainPeople --; //��������
		money = (double)(randomMoney/100.0); // �û�������Ǯ��Ԫ��ʾ
		return money;//�����û�������Ǯ
	}
}

