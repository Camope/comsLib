package es.interior.comsLib;

import java.util.List;

public interface UsuarioInterface {

	public String getNombre();

	public String getApellidos();

	public String getTip();

	public String getEmpleo();

	public String getEmail();

	public List<SolicitudInterface> getSolicitudes();

}
