public class DemoBruch {

	public static void main(String[] args) {
		
		Bruch b1 = new Bruch(3, 4);

		System.out.println(b1.toDecimal());
		b1.print();

		System.out.println("Anzahl Brüche: " + Bruch.Counter);

		Bruch b2 = new Bruch(5, 7);
		System.out.println("Anzahl Brüche: " + Bruch.Counter);

		Bruch erg = b1.multiplicate(b2);
		erg.print();

		Bruch b3 = new Bruch(1, 2);
		System.out.println("Anzahl Brüche: " + Bruch.Counter);

		Bruch erg2 = b1.multiplicate(b2, b3);
		erg2.print();
		System.out.println("Anzahl Brüche: " + Bruch.Counter);

	}

}
