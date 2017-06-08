package firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Adresse 
{
	String rue;
	String ville;
	int numero;
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Adresse(String rue, String ville, int numero) {
		super();
		this.rue = rue;
		this.ville = ville;
		this.numero = numero;
	}
	
	
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", ville=" + ville + ", numero=" + numero + "]";
	}
	
}
