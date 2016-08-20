package com.turismo.Dao;

import java.util.List;

import com.turismo.Pojo.Lugar;

public interface LugarDAO {

	public void save(Lugar lugar);

	public void update(Lugar lugar);

	public void delete(Lugar lugar);

	public List<Lugar> ListAll();

	public Lugar findById(int id);

	public Lugar findByLocalidad(int id);

	public Lugar findByProvincia(int id);

}
