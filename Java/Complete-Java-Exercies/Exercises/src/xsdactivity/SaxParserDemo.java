package xsdactivity;
import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserDemo {

	public static void main(String[] args) throws Exception {
		SchemaFactory schemaFactory = SchemaFactory
			    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = schemaFactory.newSchema(new File("./EmployeeDetailsSchema.xsd"));
			SAXParserFactory saxFactory = SAXParserFactory.newInstance();
			saxFactory.setSchema(schema);
			SAXParser parser = saxFactory.newSAXParser();
			parser.parse("EmployeeDetails.xml", new DefaultHandler() {
			  @Override
			  public void error(SAXParseException e) throws SAXException {
			    System.out.println(e.getMessage());;
			  }
		});
	}
}
