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

import com.turismo.Dao.UsuarioDAO;
import com.turismo.Pojo.Usuario;

@Transactional
@Repository
public class UsuarioDaoImpl implements UsuarioDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public void save(Usuario usuario) {
		getSession().save(usuario);
		
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> ListAll() {
		//Criteria criteria = getSession().createCriteria(Usuario.class);
		Query query = getSession().createQuery("from Usuario");
		return query.list();
	}

	@Override
	public Usuario findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disableUsuario(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enableUsuario(int id) {
		// TODO Auto-generated method stub
		
	}

}
