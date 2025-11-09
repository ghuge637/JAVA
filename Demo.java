//Given an array of department names, print how many employees belong to each department.
package hummingbird;

import java.util.HashMap;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
//		String[] departments = str.split("\\s+");
		String[] departments = str.split("\\s+");
		 
		HashMap<String, Integer> map = new HashMap<>();
		
			for(String dept: departments) {
				dept=dept.trim();
				if(dept.isEmpty())
					continue;
				
				if(map.containsKey(dept)) {
					map.put(dept, map.get(dept)+1);
				}else {
					map.put(dept, 1);
				}
			}
			
			for (String key : map.keySet()) {
			    System.out.println(key + " : " + map.get(key));
			}
	}
}
