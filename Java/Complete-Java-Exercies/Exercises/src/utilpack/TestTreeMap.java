package utilpack;

import java.util.Map.Entry;
import java.util.Comparator;
import java.util.TreeMap;

class Dog implements Comparable<Dog>{
	String color;
	int size;
	int cost;
 
	Dog(String c, int s, int co) {
		this.color = c;
		this.size = s;
		this.cost = co;
	}
 
	public String toString(){	
		return color + " dog";
	}
 
	@Override
	public int compareTo(Dog o) {
		return  this.size - o.size ;
	}
}
 
public class TestTreeMap {
	public static void main(String[] args) {
		Dog d1 = new Dog("red", 30, 500);
		Dog d2 = new Dog("black", 20, 1000);
		Dog d3 = new Dog("white", 10, 200);
		Dog d4 = new Dog("white", 10, 1000);
 
		TreeMap<Dog, Integer> treeMap = new TreeMap<Dog, Integer>();
		treeMap.put(d1, 10);
		treeMap.put(d2, 15);
		treeMap.put(d3, 5);
		treeMap.put(d4, 20);
 
		for (Entry<Dog, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
class MyComp implements Comparator<Dog> {
	@Override
	public int compare(Dog d1, Dog d2) {
		return d2.cost - d1.cost;
	}
}