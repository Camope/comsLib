package es.interior.comsLib;

import java.util.Date;

public class Solicitud implements SolicitudInterface {
	
	private Date fechaSolicitud;
	private ComisionInterface comision;
	private UsuarioInterface usuario;

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public ComisionInterface getComision() {
		return comision;
	}

	public void setComision(ComisionInterface comision) {
		this.comision = comision;
	}

	public UsuarioInterface getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioInterface usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Solicitud [fechaSolicitud=" + fechaSolicitud + ", comision=" + comision.getPuesto() + ", usuario=" + usuario.getTip() + "]";
	}

}
