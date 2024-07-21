package lamdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CheckStringList {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("chandu");
		list.add("Kohli");
		list.add("vinay");
		list.add("Rohit");
		list.add("Dhoni");
		list.add("ramesh");
		for(String s:list)
		{
		Predicate<String> pr=(str)->str.length()==5;
		if(pr.test(s))
			System.out.println(s);
		}
	}
}

