package com.sd.app.bean.misreport1;

// Generated Nov 22, 2014 1:07:53 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class InvDetails.
 * @see com.sd.app.bean.misreport1.InvDetails
 * @author Hibernate Tools
 */
public class InvDetailsHome {

	private static final Log log = LogFactory.getLog(InvDetailsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(InvDetails transientInstance) {
		log.debug("persisting InvDetails instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(InvDetails instance) {
		log.debug("attaching dirty InvDetails instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(InvDetails instance) {
		log.debug("attaching clean InvDetails instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(InvDetails persistentInstance) {
		log.debug("deleting InvDetails instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public InvDetails merge(InvDetails detachedInstance) {
		log.debug("merging InvDetails instance");
		try {
			InvDetails result = (InvDetails) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public InvDetails findById(com.sd.app.bean.misreport1.InvDetailsId id) {
		log.debug("getting InvDetails instance with id: " + id);
		try {
			InvDetails instance = (InvDetails) sessionFactory.getCurrentSession().get("com.sd.app.bean.misreport1.InvDetails", id);
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

	public List<InvDetails> findByExample(InvDetails instance) {
		log.debug("finding InvDetails instance by example");
		try {
			List<InvDetails> results = (List<InvDetails>) sessionFactory.getCurrentSession().createCriteria("com.sd.app.bean.misreport1.InvDetails")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
