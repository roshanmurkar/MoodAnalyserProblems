package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoodFind {
	public String analyseMood(String str) {
		int flag1=0,flag2=0;
		Pattern pattern =Pattern.compile("happy|Happy");
		Matcher matcher=pattern.matcher(str);
		while(matcher.find()) {
			flag1=1;
		}
		
		pattern =Pattern.compile("sad|Sad");
		matcher=pattern.matcher(str);
		while(matcher.find()) {
			flag2=1;
		}
		
		if(flag1==1) {
			return "HAPPY";
		}
		else if(flag2==1) {
			return "SAD";
		}else {
			return "HAPPY";
		}
		
		
	}
}
