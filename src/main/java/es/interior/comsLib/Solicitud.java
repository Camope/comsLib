package es.interior.comsLib;

import java.util.Date;

public class Solicitud {
	
	private Date fechaSolicitud;

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	@Override
	public String toString() {
		return "Solicitud [fechaSolicitud=" + fechaSolicitud + "]";
	}

}
