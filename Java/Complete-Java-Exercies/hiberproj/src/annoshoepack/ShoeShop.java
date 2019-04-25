package annoshoepack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class ShoeShop implements Seller{
	@Autowired
	@Qualifier("lsf")
	private ShoeFactory factory;
	public ShoeFactory getFactory() {
		return factory;
	}

	public void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
}
