package com.turismo.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cabana")
public class Cabana {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private int numero;
	private int capacidad;
	private int habitaciones;
	private int camas;
	private int piscina;
	private int calefaccion;
	private int aireAcondicionado;
	private int internet;
	private int television;
	private int cocina;
	private int mascotas;
	private int estacionamiento;
	private int churrasquera;
	
	@OneToOne
	@JoinColumn(name="id_imagen")
	private Imagen imagen;
	
	@ManyToOne
	@JoinColumn(name="id_complejo")
	private Complejo complejo;
	
	public Cabana(){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	public int getCamas() {
		return camas;
	}
	public void setCamas(int camas) {
		this.camas = camas;
	}
	public int getPiscina() {
		return piscina;
	}
	public void setPiscina(int piscina) {
		this.piscina = piscina;
	}
	public int getCalefaccion() {
		return calefaccion;
	}
	public void setCalefaccion(int calefaccion) {
		this.calefaccion = calefaccion;
	}
	public int getAireAcondicionado() {
		return aireAcondicionado;
	}
	public void setAireAcondicionado(int aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}
	public int getInternet() {
		return internet;
	}
	public void setInternet(int internet) {
		this.internet = internet;
	}
	public int getTelevision() {
		return television;
	}
	public void setTelevision(int television) {
		this.television = television;
	}
	public int getCocina() {
		return cocina;
	}
	public void setCocina(int cocina) {
		this.cocina = cocina;
	}
	public int getMascotas() {
		return mascotas;
	}
	public void setMascotas(int mascotas) {
		this.mascotas = mascotas;
	}
	public int getEstacionamiento() {
		return estacionamiento;
	}
	public void setEstacionamiento(int estacionamiento) {
		this.estacionamiento = estacionamiento;
	}
	public int getChurrasquera() {
		return churrasquera;
	}
	public void setChurrasquera(int churrasquera) {
		this.churrasquera = churrasquera;
	}
	
	public Imagen getImagen() {
		return imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

	public Complejo getComplejo() {
		return complejo;
	}

	public void setComplejo(Complejo complejo) {
		this.complejo = complejo;
	}

	@Override
	public String toString() {
		return "Cabana [id=" + id + ", numero=" + numero + ", capacidad=" + capacidad + ", habitaciones=" + habitaciones
				+ ", camas=" + camas + ", piscina=" + piscina + ", calefaccion=" + calefaccion + ", aireAcondicionado="
				+ aireAcondicionado + ", internet=" + internet + ", television=" + television + ", cocina=" + cocina
				+ ", mascotas=" + mascotas + ", estacionamiento=" + estacionamiento + ", churrasquera=" + churrasquera
				+ "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aireAcondicionado;
		result = prime * result + calefaccion;
		result = prime * result + camas;
		result = prime * result + capacidad;
		result = prime * result + churrasquera;
		result = prime * result + cocina;
		result = prime * result + estacionamiento;
		result = prime * result + habitaciones;
		result = prime * result + id;
		result = prime * result + internet;
		result = prime * result + mascotas;
		result = prime * result + numero;
		result = prime * result + piscina;
		result = prime * result + television;
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
		Cabana other = (Cabana) obj;
		if (aireAcondicionado != other.aireAcondicionado)
			return false;
		if (calefaccion != other.calefaccion)
			return false;
		if (camas != other.camas)
			return false;
		if (capacidad != other.capacidad)
			return false;
		if (churrasquera != other.churrasquera)
			return false;
		if (cocina != other.cocina)
			return false;
		if (estacionamiento != other.estacionamiento)
			return false;
		if (habitaciones != other.habitaciones)
			return false;
		if (id != other.id)
			return false;
		if (internet != other.internet)
			return false;
		if (mascotas != other.mascotas)
			return false;
		if (numero != other.numero)
			return false;
		if (piscina != other.piscina)
			return false;
		if (television != other.television)
			return false;
		return true;
	}
	
	
	
	
}
