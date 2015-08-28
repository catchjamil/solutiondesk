package com.sd.app.bean.company;

// Generated Nov 22, 2014 12:49:05 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class CompanyTables.
 * @see com.sd.app.bean.company.CompanyTables_old
 * @author Hibernate Tools
 */
public class CompanyTablesHome {

	private static final Log log = LogFactory.getLog(CompanyTablesHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(CompanyTables_old transientInstance) {
		log.debug("persisting CompanyTables instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CompanyTables_old instance) {
		log.debug("attaching dirty CompanyTables instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CompanyTables_old instance) {
		log.debug("attaching clean CompanyTables instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CompanyTables_old persistentInstance) {
		log.debug("deleting CompanyTables instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CompanyTables_old merge(CompanyTables_old detachedInstance) {
		log.debug("merging CompanyTables instance");
		try {
			CompanyTables_old result = (CompanyTables_old) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CompanyTables_old findById(com.sd.app.bean.company.CompanyTables id) {
		log.debug("getting CompanyTables instance with id: " + id);
		try {
			CompanyTables_old instance = (CompanyTables_old) sessionFactory.getCurrentSession().get("com.sd.app.bean.company.CompanyTables", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<CompanyTables_old> findByExample(CompanyTables_old instance) {
		log.debug("finding CompanyTables instance by example");
		try {
			List<CompanyTables_old> results = (List<CompanyTables_old>) sessionFactory.getCurrentSession()
					.createCriteria("com.sd.app.bean.company.CompanyTables").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
