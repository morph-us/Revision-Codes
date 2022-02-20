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

		

		//sort
		

		






	}
}
