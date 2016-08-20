package com.turismo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turismo.Dao.UsuarioDAO;
import com.turismo.Pojo.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDao;
	
	
	public void saveOrUpdate(Usuario usuario){
		try {
			usuarioDao.save(usuario);	
		} catch (Exception e) {
			System.out.println("Servicio SAVE" + e.getMessage());
		}
	}
	
	public void delete(Usuario usuario){
		usuarioDao.delete(usuario);
	}
	
	public List<Usuario> ListAll(){
		
		return usuarioDao.ListAll();
	}
	
	public Usuario findById(int id){
		
		return usuarioDao.findById(id);
	}
	
	public void disableUsuario(int id){}

	public void enableUsuario(int id){}

}
