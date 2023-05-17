package es.interior.comsLib;

public interface ExtranjeroInterfaz {
	
	public String getPerfil();
	
	public void setPerfil(String p);

	public default String getTipo() {
		return "EXTRANJERO";
	}
	
}
