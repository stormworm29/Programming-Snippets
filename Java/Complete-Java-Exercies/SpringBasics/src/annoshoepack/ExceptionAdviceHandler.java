package annoshoepack;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdviceHandler implements ThrowsAdvice{
	public void afterThrowing(ShoeException se) {
		System.out.println("Exception is handled");
	}
}
