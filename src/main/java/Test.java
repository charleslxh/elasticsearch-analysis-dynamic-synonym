import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	
	private boolean isUrl(String str) {
		String regex = "^(https?|ftps?|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	
	@org.junit.Test
	public void test() {
		System.out.println(this.isUrl( "https://api.daniujia.com/app/v1/synonym/list"));
		System.out.println(this.isUrl( "http://api.daniujia.com/app/v1/synonym/list"));
		System.out.println(this.isUrl( "http://115.19.172.241:80/app/v1/synonym/list"));
		System.out.println(this.isUrl( "app/v1/synonym/list"));
	}

}
