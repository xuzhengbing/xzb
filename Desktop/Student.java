
public class Student {
	public int m_id;
	public int m_age;
	
	public Student() {
		setdata(2018010400, 19);
	}
	/*���췽��һ������Ը�ֵ��Ҳ����ֱ�Ӹ���Ա������ֵ��
	 * ����������Ŀ����ʲô��
	 */
	public Student(int id, int age) {
		setdata(id, age);
	}
    /*���췽����д��������һ����
     * 
     */
	public void setdata(int id, int age) {
		m_id = id;
		m_age = age;
	}
	/*m_age �� age Ҫע�����ֿ��������������
	 * �����Ա�����Ĳ����������ڵڶ������췽������Ŀ���Ƿ��㷽������ʱ�ڸ�ֵ��
	 * ����д���ŵ����ڸ�ֵ���ӵ������㡣
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
		System.out.print("jack��ѧ����" + jack.m_id);
		//�ڷ������õ�ʱ��ϵͳ����ݲ����б���Զ�ƥ����֮��ͬ�ĳ�Ա�������Դ�ʵ�ֶ�Ӧ���
		System.out.println("jack��������" + jack.m_age);
		//jack���õķ���û���漰���䰡����ô�õ�����19��
		System.out.print("lisa��ѧ����" + lisa.m_id);
		System.out.println("lisa��������" + lisa.m_age);
	}
}
//ע�������ǳ�Ա�������ǹ��췽����д�Ĺؼ����ڲ����б����Ŀ��������Ҫ��ͬ������ϵͳ����ȥƥ�䣬��������ͬ�ǲ��߱��ж��Ե� 