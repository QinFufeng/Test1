

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yichang {

	public static void main(String[] args) throws iskong,hasnumber,hasdaxie,hasxiaoxie {
		// TODO 自动生成的方法存根
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(reader);
		try {
			String str=in.readLine();
			if(str.isEmpty())
			{
				iskong e=new iskong("输入的字符串为空");
				throw e;						
			}
			for(int i=0;i<str.length();i++)
			{
				char c=str.charAt(i);
				if(Character.isDigit(c))
				{
					hasnumber e=new hasnumber(str+"输入的字符串包含数字");
					throw e;
				}
			}
			for(int i=0;i<str.length();i++)
			{
				char c=str.charAt(i);
			    if(!Character.isLowerCase(c))
				{
					hasdaxie e=new hasdaxie(str+"输入的字符串包含大写字母");
					throw e;
				}
			}
			for(int i=0;i<str.length();i++)
			{
				char c=str.charAt(i);
				if(!Character.isUpperCase(c))
				{
					hasxiaoxie e=new hasxiaoxie(str+"输入的字符串包含小写字母");
					throw e;
				}
			}
		}catch(iskong e)		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(hasnumber e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(hasdaxie e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(hasxiaoxie e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}catch(Exception e){
			e.getMessage();			
		}
		
	}

}
class iskong extends Exception{
	public iskong(String mess){
		super(mess);	
	}
}
class hasnumber extends Exception{
	public hasnumber(String mess){
		super(mess);
	}
}
class hasdaxie extends Exception{
	public hasdaxie(String mess){
		super(mess);
	}
}
class hasxiaoxie extends Exception{
	public hasxiaoxie(String mess){
		super(mess);
	}
}
