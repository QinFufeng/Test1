

import java.util.*;

public class tongXunLu {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Map<String,String> all = new HashMap<String,String>();
		all.put("��һ", "893830000");
		all.put("����", "332652222");
		all.put("����", "124417777");
		all.put("����", "913545555");
		all.put("����", "204273333");
		all.put("����", "892596666");
		all.put("����", "227219999");
		all.put("����", "988234444");
		all.put("����", "799208888");
		all.put("��ʮ", "666150111");
		boolean bool=true;
		while(bool){
			
			System.out.println("1.��ѯȫ��   2.��������ѯ   3.�������ѯ   4.�˳�");
			System.out.print("ѡ�");
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
					System.out.println("�����˳�!");
					break;
			}
			
		}
		
	}

	
}
