package dayslater;

import java.io.FileInputStream;
import java.util.Properties;

public class PaintContainer {
	public static PaintBrush<Paint> getBrush() throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("config.properties"));
		String brushclass = prop.getProperty("paintbrush");
		String paintclass = prop.getProperty("paintclass");
		PaintBrush<Paint> brush = (PaintBrush<Paint>) Class.forName(brushclass).getDeclaredConstructor().newInstance();
		Paint paint = (Paint)Class.forName(paintclass).getDeclaredConstructor().newInstance();
		brush.setT(paint);
		return brush;
	}
}
