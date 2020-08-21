package implementation;

import java.util.*;
import java.util.Map.Entry;
public class Killjee_and_easy_problem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Long n=scan.nextLong();
		Long m=scan.nextLong();
		ArrayList<Long>list=new ArrayList<>();
		for(Long i=(long) 0;i<(2*n);i++) 
			list.add(scan.nextLong());
		check(list,n,m);
	}
	static void check(ArrayList<Long>list,Long n,Long m) {
		HashMap<Long,Long>map=new HashMap<Long,Long>();
		
		Long count;
		for(int i=0;i<list.size();i++) {
			if(map.containsKey(list.get(i))) {
				count=map.get(list.get(i));
				map.put(list.get(i),count-1);
				}
			else
				map.put(list.get(i),(long) 1);
		}
		ArrayList<Long>list2=new ArrayList<>();
		for(Entry<Long, Long> entry:map.entrySet()) {
			if(entry.getValue()==0) {
				list2.add(entry.getKey());
				}
		}
		System.out.println(list2.size());
		for(int i=0;i<list2.size();i++)
		System.out.print(list2.get(i)+" ");
	}

}

