package applicationcontext;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class InvoiceAction extends TagSupport{
	@Override
	public int doEndTag() throws JspException {
		Enumeration<String> attributes = pageContext.getSession().getAttributeNames();
		DBActionImpl dbcon = new DBActionImpl();
		HttpSession sess = pageContext.getSession();
		JspWriter out = pageContext.getOut();
		int sum=0;
		String param = (String) sess.getAttribute("lang");
		Locale currentLocale = new Locale(param);
		ResourceBundle rb = ResourceBundle.getBundle("dictionary",currentLocale);
		try {
			while (attributes.hasMoreElements()) {
			    String attribute = attributes.nextElement();
			    if(!(attribute.equals("handler") || attribute.equals("next") || attribute.equals("name") || attribute.equals("lang"))) {
			    	int value = dbcon.getValue((String)sess.getAttribute(attribute));
			    	out.println(rb.getString((String)sess.getAttribute(attribute)) + " : " + value + "<br/>");
			    	sum += value;
			    }
			}	
			out.println(rb.getString("totalval") + " : " + sum); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return super.doEndTag();
	}

}
