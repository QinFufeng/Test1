
public class J041502 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.print();
		s1.smax();
		s1.bjg();
		Student s2=new Student("����","1452658","��ʦ����",45,78,95,68);
		s2.print();
		s2.smax();
		s2.bjg();
		Student s3=new Student("����","1452654","����",56,78,55,68);
		s3.print();
		s3.smax();
		s3.bjg();

	}

}
class Student
{
	private String name;
	private String num;
	private String zhuany;
	private int ywcj;
	private int wlcj;
	private int english;
	private int hxcj;
	public Student()
	{
		name="����";
		num="147852369";
		zhuany="�����";
		ywcj=50;
		wlcj=89;
		english=69;
		hxcj=38;
	}
	public Student(String a,String b,String c,int d,int e,int f,int g)
	{
		name=a;
		num=b;
		zhuany=c;
		ywcj=d;
		wlcj=e;
		english=f;
		hxcj=g;
	}
	public void print()
	{
		System.out.println("����:"+name+"ѧ��:"+num+"רҵ:"+zhuany);
		System.out.println("���ĳɼ�:"+ywcj+"\t"+"����ɼ�:"+wlcj+"\t"+"Ӣ��ɼ�:"+english+"\t"+"��ѧ�ɼ�:"+hxcj);
		System.out.println("ƽ���֣�"+ave());
	}
	public double ave()
	{
		return (ywcj+wlcj+english+hxcj)/4;
	}
	public void smax()
	{
		int [] t={ywcj,wlcj,english,hxcj};
		String [] zuigao={"����","����","Ӣ��","��ѧ"};
		int m=t[0];
		for(int i=1;i<t.length;i++)
		{
			if(t[i]>m)
			{
				m=t[i];
			}
		}
		System.out.println("�����߷��ǣ�"+m);
		System.out.print("�����߷ֿ�Ŀ�ǣ�");
		for(int i=0;i<t.length;i++)
		{
			if(t[i]==m)
			{
				System.out.print(zuigao[i]+" ");
			}
		}
		System.out.println();
	}
	public void bjg()
	{
		System.out.println("������Ŀ�Ŀ��");
		int [] t={ywcj,wlcj,english,hxcj};
		String [] z={"����","����","Ӣ��","��ѧ"};
		for(int i=0;i<t.length;i++)
		{
			if(t[i]<60)
			{
				System.out.print(z[i]+":"+t[i]+"   ");
			}
		}
		System.out.println();
	}
}
