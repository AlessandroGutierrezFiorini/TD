package com.turismo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turismo.Dao.LugarDAO;
import com.turismo.Dao.UsuarioDAO;
import com.turismo.Pojo.Lugar;
import com.turismo.Pojo.Usuario;

@Service
public class LugarService {

	@Autowired
	private LugarDAO lugarDao;
	
	
	public void saveOrUpdate(Lugar lugar){
		lugarDao.save(lugar);
	}
	
	public void delete(Lugar lugar){}

	public List<Lugar> ListAll(){return null;}

	public Lugar findById(int id){return null;}

	public Lugar findByLocalidad(int id){return null;}

	public Lugar findByProvincia(int id){return null;}
	
}
