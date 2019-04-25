package factorypack;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class PurchaseImpl extends DelegatingIntroductionInterceptor implements Purchase{

	@Override
	public void buyShoe() {
		// TODO Auto-generated method stub
		System.out.println("buys shoe method called ...");
	}

}
