package utilpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ColDemo {
	
	public static void main(String[] args) {
//		Vector<String> v=new Vector<>();
//		List<String> v=new LinkedList<>();
//		Set<String> v = new HashSet<String>();
//		Set<String> v = new TreeSet<String>(new MyComparator());
		Set<Student> v = new TreeSet<Student>(new MyComparator());
		v.add(new Student("zbcd"));
		v.add(new Student("abcdefg"));
//		v.add("dfdfdf");
//		v.add("aaaa");
		System.out.println(v);
		System.out.println(v.size());
//		System.out.println(v.get(1));
//		for(int i=0;i<v.size();i++) {
//			System.out.println(v.get(i));
//		}
//		for(String s:v) {
//			System.out.println(s);
//		}
//		Iterator<String> iter = v.iterator();
//		v.add("abcd"); //After Iterator is declared vector must not be modified
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		ListIterator<String> liter = v.listIterator();
//		while(liter.hasNext()) {
//			liter.next();
//		}
//		while(liter.hasPrevious()) {
//			System.out.println(liter.previous());
//		}
//		Enumeration<String> en = v.elements(); // enumeration works only for vector
//		v.add("abcd"); //After Enumeration the Vector can be modified
//		while(en.hasMoreElements()) {
//			System.out.println(en.nextElement());
//		Collections.sort(v);
		System.out.println(v);
//		}
	}
}
class Student implements Comparable<Student> {
	String name;
	public Student(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Student o) {
		return o.name.compareTo(this.name);
	}
}

class MyComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.compareTo(o2);
	}
}