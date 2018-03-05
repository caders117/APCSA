import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class Test {
	public static void main(String[] args) {
		Charset utf8 = Charset.forName("UTF-8");
		Charset def = Charset.defaultCharset();
		String charToPrint = "\uD83D\uDC26";
		System.out.println(charToPrint);
		}
}
