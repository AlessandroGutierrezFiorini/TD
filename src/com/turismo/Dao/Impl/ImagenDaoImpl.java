package com.turismo.Dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.turismo.Dao.ImagenDAO;
import com.turismo.Pojo.Imagen;

@Transactional
@Repository
public class ImagenDaoImpl implements ImagenDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void save(Imagen imagen) {
		getSession().save(imagen);
	}

	@Override
	public void update(Imagen imagen) {
		getSession().update(imagen);		
	}

	@Override
	public void delete(Imagen imagen) {
		getSession().delete(imagen);
	}

	@Override
	public List<Imagen> findAll() {
		Query query = getSession().createQuery("from Imagen");
		return query.list();
	}

}
