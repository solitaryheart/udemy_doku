package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {

	public static void main(String[] args) {
		
		String regex = "\bgreen\b";
		String inputString = "All flowers are green, but my rose is dark green. I like lot of green roses ";

		  
			Pattern pat = Pattern.compile(regex);
			Matcher matcher = pat.matcher(inputString);
			String str = matcher.replaceAll("red");
			System.out.println(str);
		   
	}

}
