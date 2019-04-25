package day2;

class AccessDemoDIff extends AccessDemo {
	private int pri;
	protected int pro;
	public int pub;
	int nomod;
	public void method() {
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(pub);
		System.out.println(nomod);
	}
}
