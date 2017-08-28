
public class J041501 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Sjx s1=new Sjx();
		s1.print();
		System.out.println("面积为:"+s1.area());
		System.out.println("周长为:"+s1.ccc());
		Sjx s2=new Sjx(7,8,5);
		s2.print();
		System.out.println("面积为:"+s2.area());
		System.out.println("周长为:"+s2.ccc());

	}

}
class Sjx
{
	private int a;
	private int b;
	private int c;
	public Sjx(){
		a=3;
		b=4;
		c=5;
	}
	public Sjx(int x,int y,int z)
	{
		if(z<(x+y) && x<(z+y) && y<(x+z))
		{
		    a=x;
		    b=y;
		    c=z;
		}
		else
			System.out.println("三边无效");
	}
	public double area()
	{
		double p=(a+b+c)/2;
		double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return s;
	}
	public double ccc()
	{
		return a+b+c;
	}
	public void print()
	{
		System.out.println("三边为:"+a+"，"+b+"，"+c);
	}
    	
}