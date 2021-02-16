
public class EqRouter extends EqReseau {
	
	public EqRouter() {
		this.nom = "Inconnu";
		this.type = "Routeur";
	}
	public EqRouter(String p1, String p2) {
		super(p1, p2);
	}
	public String toString() {
   		return "Nom de la machine : " + this.nom + " Type de la machine : " + this.type;
}
