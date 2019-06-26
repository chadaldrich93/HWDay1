class AsciiArt{
	
	public static void main(String[] args) {
	    pattern1();
	    System.out.println();
	    pattern2();
	    System.out.println();
	    pattern3();
	    System.out.println();
	    pattern4();
	}
	
	public static void pattern1() {
		String stars = "";
		for (int i = 0; i < 4; i++) {
			stars += '*';
			System.out.println(stars);
		}
		System.out.println(".........");
	}	
	
	public static void pattern2() {
		System.out.println("..........");
		for (int j = 4; j > 0; j--) {
		    for (int i = j; i > 0; i--) 
			    System.out.print("*");
			System.out.println();
		}
	}
	
	public static void pattern3() {
		int startSpaces = 5;
		for (int j = 0; j < 4; j++) {
			for (int i = startSpaces; i > 0; i--)
				System.out.print(" ");
			for (int h = 11 - (startSpaces * 2); h > 0; h--)
				System.out.print("*");
			for (int g = startSpaces; g > 0; g--)
				System.out.print(" ");
			System.out.println();
			startSpaces--;
		}
		System.out.println("...........");
	}
	
	public static void pattern4() {
		System.out.println("............");
		int startSpaces = 2;
		for (int j = 0; j < 4; j++) {
			for (int i = startSpaces; i > 0; i--)
				System.out.print(" ");
			for (int h = 11 - (startSpaces * 2); h > 0; h--)
				System.out.print("*");
			for (int g = startSpaces; g > 0; g--)
				System.out.print(" ");
			System.out.println();
			startSpaces++;
		}
	}
}