package com.sd.app.bean.reportdata;

// Generated Nov 22, 2014 1:17:37 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class PendingCommercial.
 * @see com.sd.app.bean.reportdata.PendingCommercial
 * @author Hibernate Tools
 */
public class PendingCommercialHome {

	private static final Log log = LogFactory.getLog(PendingCommercialHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(PendingCommercial transientInstance) {
		log.debug("persisting PendingCommercial instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PendingCommercial instance) {
		log.debug("attaching dirty PendingCommercial instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PendingCommercial instance) {
		log.debug("attaching clean PendingCommercial instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PendingCommercial persistentInstance) {
		log.debug("deleting PendingCommercial instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PendingCommercial merge(PendingCommercial detachedInstance) {
		log.debug("merging PendingCommercial instance");
		try {
			PendingCommercial result = (PendingCommercial) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PendingCommercial findById(com.sd.app.bean.reportdata.PendingCommercialId id) {
		log.debug("getting PendingCommercial instance with id: " + id);
		try {
			PendingCommercial instance = (PendingCommercial) sessionFactory.getCurrentSession().get("com.sd.app.bean.reportdata.PendingCommercial",
					id);
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

	public List<PendingCommercial> findByExample(PendingCommercial instance) {
		log.debug("finding PendingCommercial instance by example");
		try {
			List<PendingCommercial> results = (List<PendingCommercial>) sessionFactory.getCurrentSession()
					.createCriteria("com.sd.app.bean.reportdata.PendingCommercial").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
