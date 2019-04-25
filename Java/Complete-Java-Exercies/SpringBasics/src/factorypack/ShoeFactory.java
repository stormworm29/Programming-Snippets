package factorypack;

abstract public class ShoeFactory implements Manufacturer {
	private Shoe shoe;
	public Shoe getShoe() {
		return shoe;
	}
	public void setShoe(Shoe shoe) {
		this.shoe = shoe;
	}
}
class Bata extends ShoeFactory {
	@Override
	public Shoe makeShoe() {
		return getShoe();
	} 
	
}
class Lakhani extends ShoeFactory {

	@Override
	public Shoe makeShoe() {
		return getShoe();
	}
}