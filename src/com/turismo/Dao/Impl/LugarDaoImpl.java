package com.turismo.Dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.turismo.Dao.LugarDAO;
import com.turismo.Pojo.Lugar;

@Transactional
@Repository
public class LugarDaoImpl implements LugarDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void save(Lugar lugar) {
		getSession().save(lugar);		
	}

	@Override
	public void update(Lugar lugar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Lugar lugar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Lugar> ListAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lugar findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lugar findByLocalidad(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lugar findByProvincia(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
