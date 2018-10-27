package homework;

public class PrimeSum {
	
	public void judge() {
		int sum = 0;
		for(int number=1; number<101; number++)
			for(int denominator=2; denominator<number; denominator++)
				if(number % denominator == 0)
					break;
				else if(number % denominator != 0)
						if(denominator == number - 1)
							sum = sum + number;
							System.out.println("一到一百的素数之和： " +sum);
	}
	//这里不需要通过返回类型的方法直接将得出来的number相加就是了
	public static void main(String[] args) {
		PrimeSum a = new PrimeSum();
		a.judge();
	}
}
