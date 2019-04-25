package utilpack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("a1", "ramu");
		m.put("a2", "somu");
		
		System.out.println(m.get("a1"));
		
		Set s = m.entrySet();
		Iterator iter = s.iterator();
		
		
		while(iter.hasNext()) {
			Map.Entry me = (Map.Entry) iter.next();
			System.out.println(me.getKey() + " : " + me.getValue());
		}
	}
}
