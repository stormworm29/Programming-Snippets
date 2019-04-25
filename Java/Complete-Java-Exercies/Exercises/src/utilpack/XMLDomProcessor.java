package utilpack;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLDomProcessor {
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(true);
		dbf.setIgnoringElementContentWhitespace(true);
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse("books.xml");
		Element root = doc.getDocumentElement();
		Node node = root.getFirstChild();
		System.out.println(node);
		NodeList n1 = root.getChildNodes();
		for(int i=0; i<n1.getLength(); i++) {
			NodeList n12 = n1.item(i).getChildNodes();
			for(int j=0;j<n12.getLength();j++) {
				System.out.println(n12.item(j).getFirstChild().getNodeValue());
			}
		}
	}
}
