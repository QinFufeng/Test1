

import java.util.*;

public class tongXunLu {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Map<String,String> all = new HashMap<String,String>();
		all.put("阿一", "893830000");
		all.put("阿二", "332652222");
		all.put("阿三", "124417777");
		all.put("阿四", "913545555");
		all.put("阿五", "204273333");
		all.put("阿六", "892596666");
		all.put("阿七", "227219999");
		all.put("阿八", "988234444");
		all.put("阿九", "799208888");
		all.put("阿十", "666150111");
		boolean bool=true;
		while(bool){
			
			System.out.println("1.查询全部   2.按姓名查询   3.按号码查询   4.退出");
			System.out.print("选项：");
			Scanner scanner = new Scanner(System.in);
			int chooise=0;
			chooise = scanner.nextInt();
			switch(chooise){
				case 1:
					System.out.println(all);	
					break;
				case 2:
					String name;
					name = scanner.next();
					System.out.println(all.get(name));
					break;
				case 3:
					String phone;
					phone = scanner.next();
					Iterator<Map.Entry<String,String>> entries = all.entrySet().iterator(); 
					while (entries.hasNext()) {  						  
					    Map.Entry<String,String> entry = entries.next();  
					    if(entry.getValue().compareTo(phone)==0){
					    	//System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());  
						    System.out.println(entry);						    
					    }					  
					}  
					break;
				case 4:
					bool=false;
					System.out.println("程序退出!");
					break;
			}
			
		}
		
	}

	
}
