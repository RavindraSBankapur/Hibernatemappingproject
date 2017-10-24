package org.hibenate.dao;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
public class CustomerDao {
	public static void main(String[] args) {
		Logger log=Logger.getLogger("CustomerEntity.class");
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Boolean con = session.isConnected();
		System.out.println(con);
		Query q=session.createQuery("from CustomerEntity").setFirstResult(3);
		Query q1=session.createSQLQuery("select *from customers");
		List li=q.list();
		System.out.println(li);
		//changed the code again and pussh
	}
}
