package com.turismo.Dao;

import java.util.List;

import com.turismo.Pojo.Usuario;

public interface UsuarioDAO {

	public void save(Usuario usuario);
	
	public void update(Usuario usuario);
	
	public void delete(Usuario usuario);
	
	public List<Usuario> ListAll();
	
	public Usuario findById(int id);
	
	public void disableUsuario(Usuario usuario);

	public void enableUsuario(Usuario usuario);


}
