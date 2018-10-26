package homework;

public class Sum {
	//没有属性和构造方法
	public void count() {
		double sum = 0;
		double b = 1;//最终的结果可能超过了int、long类型规定的范围
		for(int n=1; n<21; n++)
			for(int m=1; m<n+1; m++)
				b = b*n;
			sum = sum + b;
		System.out.println("总数：" +sum);
	}
	//两个循环，一个是循环1-20，另一个循环是为了实现乘积
	public static void main (String[] args) {
		Sum a = new Sum();
		a.count();		
	}
}
//在对问题或者算法进行中文讲述的时候，其实就已经蕴含了逻辑了，只需要将它翻译为中文就好了。
