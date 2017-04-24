package impl;

import org.hibernate.Session;

import util.HibernateUtil;

import dao.ILibro;
import model.Libro;

public class LibroImpl implements ILibro {

	@Override
	public boolean agregar(Libro libro) {

		Session session= null;
		try {
			
			session= HibernateUtil.getSessionFactoty().openSession();
			session.beginTransaction();
			
			System.out.println("Conectado");
			
			session.save(libro);
			
			session.getTransaction().commit();
			HibernateUtil.shutdown();
			return true;
			
			
		} catch (Exception e) {
		   if(session!=null){
			   session.getTransaction().rollback();
			   HibernateUtil.shutdown();
		   }
		   return false;
		}
	}

}
