package com.turismo.Pojo;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="imagen")
public class Imagen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String src;
	
	@OneToOne
	@JoinColumn(name="imagen")
	private Cabana cabana;

	public Imagen(){}	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public Cabana getCabana() {
		return cabana;
	}

	public void setCabana(Cabana cabana) {
		this.cabana = cabana;
	}

	@Override
	public String toString() {
		return "Imagen [id=" + id + ", src=" + src + ", cabana=" + cabana + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cabana == null) ? 0 : cabana.hashCode());
		result = prime * result + id;
		result = prime * result + ((src == null) ? 0 : src.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Imagen other = (Imagen) obj;
		if (cabana == null) {
			if (other.cabana != null)
				return false;
		} else if (!cabana.equals(other.cabana))
			return false;
		if (id != other.id)
			return false;
		if (src == null) {
			if (other.src != null)
				return false;
		} else if (!src.equals(other.src))
			return false;
		return true;
	}
	
		
}
