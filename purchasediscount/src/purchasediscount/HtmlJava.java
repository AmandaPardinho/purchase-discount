package purchasediscount;

import java.lang.*;
import java.util.*;

public class HtmlJava {
	private static String html;

	public static void writeHTML() {

		String writeHtml = new String();

		html = """
					<html>
						<body>
							<p>A bookstore gives a 10% discount to employees and a 5% discount to VIP clients.</p>
							<p>Calculate the amount to be paid by someone.</p>
							<p>The program should read the total amount to be paid and a code identifying if the client is an employee, a VIP, or an ordinary person.</p>
						</body>
					</html>	
				""";
		writeHtml.equals(html);
	}


}