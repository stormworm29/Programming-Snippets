package one2manypack;


import java.util.Iterator;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;



public class QClient {
	Criteria criteria;
	static Session session;
	public QClient() {
		 session=HibernateUtility.currentSession();
		criteria=session.createCriteria(Employee.class);
	}
	public static void main(String[] args) {
		QClient qbc=new QClient();
		qbc.query3();	
	}
	public static void displayHql(List<Employee> list)
	{
		Iterator<Employee> iter=list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next().getEname());
		}
	}
	public void query10()
	{
		//Query query=session.createQuery("from Students e where e.age>1000");
		//Query query=session.createQuery("from Employee e where e.esal> :salary");
		//Query query=session.getNamedQuery("myquery");
		Query query=session.getNamedQuery("myquery4");
		
		query.setParameter("sal",new Float(900));
		//query.setParameter("salary",new Float(10));
		//displayHql(query.list());
		Iterator iter=query.iterate();
		while(iter.hasNext())
		{
			Object o[]=(Object[])iter.next();
			System.out.println(o[0]+":"+o[1]);
		}
	}
	public static void display(Criteria criteria)
	{
		criteria=session.createCriteria(Employee.class);
		List<Employee> employees=criteria.list();
		Iterator<Employee> iter=employees.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next().getEname());
		}
	}
public void query1()
{
	criteria.addOrder(Order.desc("ename"));
	display(criteria);
}

public void query2()
{
	//criteria.add(Restrictions.eq("name", "ramu"));
	//or
	criteria.add(Property.forName("ename").eq("ramu"));
	Employee emp=(Employee)criteria.uniqueResult();
	System.out.println(emp.getEname());
}
public void query3()
{
	criteria=session.createCriteria(Address.class);
	//criteria.add(Restrictions.eq("student.name", "ramu"));
	//or
	criteria.add(Property.forName("employee.ename").eq("ramu"));
	List<Address> addresses=criteria.list();
	Iterator<Address> iter=addresses.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next().getCity());
	}
}
public void query4()
{
	Float f[]={new Float(10),new Float(4000)};
	criteria=session.createCriteria(Employee.class);
	//criteria.add(Restrictions.between("esal",new Float(1000),new Float(2000)));
	//or
	criteria.add(Property.forName("empsalary").in(f));
	display(criteria);
}
public void query5()
{
	criteria.add(Restrictions.like("empname", "R%").ignoreCase());
	display(criteria);
	
}
public void query6()
{
	criteria.
		add(Restrictions.like("empname", "R%").ignoreCase())
		.add(Restrictions.gt("empsalary", new Float(2000)));
	display(criteria);
}
public void query7()
{
	criteria.add(
			Restrictions.or(Restrictions.like("empname", "R%")
					.ignoreCase(),
			Restrictions.gt("empsalary", new Float(2000))));
			display(criteria);
}
public void query8()
{
	DetachedCriteria dc=DetachedCriteria.forClass(Employee.class);
	dc.add(
			Restrictions.or(Restrictions.like("empname", "R%"),
			Restrictions.gt("empsalary", new Float(1000)))
		);
	criteria=dc.getExecutableCriteria(session);
	display(criteria);
}
public void query9()
{
	Query query=session.createQuery("from Students");
	displayHql(query.list());
}

public void query11()
{
	Query query=session.createQuery("select e.ename,e.age from Students e");
	//Iterator<Object[]> obj=query.list().iterator();or
	Iterator<Object[]> obj=query.iterate();
	while(obj.hasNext())
	{
		Object o[]=obj.next();
		System.out.println(o[0]+":"+o[1]);
	}
}
public void query12()
{
	Query query=session.createQuery("select e.ename from Employee e");
	Iterator<String> obj=query.iterate();
	while(obj.hasNext())
	{
		String s=obj.next();
		System.out.println(s);
	}
}
public void query13()
{
	Query query=session.createQuery
		("select e.empname, a.city from Employee e, Address a where a.city=:c");
	query.setParameter("c", "chennai");
	Iterator<Object[]> obj=query.iterate();
	while(obj.hasNext())
	{
		Object o[]=obj.next();
		System.out.println(o[0]+":"+o[1]+":"+o[2]);
	}
}

public void query14()
{
	//An inner join would return a employee name, 
	//only if there is at least one matching address. 
	//The outer join version returns all employee names at least once, 
	//with a null address name if no matching employees are found. 

	//inner join
	//Query query=session.createQuery
	//("select e.empname,a.city from Employee e join e.addresses a with a.city=:c");
	//outer join
	Query query=session.createQuery
	("select e.empname,a.city from Employee e left join e.addresses a with a.city=:c");
	
	query.setParameter("c", "chennnnnnai");
	Iterator<Object[]> obj=query.iterate();
	while(obj.hasNext())
	{
		Object o[]=obj.next();
		System.out.println(o[0]+":"+o[1]);
	}
}
public void query16()
{
	Query q=session.createQuery("update Students set age=age+100");
	int updateditems=q.executeUpdate();
	System.out.println("No of records updated...:"+updateditems);
	session.beginTransaction().commit();
}

public void query17()
{	
	Query qqq=session.getNamedQuery("myquery");
	Query q=session.createQuery("insert into BackupEmployee (name,sal) " +
			"		select e.empname,e.empsalary from Employee e");
	int createobjects=q.executeUpdate();
	System.out.println(createobjects);
	session.beginTransaction().commit();
}
public void query18(){
	Criteria cr = session.createCriteria(Employee.class);

	// To get total row count.
	cr.setProjection(Projections.rowCount());

	// To get average of a property.
	cr.setProjection(Projections.avg("salary"));
	List totalSalary = cr.list();

    System.out.println("Total Salary: " + totalSalary.get(0) );
	// To get distinct count of a property.
	cr.setProjection(Projections.countDistinct("firstName"));

	// To get maximum of a property.
	cr.setProjection(Projections.max("salary"));

	// To get minimum of a property.
	cr.setProjection(Projections.min("salary"));

	// To get sum of a property.
	cr.setProjection(Projections.sum("salary"));
}
}



