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

import com.turismo.Dao.CabanaDAO;
import com.turismo.Pojo.Cabana;
import com.turismo.Pojo.Complejo;
import com.turismo.Pojo.Imagen;

@Transactional
@Repository
public class CabanaDaoImpl implements CabanaDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void save(Cabana cabana) {
		getSession().save(cabana);
	}

	@Override
	public void update(Cabana cabana) {
		getSession().update(cabana);
		
	}

	@Override
	public void delete(Cabana cabana) {
		getSession().delete(cabana);
	}

	@Override
	public List<Cabana> findAll() {
		Query query = getSession().createQuery("from Cabana");
		return query.list();
	}

	@Override
	public Cabana findById(int id) {
		Criteria criteria = getSession().createCriteria(Cabana.class);
		criteria.add(Restrictions.eq("id", id));
		return (Cabana) criteria.uniqueResult();
	}

	@Override
	public List<Cabana> ListByComplejo(Complejo complejo) {
		// TODO Auto-generated method stub
		return null;
	}

}
