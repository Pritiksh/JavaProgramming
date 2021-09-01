package JavaProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		String[] str= {"Amazon","GCP","Azure","Amazon","Ali Baba","Amazon","SauceLabs","Azure","GCP"};
		//1.brute force
		//2.HashSet
		//3.HashMap
		//4.Streams
		
		System.out.println("brute force");
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j]) {
					System.out.println(str[i]);
					
				}
			}
		}
		
		System.out.println("********HashSet*********");
		Set<String> data = new HashSet<String>();
		for(String e:str) {
			if(data.add(e)==false) {
				System.out.println(e);
			}
		}
		
		System.out.println("*******HashMap*****");
		Map<String,Integer> strMap=new HashMap<String,Integer>();
		for(String hm:str) {
			Integer count = strMap.get(hm);
			if(count==null) {
				strMap.put(hm, 1);
			}
			else {
				strMap.put(hm, ++count);
			}
		}
		//Print all duplicate elements
		Set<Entry<String,Integer>> entrySet = strMap.entrySet();
		for(Entry<String,Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
				
			}
		}
		System.out.println("*******Streams*******");
		System.out.println("-----");
	}

}
