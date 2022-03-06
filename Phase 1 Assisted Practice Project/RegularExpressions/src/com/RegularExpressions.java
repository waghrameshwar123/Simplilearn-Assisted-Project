package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

public static void main(String[] args) {

	String pattern = "e";
	String check = "Regular Expressions";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find()) {
 //     	System.out.println( check.substring( c.start(), c.end() ) );
			System.out.println("Start "+c.start());
		//	System.out.println("End "+c.end());

	}
}
}

