package polyinterface_new;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Marty Stepp");
		names.add("Stuart Reges");
		
		String teacher = names.get(0);
		System.out.println(teacher);
		
		names.add("Muhammad Rajja");
		
		for (String name : names) {
			System.out.println(name);
		}
		
		List<Geom2D> bdatar = new ArrayList<Geom2D>();
		
		Square asquare = new Square(12);
		Circle acircle = new Circle(7);
		
		bdatar.add(acircle);
		bdatar.add(asquare);
		bdatar.add(new Square(5));
		
		for (Geom2D geom : bdatar) {
			System.out.println(geom);
		}
	}
}
