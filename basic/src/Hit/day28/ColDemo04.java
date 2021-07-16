package Hit.day28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo04 {
	public static void main(String[] args) {
		Set<String> set= new TreeSet<String>();
		set.add("hello");
		set.add("hai");
		set.add("hello");
		set.add("world");
		set.add("earth");
		
		System.out.println(set);
		set.add("zebra");
		set.add("almighty");
		
		System.out.println(set);
		
		Iterator iter=set.iterator();
		while(iter.hasNext());
		System.out.println(iter.next());	
	
	
	for(String s:set) {
		System.out.println(s);
	}

}
}


