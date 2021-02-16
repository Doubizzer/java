
public class EqReseau {
	String nom;
	String type;
	
	public EqReseau() {
		nom = "Inconnu";
		type = "Inconnu";
	}
	
	public EqReseau(String pNom,String pType) {
		nom = pNom;
		type = pType;
	}
	
	public String toString() {
   		return "Nom de la machine : " + this.nom + " Type de la machine : " + this.type;
}
