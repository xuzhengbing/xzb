package homework;

public class PrimeNumber {
	
	public void judge() {
		for(int number=50; number<100; number++)
			for(int denominator=2; denominator<number; denominator++)
				if(number % denominator == 0)
					break;
				else if(number % denominator != 0)
					     if(denominator == number-1)
						     System.out.println("素数：" +number);
	}
	//这里有几个循环。第一个循环是循环50—10.第二个循环是分母从2到分子-1.
	//双重for语句可以循环双重循环，双重if可以进行双重判断。
	public static void main (String[] args) {
		PrimeNumber a = new PrimeNumber();
		a.judge();
	}
}
