
public class EqClient extends EqReseau{
	String aIP;
	String aMAC;
	String aGate;
	
	public EqClient() {
		super ();
	}
	
	public EqClient(String pIP, String pMAC, String pGate, String pNom) {
		aIP = pIP;
		aMAC = pMAC;
		aGate = pGate;
		this.type = "PC";
		this.nom = pNom;
	}
	public String toString() {
   		return "Nom de la machine : " + this.nom + " Type de la machine : " + this.type + "IP de la machine :" + this.aIP + "MAC de la machine" + this.aMAC + "Gateway :" + this.aGate;
}
