package lamdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Person {
	String name;
	int age;
	
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class PredicatePersons
{
	public static void main(String[] args) {
		Person p1=new Person("Kohli",34);
		Person p2=new Person("Dhoni",40);
		Person p3=new Person("Rohith",36);
		Person p4=new Person("Gill",24);
		Person p5=new Person("Babar",28);
		
		List<Person> cricketers=Arrays.asList(p1,p2,p3,p4,p5);
		
		Predicate<Person> pr=persons->persons.age>=30;
		
		for(Person p:cricketers)
		{
			if(pr.test(p))
				System.out.println(p.name);
		}
	}
}


