//converting map to array

import java.util.*;
import java.util.stream.*;

class Test{
	public static void main(String args[]){
		int a[] = {1,5,625,3,9,1,3};

		String s[] = {"a","b","c","d","e","f"};


		TreeMap<Integer,String> map = new TreeMap<Integer,String>();

		int n = a.length<s.length?a.length:s.length;
		for(int i=0;i<n;i++){
				map.put(a[i],s[i]);
		}
		System.out.println(map);


		//iterate a map
		//M1	
		for(Map.Entry e :map.entrySet() ){
				System.out.println(e.getKey() +" : "+e.getValue());
		}


		//M2	
		map.entrySet().stream().forEach((x)->System.out.println(x.getKey()+ " : : "+x.getValue()));


		//convert keys to int[]
		
		int[] keyA = map.keySet().stream().mapToInt(Integer::intValue).toArray();

		String[] Val = map.values().toArray(new String[0]);

		System.out.println(Arrays.toString(keyA));
		System.out.println(Arrays.toString(Val));






	}
}
