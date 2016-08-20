package com.turismo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turismo.Dao.ImagenDAO;
import com.turismo.Dao.UsuarioDAO;
import com.turismo.Pojo.Imagen;
import com.turismo.Pojo.Usuario;

@Service
public class ImagenService {

	@Autowired
	private ImagenDAO imagenDao;
	
	
	public void saveOrUpdate(Imagen imagen){
		imagenDao.save(imagen);
	}
	
	public void delete(Usuario usuario){
		
	}
	
	public List<Usuario> ListAll(){
		return null;
	}
	
	public Usuario findById(int id){
		
		return null;
	}
	
	public void disableUsuario(int id){}

	public void enableUsuario(int id){}

}
