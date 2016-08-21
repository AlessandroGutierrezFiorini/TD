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
			
			if (usuario.getId() == 0) {
				usuarioDao.save(usuario);	
			} else {
				usuarioDao.update(usuario);
			}
		} catch (Exception e) {
			
			System.out.println("Servicio SaveOrUpdate" + e.getMessage());
		}
	}
	
	public void delete(Usuario usuario){
		try {
			usuarioDao.delete(usuario);
		} catch (Exception e) {
			System.out.println("Servicio Delete" + e.getMessage());
		}
	}
	
	public List<Usuario> ListAll(){
		
		return usuarioDao.ListAll();
	}
	
	public Usuario findById(int id){
		
		return usuarioDao.findById(id);
	}
	
	public void enableUsuario(int id){
		usuarioDao.enableUsuario(usuarioDao.findById(id));
	}
	
	public void disableUsuario(int id){
		usuarioDao.disableUsuario(usuarioDao.findById(id));
		
	}

	

}
