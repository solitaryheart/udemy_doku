package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		String regex = "\\bgreen";
		String inputString = "All flowers are green, but my rose is dark green. I like lot of green rosesgreen";
		
		Pattern pat = Pattern.compile(regex);
		Matcher matcher = pat.matcher(inputString);
		String str = matcher.replaceAll("red");
		System.out.println(str);
		
		
	}

}
