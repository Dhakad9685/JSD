package vertusa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Janki {
	public static void main(String args[]){
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		Object arr [] = list.toArray();
		int iarr[] = new int[list.size()];
		for(int i=0;i<list.size();i++){
			iarr[i] = (Integer)arr[i];
		}
		
		for(int i = 0;i<arr.length;i++){
			if(hm.containsKey(iarr[i])){
				hm.put(iarr[i], hm.get(iarr[i])+1);
			}
			else{
				hm.put(iarr[i], 1);
			}
		}
		
		
		//for(Map.Entry<K, V>)
		
		
		
		
		
		
	}
}
