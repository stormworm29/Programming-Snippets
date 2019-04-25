package Parser;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;
public class XSDSaxValidation {
public static void main(String[] args) {
	XSDSaxValidation obj=new XSDSaxValidation();
	//obj.validateUsingSAX();
	obj.validateUsingDOM();
}

private void validateUsingSAX() {

        SAXParserFactory SF = SAXParserFactory.newInstance();

        SF.setValidating(true);

        SAXParser SP;
        try {
            SP = SF.newSAXParser();
            SP.setProperty(
                    "http://java.sun.com/xml/jaxp/properties/schemaLanguage",
                    "http://www.w3.org/2001/XMLSchema");
            SP.setProperty(
                    "http://java.sun.com/xml/jaxp/properties/schemaSource",
                    "books.xsd");
            SP.parse(new File("test.xml"), new MyHandler());
        } catch (Exception e) {
        	System.out.println(e);
    }

	}
private void validateUsingDOM() {
      DocumentBuilderFactory DF = DocumentBuilderFactory.newInstance();
        DF.setValidating(true);
        DF.setAttribute(
                "http://java.sun.com/xml/jaxp/properties/schemaLanguage",
                "http://www.w3.org/2001/XMLSchema");
        DF.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaSource",
                "books.xsd");
        try {

            DocumentBuilder DB = DF.newDocumentBuilder();
            DB.parse("books.xml");
        } catch (Exception e) {
        		System.out.println(e);
        }
} 
}
class MyHandler extends DefaultHandler{}