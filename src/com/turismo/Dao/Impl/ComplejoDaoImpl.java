package com.turismo.Dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.turismo.Dao.ComplejoDAO;
import com.turismo.Pojo.Complejo;
import com.turismo.Pojo.Lugar;

@Transactional
@Repository
public class ComplejoDaoImpl implements ComplejoDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void save(Complejo complejo) {
		getSession().save(complejo);		
	}

	@Override
	public void update(Complejo complejo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Complejo complejo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Complejo> ListAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Complejo> ListByLugar(Lugar lugar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Complejo findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
