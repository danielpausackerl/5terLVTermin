
public class CharArray {

	private char[] charArray;

	public static int Counter = 0;

	public CharArray(char[] charArray) {
		this.charArray = charArray;
		Counter++;

	}

	public void print() {
		for (int i = 0; i < this.charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();
	}

	public void print(int start, int ende) {
		if (ende > charArray.length)
			ende = charArray.length;

		for (int i = start; i < ende; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();
	}
}
