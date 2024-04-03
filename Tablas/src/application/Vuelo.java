package application;

public class Vuelo {
	private String numero;
	private String origen; 
	private String destino;
	private String codAvion;
	
	public Vuelo(String numero, String origen, String destino, String codAvion) {
		this.numero = numero;
		this.origen = origen;
		this.destino = destino;
		this.codAvion = codAvion;
	}
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getCodAvion() {
		return codAvion;
	}
	public void setCodAvion(String codAvion) {
		this.codAvion = codAvion;
	}
	
	
	
}
