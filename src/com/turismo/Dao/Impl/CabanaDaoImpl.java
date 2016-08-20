package com.turismo.Dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.turismo.Dao.CabanaDAO;
import com.turismo.Pojo.Cabana;
import com.turismo.Pojo.Complejo;

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
		//getSession().save(cabana);
	}

	@Override
	public void update(Cabana cabana) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cabana cabana) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cabana> ListAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cabana findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cabana> ListByComplejo(Complejo complejo) {
		// TODO Auto-generated method stub
		return null;
	}

}
