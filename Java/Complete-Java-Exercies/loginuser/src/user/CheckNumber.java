package user;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CheckNumber extends TagSupport{
	private String num;
	@Override
	public int doEndTag() throws JspException {
		int n = Integer.parseInt(num);
		JspWriter out = pageContext.getOut();
		if(n%2==0) {
			try{out.println("Even Number");}catch(Exception e) {}
		}
		else {
			try{out.println("Odd Number");}catch(Exception e) {}
		}
		return 0;
	}
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
}
