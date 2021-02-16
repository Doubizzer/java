
public abstract class TestPacket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqReseau test1 = new EqReseau();
		EqClient testClient = new EqClient("IP","MAC","GATE","pcteo");
		EqRouter testRouter = new EqRouter("R1","Routeur");
		
		System.out.println(test1.toString());
		System.out.println(testClient.toString());
		System.out.println(testRouter.toString());
	}

}
