package Amazon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPattern {

	public static void main(String[] args) {
		String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String email = "shaanb4u@yahoo.com";
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(email);
		if(match.matches())
			System.out.println("Valid Email");
		else
			System.out.println("Wrong Email");
	}

}
