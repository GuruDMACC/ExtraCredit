package code.edu.dsm.dmacc.extraCredit;

public class HomeStore extends Store {

	@Override
	public boolean openStore(String employeeName) {
		System.out.println("person " + employeeName + " is Opening Home Store");
		return false;
	}

}
