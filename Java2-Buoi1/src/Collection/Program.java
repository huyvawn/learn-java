package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//List, ArrayList
		List<String> namelist = new ArrayList<>();
		namelist.add("Tien");
		namelist.add("Binh");
		namelist.add("Quang");
		namelist.add("Tien");
		System.out.println("Array List: " + namelist);
		System.out.println(namelist.get(1));
		//Set -> HashSet, LinkedHashSet, TreeSet
		Set<String> namelisthashset = new HashSet<>();
		namelisthashset.add("Tien");
		namelisthashset.add("Binh");
		namelisthashset.add("Quang");
		namelisthashset.add("Tien");
		System.out.println("HashSet: " + namelisthashset);
		
		// Set luu nhung gia tri duy nhat (unique values)
		// LinkedHashSet luu theo thu tu
		// TreeSet lưu theo alphabet
		Set<String> namelistlinked = new LinkedHashSet<String>();
		namelistlinked.add("Tien");
		namelistlinked.add("Binh");
		namelistlinked.add("Quang");
		System.out.println("LinkedHashSet: " + namelistlinked);
		
		Set<String> nametreeset = new TreeSet<String>();
		nametreeset.add("Tien");
		nametreeset.add("Binh");
		nametreeset.add("Quang");
		System.out.println("TreeSet: " + nametreeset);
		
		// Map ->	HashMap, LinkedHashMap, TreeMap
		// Key - Value
		Map<String, Integer> hashmap = new HashMap<String, Integer>() ;
			hashmap.put("A", 1);
			hashmap.put("C", 2);
			hashmap.put("B", 3);
			System.out.println("Hashmap: " + hashmap);
		
		Map<String, Integer> linkedhashmap = new LinkedHashMap<String, Integer>() ;
			linkedhashmap.put("A", 1);
			linkedhashmap.put("C", 2);
			linkedhashmap.put("B", 3);
			System.out.println("LinkedHashmap: " + linkedhashmap);
			
		Map<String, Integer> treemap = new TreeMap<String, Integer>() ;
			treemap.put("C", 1);
			treemap.put("A", 2);
			treemap.put("B", 3);
			System.out.println("Treemap: " + treemap);
	}

}
