package springpack;

public class PaintBrush {
	private Paint paint;

	public Paint getPaint() {
		return paint;
	}

	public void setPaint(Paint paint) {
		this.paint = paint;
	}
	
}
abstract class Paint {
	public abstract void doPaint();
}
 class BluePaint extends Paint{

	@Override
	public void doPaint() {
		System.out.println("Blue paint");
		
	} }