
public class J041502 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.print();
		s1.smax();
		s1.bjg();
		Student s2=new Student("李四","1452658","教师教育",45,78,95,68);
		s2.print();
		s2.smax();
		s2.bjg();
		Student s3=new Student("王武","1452654","体育",56,78,55,68);
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
		name="张三";
		num="147852369";
		zhuany="计算机";
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
		System.out.println("姓名:"+name+"学号:"+num+"专业:"+zhuany);
		System.out.println("语文成绩:"+ywcj+"\t"+"物理成绩:"+wlcj+"\t"+"英语成绩:"+english+"\t"+"化学成绩:"+hxcj);
		System.out.println("平均分："+ave());
	}
	public double ave()
	{
		return (ywcj+wlcj+english+hxcj)/4;
	}
	public void smax()
	{
		int [] t={ywcj,wlcj,english,hxcj};
		String [] zuigao={"语文","物理","英语","化学"};
		int m=t[0];
		for(int i=1;i<t.length;i++)
		{
			if(t[i]>m)
			{
				m=t[i];
			}
		}
		System.out.println("你的最高分是："+m);
		System.out.print("你的最高分科目是：");
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
		System.out.println("不及格的科目：");
		int [] t={ywcj,wlcj,english,hxcj};
		String [] z={"语文","物理","英语","化学"};
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
