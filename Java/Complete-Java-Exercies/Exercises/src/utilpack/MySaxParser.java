package utilpack;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySaxParser extends DefaultHandler{
	@Override
	public void startDocument() throws SAXException {
		System.out.println("will get invoked before the processing of the doc");
	}
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("<"+qName+">");
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}
	@Override
	public void endDocument() throws SAXException {
		System.out.println("will given invoked after the processing of the doc");
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String s = new String (ch, start,length);
		System.out.println(s);
	}
	public static void main(String[] args) throws Exception {
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser sp = spf.newSAXParser();
		sp.parse(new File("books.xml"), new MySaxParser());
	}
}
