package com.turismo.Dao.Impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.turismo.Dao.ComplejoDAO;
import com.turismo.Pojo.Complejo;
import com.turismo.Pojo.Lugar;

@Transactional
@Repository
public class ComplejoDaoImpl implements ComplejoDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(Complejo complejo) {
		getSession().save(complejo);
	}

	@Override
	public void update(Complejo complejo) {
		getSession().update(complejo);
	}

	@Override
	public void delete(Complejo complejo) {
		getSession().delete(complejo);
	}

	@Override
	public List<Complejo> findAll() {
		Query query = getSession().createQuery("from Complejo");
		return query.list();
	}

	@Override
	public List<Complejo> ListByLugar(Lugar lugar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Complejo findById(int id) {
		Criteria criteria = getSession().createCriteria(Complejo.class);
		criteria.add(Restrictions.eq("id", id));
		return (Complejo) criteria.uniqueResult();
	}

}
