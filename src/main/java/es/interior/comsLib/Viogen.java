package es.interior.comsLib;

public class Viogen extends Comision {

	private String riesgo;

	public String getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(String riesgo) {
		this.riesgo = riesgo;
	}

	@Override
	public String toString() {
		return "Viogen [riesgo=" + riesgo + "]";
	}
}
