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
	private CabanaDAO cabanaDao;

	public void saveOrUpdate(Cabana cabana) {
		cabanaDao.save(cabana);
	}

	public void delete(Cabana cabana) {
		cabanaDao.delete(cabana);
	}

	public List<Cabana> findAll() {

		return cabanaDao.findAll();
	}

	public Cabana findById(int id) {

		return cabanaDao.findById(id);
	}

}
