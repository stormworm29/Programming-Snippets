package dayslater;

public class WaterContainer {
	public static PaintBrush<Water> getBrush() throws Exception {
		PaintBrush<Water> brush = (PaintBrush<Water>) Class.forName("dayslater.PaintBrush").newInstance();
		Water water = new Water();
		brush.setT(water);
		return brush;
	}
}
