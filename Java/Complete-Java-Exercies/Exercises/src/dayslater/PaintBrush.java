package dayslater;

public class PaintBrush <T> {
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

class Paint{}
class RedPaint extends Paint{}
class BluePaint extends Paint{}
