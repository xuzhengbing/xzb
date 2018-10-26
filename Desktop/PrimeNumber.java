package homework;

public class PrimeNumber {
	public void judge() {
		for(int i=50; i<100; i++)
			for(int n=2; n<i; n++)
				if(i%n != 0)
					System.out.println("素数：" +i);
	}
	//这个就是算素数嘛，我觉得讲的通啊
	public static void main (String[] args) {
		PrimeNumber a = new PrimeNumber();
		a.judge();
	}
}
