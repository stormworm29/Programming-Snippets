package applicationcontext;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class LanguageAction extends TagSupport{
	private String name;
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		HttpSession session = pageContext.getSession();
		JspWriter out = pageContext.getOut();
		String param = (String) session.getAttribute("lang");
		Locale currentLocale = new Locale(param);
		ResourceBundle rb = ResourceBundle.getBundle("dictionary",currentLocale);
		try {
			out.println(rb.getString(name));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doEndTag();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
