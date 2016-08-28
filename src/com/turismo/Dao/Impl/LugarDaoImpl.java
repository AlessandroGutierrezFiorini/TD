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

import com.turismo.Dao.LugarDAO;
import com.turismo.Pojo.Lugar;
import com.turismo.Pojo.Usuario;

@Transactional
@Repository
public class LugarDaoImpl implements LugarDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(Lugar lugar) {
		getSession().save(lugar);
	}

	@Override
	public void update(Lugar lugar) {
		getSession().update(lugar);
	}

	@Override
	public void delete(Lugar lugar) {
		getSession().delete(lugar);
	}

	@Override
	public List<Lugar> ListAll() {
		return null;
	}

	@Override
	public Lugar findById(int id) {
		Criteria criteria = getSession().createCriteria(Lugar.class);
		criteria.add(Restrictions.eq("id", id));
		return (Lugar) criteria.uniqueResult();
	}

	@Override
	public Lugar findByLocalidad(int id) {
		return null;
	}

	@Override
	public Lugar findByProvincia(int id) {
		return null;
	}

	@Override
	public List<Lugar> findAll() {
		Query query = getSession().createQuery("from Lugar");
		return query.list();
	}

}
