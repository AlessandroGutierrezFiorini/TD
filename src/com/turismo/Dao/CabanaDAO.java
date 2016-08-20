package com.turismo.Dao;

import java.util.List;

import com.turismo.Pojo.Cabana;
import com.turismo.Pojo.Complejo;

public interface CabanaDAO {

	
	public void save(Cabana cabana);
	
	public void update(Cabana cabana);
	
	public void delete(Cabana cabana);
	
	public List<Cabana> ListAll();
	
	public List<Cabana> ListByComplejo(Complejo complejo);
	
	public Cabana findById(int id);
	
	

}
