package com.turismo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turismo.Dao.ComplejoDAO;
import com.turismo.Dao.UsuarioDAO;
import com.turismo.Pojo.Complejo;
import com.turismo.Pojo.Lugar;
import com.turismo.Pojo.Usuario;

@Service
public class ComplejoService {

	@Autowired
	private ComplejoDAO complejoDao;
	
	
	public void saveOrUpdate(Complejo complejo){
		complejoDao.save(complejo);
	}
	
	public void delete(Complejo complejo){}
	
	public List<Complejo> ListAll(){
		return null;
	}
	
	public List<Complejo> ListByLugar(Lugar lugar){return null;}
	
	public Complejo findById(int id){return null;}

}
