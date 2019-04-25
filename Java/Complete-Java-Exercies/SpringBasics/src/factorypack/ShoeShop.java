package factorypack;


abstract public class ShoeShop implements Seller { 
	private ShoeFactory factory;

	public ShoeFactory getFactory() {
		return factory;
	}

	public void setFactory(ShoeFactory factory) {
		this.factory = factory;
	}
	public void init() {
		System.out.println("init method called ... ");
	}
	public void destroy() {
		System.out.println("destroy method called ...");
	}
	abstract public void dummy();
}

class LuckyShoeShop extends ShoeShop {
	@Override
	public Shoe sellShoe(Customer c) {
		// TODO Auto-generated method stub
		return getFactory().makeShoe();
	}

	@Override
	public void dummy() {
		// TODO Auto-generated method stub
		System.out.println("dummy method called");
		
	}
	
}