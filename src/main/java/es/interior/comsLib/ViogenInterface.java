package es.interior.comsLib;


public interface ViogenInterface {
	
		public String getRiesgo();
		
		public void setRiesgo(String r);

		public default String getTipo() {
			return "VIOGEN";
		}
	
}
