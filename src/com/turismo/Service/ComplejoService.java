package com.turismo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turismo.Dao.ComplejoDAO;
import com.turismo.Pojo.Complejo;
import com.turismo.Pojo.Lugar;

@Service
public class ComplejoService {

	@Autowired
	private ComplejoDAO complejoDao;

	public void saveOrUpdate(Complejo complejo) {
		try {
			if (complejo.getId() == 0) {
				complejoDao.save(complejo);
			} else {
				complejoDao.update(complejo);
			}

		} catch (Exception e) {
			System.out.println("Servicio SaveOrUpdate" + e.getMessage());
		}
	}

	public void delete(Complejo complejo) {
		complejoDao.delete(complejo);
	}

	public List<Complejo> findAll() {
		return complejoDao.findAll();
	}

	public List<Complejo> ListByLugar(Lugar lugar) {
		return null;
	}

	public Complejo findById(int id) {
		return complejoDao.findById(id);
	}

}
