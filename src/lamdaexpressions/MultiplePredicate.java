package lamdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MultiplePredicate {
	String name;
	String location;
	String dept;
	
	MultiplePredicate(String name,String location,String dept)
	{
		this.name=name;
		this.location=location;
		this.dept=dept;
	}
}
class Test
{
	public static void main(String[] args) {
		ArrayList<MultiplePredicate> al=new ArrayList<>();
		MultiplePredicate p1=new MultiplePredicate("Kohli","Bengalore","Captain");
		MultiplePredicate p2=new MultiplePredicate("Rohit","Mumbai","I captain");
		MultiplePredicate p3=new MultiplePredicate("Dhoni","Chennai","ex captain");
		MultiplePredicate p4=new MultiplePredicate("Duplesis","Bengalore","Captain");
		
		List<MultiplePredicate> list=Arrays.asList(p1,p2,p3,p4);
		Predicate<MultiplePredicate> d1=(e)->e.location.equals("Bengalore");
		Predicate<MultiplePredicate> d2=(e)->e.dept.equals("Captain");
		Predicate<MultiplePredicate> d3=(e)->e.name.startsWith("K");
		
		Predicate<MultiplePredicate> p=d1.or(d2);
		
		for(MultiplePredicate m:list)
		{
			if(p.test(m))
			{
				System.out.println(m.name);
			}
		}
		
	}
}
