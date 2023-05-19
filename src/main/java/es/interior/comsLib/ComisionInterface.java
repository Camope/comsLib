package es.interior.comsLib;

import java.util.Date;
import java.util.List;

public interface ComisionInterface {

	public String getPuesto();

	public String getLocalidad();

	public String getEspecialidad();

	public String getEmpleo();

	public Date getFechaPublicacion();

	public Date getFechaLimite();

	public Integer getDuracion();

	public String getDetalles();

	public List<SolicitudInterface> getSolicitudes();

}
