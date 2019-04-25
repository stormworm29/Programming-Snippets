package annoshoepack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

abstract public class ShoeFactory implements Manufacturer {
	@Autowired
	@Qualifier("ss")
	private Shoe shoe;
	public Shoe getShoe() {
		return shoe;
	}
	public void setShoe(Shoe shoe) {
		this.shoe = shoe;
	}
}

@Component("bsf")
class Bata extends ShoeFactory {
	@Override
	public Shoe makeShoe() {
		return getShoe();
	} 
}

@Component("lsf")
class Lakhani extends ShoeFactory {

	@Override
	public Shoe makeShoe() {
		return getShoe();
	}
}