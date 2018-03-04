
public class Test {
	public static void main(String[] args) {
		String[] a = "contents 1 1".split(" ");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + "/");
		System.out.println(a[1]);
	}
}
