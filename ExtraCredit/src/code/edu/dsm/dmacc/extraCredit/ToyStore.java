package code.edu.dsm.dmacc.extraCredit;

public class ToyStore extends Store {

	@Override
	public boolean openStore(String employeeName) {

		System.out.println("person " + employeeName + " is Opening Toy Store");
		return false;
	}

}
