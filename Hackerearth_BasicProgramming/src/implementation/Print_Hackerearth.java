package implementation;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class Print_Hackerearth {

	static int countofprint=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s=scan.next();
		HashMap<Character,Integer>map=new HashMap<>();
		char [] arr=s.toCharArray();
		int count;
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				count=map.get(arr[i]);
				map.put(arr[i],count+1);}
			else
				map.put(arr[i],1);
		}
		int res=check(arr,map);
		if(res!=-1)
			System.out.print(res);
	}
	
	static int check(char[] arr,HashMap<Character,Integer>map) {
		//for(Entry<Character,Integer>entry:map.entrySet()) 
			//System.out.print(entry.getKey()+"-"+entry.getValue());
		
		if(map.containsKey('h')) {
			int count2=map.get('h');
			if(count2>=2)
				map.put('h',count2-2);
			else
				return countofprint;
			}
		if(map.containsKey('a')) {
			int count2=map.get('a');
			if(count2>=2)
				map.put('a',count2-2);
			else
				return countofprint;
			}
		if(map.containsKey('c')) {
			int count2=map.get('c');
			if(count2>=1)
				map.put('c',count2-1);
			else
				return countofprint;
			}
		if(map.containsKey('k')) {
			int count2=map.get('k');
			if(count2>=1)
				map.put('k',count2-1);
			else
				return countofprint;
			}
		if(map.containsKey('t')) {
			int count2=map.get('t');
			if(count2>=1)
				map.put('t',count2-1);
			else
				return countofprint;
			}
		if(map.containsKey('e')) {
			int count2=map.get('e');
			if(count2>=2)
				map.put('e',count2-2);
			else
				return countofprint;
			}
		if(map.containsKey('r')) {
			int count2=map.get('r');
			if(count2>=2)
				map.put('r',count2-2);
			else
				return countofprint;
			}
		
		countofprint=countofprint+1;
		check(arr, map);
		return countofprint;
	}

}
