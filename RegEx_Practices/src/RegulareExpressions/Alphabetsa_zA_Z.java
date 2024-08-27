package RegulareExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alphabetsa_zA_Z {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[a-zA-Z]{15}");
		Matcher m=p.matcher(args[0]);
		
		System.out.println(m);

	}

}
