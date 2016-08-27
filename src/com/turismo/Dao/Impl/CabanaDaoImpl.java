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
		try {
			if(cabana.getId() == 0){
				if(cabana.getImagen() == null){
					Imagen img = new Imagen();
					img.setId(10);
					img.setCategoria("cabana");
					img.setSrc("path/cabana/default");
					
					cabana.setImagen(img);
					getSession().save(cabana);
				}else{
					getSession().save(cabana);	
				}	
			}else{
				getSession().update(cabana);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(Cabana cabana) {
		// TODO Auto-generated method stub
		
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
