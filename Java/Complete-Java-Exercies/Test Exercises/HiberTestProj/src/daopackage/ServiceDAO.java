package daopackage;

import org.hibernate.Session;

public abstract class ServiceDAO extends DAO{
	@Override
	public void saveObject(Object o) {
		Session session = getSession();
		session.save(o);
		session.beginTransaction().commit();
	}
	@Override
	public void deleteObject(Object o) {
		Session session = getSession();
		session.delete(o);
		session.beginTransaction().commit();
	}
}
