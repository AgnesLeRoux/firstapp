package firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Contact {
	
	private String nom;
	private String prenom;
	private Adresse adresse;
	
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Contact(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	
	@Override
	public String toString() {
		return "Contact [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}

	public Contact(String nom, String prenom, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	@Autowired
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	

}
