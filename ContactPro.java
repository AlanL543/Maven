package edu.contacts.models;

public class ContactPro extends Contact {
	private String telpro;
	private String emailpro;

public ContactPro(String nom, String email, String telPro,String emailPro, Entreprise entreprise) {
	super(nom, email);
	this.telpro = telPro;
	this.emailpro = emailPro;
	this.entreprise = entreprise;
}

@Override
public String toString() {
	return "ContactPro [contact="+this.fixe+""
}

}