package mypackage;

import java.util.Properties;
import org.w3c.tidy.Tidy;

/**
 * Created by az on 15/11/2016.
 */
public class MyClass {

	public static void main(String[] args) {
		Tidy tidy = new Tidy();
		tidy.setDropEmptyParas(false);
		tidy.setDropFontTags(false);
		tidy.setDropProprietaryAttributes(false);
		tidy.setTrimEmptyElements(false);
		tidy.setXHTML(true);
		tidy.setIndentAttributes(false);
		tidy.setIndentCdata(false);
		tidy.setIndentContent(false);
		tidy.setQuiet(true);
		tidy.setShowWarnings(false);
		tidy.setShowErrors(0);
		tidy.setEncloseBlockText(false);
		tidy.setEscapeCdata(false);
		tidy.setDocType("omit");
		Properties prop = new Properties();
		prop.put("new-blocklevel-tags", "canvas");
		tidy.getConfiguration().addProps(prop);
	}
}
