package com.turismo.Dao;

import java.util.List;

import com.turismo.Pojo.Complejo;
import com.turismo.Pojo.Lugar;

public interface ComplejoDAO {

	public void save(Complejo complejo);
	
	public void update(Complejo complejo);
	
	public void delete(Complejo complejo);
	
	public List<Complejo> ListAll();
	
	public List<Complejo> ListByLugar(Lugar lugar);
	
	public Complejo findById(int id);
	


}
