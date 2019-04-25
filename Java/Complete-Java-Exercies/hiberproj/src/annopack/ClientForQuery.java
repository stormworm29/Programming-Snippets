package annopack;

import java.util.Iterator;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

public class ClientForQuery {
	Criteria criteria;
	Session session;
	public ClientForQuery() {
		// TODO Auto-generated constructor stub
		session = HibernateUtility.currentSession();
		criteria = session.createCriteria(AnnoEmployee.class);
	}
	public static void main(String[] args) {
		ClientForQuery cfq = new ClientForQuery();
		cfq.query13();
	}
	public static void displayhql(List<AnnoEmployee> list) {
		Iterator<AnnoEmployee> iter = list.iterator();
		while( iter.hasNext()) {
			System.out.println(iter.next().getEname());
		}
	}
	public void display(Criteria criteria) {
		List<AnnoEmployee> employees = criteria.list();
		displayhql(employees);
	}
	public void query1() {
		criteria.addOrder(Order.asc("ename"));
		display(criteria);
	}
	
	public void query2() {
		criteria.add(Property.forName("ename").eq("ramu"));
		AnnoEmployee emp = (AnnoEmployee) criteria.uniqueResult();
		System.out.println(emp.getEname() + " : " + emp.getSalary());
	}
	public void query3() {
		Float f[] = { new Float(10), new Float(2000) };
		criteria.add(Property.forName("salary").in(f));
		display(criteria);
	}
	public void query4() {
		criteria.add(Property.forName("ename").like("G%").ignoreCase());
		display(criteria);
	}
	public void query5() {
		criteria.add(Property.forName("ename").like("G%").ignoreCase()).add(Property.forName("salary").gt(new Float(500)));
		display(criteria);
	}
	public void query6() {
		criteria.add(
				Restrictions.or(Restrictions.like("ename", "G%").ignoreCase(), Restrictions.gt("salary", new Float(500)))
				);
		display(criteria);
	}
	public void query7() {
		DetachedCriteria dc = DetachedCriteria.forClass(AnnoEmployee.class);
		dc.add(Restrictions.or(Restrictions.like("ename", "G%"), Restrictions.gt("salary", new Float(500))));
		criteria = dc.getExecutableCriteria(session);
		display(criteria);
	}
	public void query8() {
		Query query = session.createQuery("from AnnoEmployee");
		displayhql(query.list());
	}
	public void query9() {
		Query query = session.createQuery("select e.ename, e.salary from AnnoEmployee e");
		Iterator<Object[]> obj = query.iterate();
		while(obj.hasNext()) {
			Object o[] = obj.next();
			System.out.println(o[0] + " : " + o[1]);
		}
	}
	public void query10() {
		Query query = session.createQuery("select e.ename from AnnoEmployee e");
		Iterator<String> obj = query.iterate();
		while (obj.hasNext()) {
			String s = obj.next();
			System.out.println(s);
		}
	}
	public void query11() {
		Query query = session.getNamedQuery("mquery");
		query.setParameter("salary", new Float(500));
		displayhql(query.list());
	}
	public void query12() {
		Query query = session.createQuery("update AnnoEmployee set salary=salary+100");
		int updateditems = query.executeUpdate();
		System.out.println("No of records updated ... " + updateditems);
		session.beginTransaction().commit();
	}
	public void query13() {
		Query query = session.createQuery("insert into BackupEmployee(eid,ename,salary) select e.eid,e.ename,e.salary from AnnoEmployee e");
		int createobjects = query.executeUpdate();
		System.out.println(createobjects);
		session.beginTransaction().commit();
		
	}
	public void query14() {
		Criteria cr = session.createCriteria(AnnoEmployee.class);
		cr.setProjection(Projections.rowCount());
		List li = cr.list();
		System.out.println(li.get(0));
		cr.setProjection(Projections.avg("salary"));
		List totalaveragesalary = cr.list();
		System.out.println("Total Average Salary: " + totalaveragesalary);
		
	}
}
