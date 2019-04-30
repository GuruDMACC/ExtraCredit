package code.edu.dsm.dmacc.extraCredit;

public class GroceryStore extends Store {

	@Override
	public boolean openStore(String employeeName) {
		System.out.println("person " + employeeName + " is Opening Grocery Store");
		return false;
	}

}
