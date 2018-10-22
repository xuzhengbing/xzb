
public class Student {
	public int m_id;
	public int m_age;
	
	public Student() {
		setdata(2018010400, 19);
	}
	/*构造方法一般给属性赋值，也可以直接给成员方法赋值。
	 * 但这样做的目的是什么？
	 */
	public Student(int id, int age) {
		setdata(id, age);
	}
    /*构造方法重写，参数不一样。
     * 
     */
	public void setdata(int id, int age) {
		m_id = id;
		m_age = age;
	}
	/*m_age 和 age 要注意区分开来，避免混淆。
	 * 这里成员方法的参数是依托于第二个构造方法，其目的是方便方法调用时在赋值。
	 * 这样写的优点在于赋值更加的灵活、方便。
	 */
	public void setdata(int id) {
		m_id = id;
	}
	
	public static void main(String args[])
	{
		Student jack = new Student();
		jack.setdata(2008010408);
		Student lisa = new Student();
		lisa.setdata(2008010428, 18);
		System.out.print("jack的学号是" + jack.m_id);
		//在方法调用的时候系统会根据参数列表会自动匹配与之相同的成员方法，以此实现对应输出
		System.out.println("jack的年龄是" + jack.m_age);
		//jack调用的方法没有涉及年龄啊，怎么得到年龄19的
		System.out.print("lisa的学号是" + lisa.m_id);
		System.out.println("lisa的年龄是" + lisa.m_age);
	}
}
//注意无论是成员方法还是构造方法重写的关键在于参数列表的数目或者类型要不同，这样系统才能去匹配，参数名不同是不具备判断性的 