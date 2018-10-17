//https://bridgei2i.com/extracting-data-from-webpages-in-java-with-help-of-htmlunit/
package html;

import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Wiki {
	public static void main(String []arg)throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		WebClient webClient = new WebClient(BrowserVersion.CHROME);
		HtmlPage page = webClient.getPage("https://www.wikipedia.org/");
		String result = page.asText();
		System.out.println(result);
	}

}
