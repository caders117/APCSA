
public class Test {
	public static void main(String[] args) {
		String[] a = "the lazy brown fox jumped over the quick dog".split(" ");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + "/");
	}
}
