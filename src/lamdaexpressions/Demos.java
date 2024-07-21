package lamdaexpressions;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Demos {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<String> list=Arrays.asList("Manikanta","chandu","harsha","srinivas");
			Supplier<String> supplier=()->{
				String name="";
				for(String n:list)
				{
					name+="\n"+n;
					continue;
				}
				return name;
			};
			System.out.println(supplier.get());
			
		}

	}

	

