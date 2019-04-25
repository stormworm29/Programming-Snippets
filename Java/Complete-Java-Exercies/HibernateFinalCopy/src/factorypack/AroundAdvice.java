package factorypack;

import java.util.Vector;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor{
	Vector<Customer> v = new Vector<Customer>();
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		Customer cust = (Customer) arg0.getArguments()[0];
		if(v.contains(cust)) {
			throw new ShoeException("Only one show per customer ... ");
		}
		else {
			v.add(cust);
			return arg0.proceed();
		}
	}

}
