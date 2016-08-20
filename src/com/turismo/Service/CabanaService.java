package com.turismo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turismo.Dao.CabanaDAO;
import com.turismo.Dao.UsuarioDAO;
import com.turismo.Pojo.Cabana;
import com.turismo.Pojo.Usuario;

@Service
public class CabanaService {

	@Autowired
	private CabanaDAO cabanadao;

	public void saveOrUpdate(Cabana cabana) {
		cabanadao.save(cabana);
	}

	public void delete(Cabana cabana) {

	}

	public List<Usuario> ListAll() {

		return null;
	}

	public Usuario findById(int id) {

		return null;
	}

}
