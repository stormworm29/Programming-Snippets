package dayslater;

public class PaintDemo {
	public static void main(String[] args) throws Exception{
		PaintBrush<Paint> brush = PaintContainer.getBrush();
		Paint paint = brush.getT();
		System.out.println(paint);
	}
}
