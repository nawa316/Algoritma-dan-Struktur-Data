package polyinterface_new;

public class Test {

	public static void main(String[] args) {
		
		Square asquare = new Square(12);
		Circle acircle = new Circle(7);
		
		/*
		System.out.println(asquare.getArea());
		System.out.println(asquare);
		asquare.drawIllustration();
		*/
		
		Geom2D[] bdatar = new Geom2D[5];
		
		bdatar[0] = asquare;
		bdatar[1] = acircle;
		
		for (Geom2D geom : bdatar) {
			if (geom != null) {
				System.out.println(geom);
				System.out.println("Dengan luas: " + geom.getArea());
				System.out.println("dan keliling: " + geom.getPerimeter());
				System.out.println();
			}
		}
		
		// Triangle atriangle = new Triangle();
		// Geom2D geom = new Geom();
	}
}
