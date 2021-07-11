package Hit.day27;

import java.util.ArrayList;
import java.util.List;

public class GenericsInCollection {
public static void main(String[] args) {
	List<String>list=new ArrayList<>();
	
	list.add("aaa");
	list.add("bbbb");
	list.add("ccccc");
	for(Object ob:list) {
		String s=(String)ob;
		System.out.println(s);
	}
	}
}
