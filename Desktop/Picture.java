package homework;

public class Picture {
//没有需要定义的属性和构造方法
	public void one() {
		for(int i=1; i<7; i++)
			if(i == 4)
				System.out.print("*");
			else
				System.out.print(" ");
		System.out.println(" "); 
	}
//通过for循环实现第一行的样子
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
/*(1)将这七个模块分开来实现
*（2）每一行的图案实则是由七个——或者*或者+构成，所以需要循环来实现
*/