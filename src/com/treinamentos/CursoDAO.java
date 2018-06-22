package com.treinamentos;
// Generated 22/06/2018 12:54:29 by Hibernate Tools 4.3.5.Final

import java.io.File;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Curso.
 * @see com.treinamentos.Curso
 * @author Hibernate Tools
 */
public class CursoDAO {

	private static final Log log = LogFactory.getLog(CursoDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
	
		SessionFactory sessionFactory = new Configuration().
				configure(new File("src/META-INF/hibernate.cfg.xml"))
				.buildSessionFactory();
				
		return sessionFactory;
	}

	public void persist(Curso transientInstance) {
		log.debug("persisting Curso instance");
		try {
			/**sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");**/
			
			Session s = sessionFactory.getCurrentSession();
			s.beginTransaction();
			s.persist(transientInstance);
			s.getTransaction().commit();
			
			
		} catch (RuntimeException re) {
			log.error("erro ao gravar", re);
			throw re;
		}
	}

	
/******************************************************************************************/	

	public void delete(Curso PersistentInstace) {
		log.debug("persisting Curso instance");
		try {
			/**sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");**/
			
			Session s = sessionFactory.getCurrentSession();
			s.beginTransaction();
			s.delete(PersistentInstace);
			s.getTransaction().commit();
			
			
		} catch (RuntimeException re) {
			log.error("erro ao deletar", re);
			throw re;
		}
	}
	/******************************************************************************************/
	public void merge(Curso DetashedInstance) {
		log.debug("persisting Curso instance");
		try {
			/**sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");**/
			
			Session s = sessionFactory.getCurrentSession();
			s.beginTransaction();
			s.merge(DetashedInstance);
			s.getTransaction().commit();
			
			
		} catch (RuntimeException re) {
			log.error("falha no merge", re);
			throw re;
		}
	}

	/******************************************************************************************/
	public void me(Curso DetashedInstance) {
		log.debug("persisting Curso instance");
		try {
			/**sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");**/
			
			Session s = sessionFactory.getCurrentSession();
			s.beginTransaction();
			s.merge(DetashedInstance);
			s.getTransaction().commit();
			
			
		} catch (RuntimeException re) {
			log.error("falha no merge", re);
			throw re;
		}
	}














}

