package es.interior.comsLib;

import java.util.Date;
import java.util.List;

public class Comision implements ComisionInterface {
	private String puesto;
	private String localidad;
	private String especialidad;
	private String empleo;
	private Date fechaPublicacion;
	private Date fechaLimite;
	private Integer duracion;
	private String detalles;
	private List<SolicitudInterface> solicitudes;

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getEmpleo() {
		return empleo;
	}

	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public List<SolicitudInterface> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(List<SolicitudInterface> solicitudes) {
		this.solicitudes = solicitudes;
	}

	@Override
	public String toString() {
		return "Comision [puesto=" + puesto + ", localidad=" + localidad + ", especialidad=" + especialidad
				+ ", empleo=" + empleo + ", fechaPublicacion=" + fechaPublicacion + ", fechaLimite=" + fechaLimite
				+ ", duracion=" + duracion + "]";
	}

}
