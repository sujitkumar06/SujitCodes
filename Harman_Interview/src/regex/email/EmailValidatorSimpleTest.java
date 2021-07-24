package regex.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidatorSimpleTest {

	    private static final String EMAIL_PATTERN = "^[ a-zA-Z0-9_.+-]+@[a-zA-Z.]+$";

	    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

	    public static boolean isValid(final String email) {
	        Matcher matcher = pattern.matcher(email);
	        return matcher.matches();
	    }

	

public static void main(String...args) {
	
String str="m sujit@gmail.com";
	boolean check=EmailValidatorSimpleTest.isValid(str);
	System.out.println(str +" : "+check);
}
}
