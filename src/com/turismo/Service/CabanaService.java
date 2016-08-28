package com.turismo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turismo.Dao.CabanaDAO;
import com.turismo.Dao.UsuarioDAO;
import com.turismo.Pojo.Cabana;
import com.turismo.Pojo.Imagen;
import com.turismo.Pojo.Usuario;

@Service
public class CabanaService {

	@Autowired
	private CabanaDAO cabanaDao;

	public void saveOrUpdate(Cabana cabana) {
		
		try {
			if(cabana.getId() == 0){
				if(cabana.getImagen() == null){
					Imagen img = new Imagen();
					img.setId(10);
					img.setCategoria("cabana");
					img.setSrc("path/cabana/default");
					
					cabana.setImagen(img);
					cabanaDao.save(cabana);
				}else{
					cabanaDao.save(cabana);	
				}	
			}else{
				cabanaDao.update(cabana);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
