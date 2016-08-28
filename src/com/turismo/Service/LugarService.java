package com.turismo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turismo.Dao.LugarDAO;
import com.turismo.Pojo.Lugar;

@Service
public class LugarService {

	@Autowired
	private LugarDAO lugarDao;

	public void saveOrUpdate(Lugar lugar) {
		try {
			if (lugar.getId() == 0) {
				lugarDao.save(lugar);
			} else {
				lugarDao.update(lugar);
			}

		} catch (Exception e) {
			System.out.println("Servicio SaveOrUpdate" + e.getMessage());
		}

	}

	public void delete(Lugar lugar) {
		lugarDao.delete(lugar);
	}

	public List<Lugar> ListAllPage(int page) {
		return lugarDao.ListAllPage(page);
	}

	public Lugar findById(int id) {
		return lugarDao.findById(id);
	}

	public Lugar findByLocalidad(int id) {
		return null;
	}

	public Lugar findByProvincia(int id) {
		return null;
	}

	public List<Lugar> findAll() {
		return lugarDao.findAll();

	}

}
