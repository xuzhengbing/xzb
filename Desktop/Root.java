package homework;

public class Root {

	int a; int b; int c;
	
	public Root(int A, int B, int C) {
		a = A;
		b = B;
		c = C;
	}   /*构造方法是为了后面new的时候直接在（）中填写参数
	    *构造方法中定义的参数要和属性挂钩，将构造方法中的参数赋值给属性形参
	    *以便在后面的方法中使用的是属性名的时候才具有意义 
	    */
	
	
	public void judge() {
		double darta; double priceone = 0; 
		double pricetwo = 0; double price = 0;
		darta = b*b - 4*a*c;
		if(darta > 0) {
			priceone = ((-b) - (Math.sqrt(darta)))/2;
			pricetwo = ((-b) + (Math.sqrt(darta)))/2;
			System.out.print("第一个解：" +priceone);
			System.out.println("第二个解：" +pricetwo);
		}//函数要求是double类型，所以定义都要是double.
		else if(darta == 0) {
				price = ((-b) - (Math.sqrt(darta)))/2;
				System.out.println("解为：" +price);
			}
		else if(darta < 0) {
		    	System.out.println("没有解");
			}
	}//根有三种情况，而且这三种情况不能使用嵌套if语句。只能使用多重if。
	
	
	public static void main(String[] args) {
		Root a = new Root(5, 10, 3);
		a.judge();
	}
}
//为什么不能用else
//为什么输出的是零。
