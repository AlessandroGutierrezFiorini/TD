package com.turismo.Dao;

import java.util.List;
import com.turismo.Pojo.Imagen;


public interface ImagenDAO {

	public void save(Imagen imagen);
	
	public void update(Imagen imagen);
	
	public void delete(Imagen imagen);
	
	public List<Imagen> findAll();
}
