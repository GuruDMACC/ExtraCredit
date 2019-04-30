package code.edu.dsm.dmacc.extraCredit;

public class StoreProviderFactory {

	public Store getStore(String storename) {
		try {

			if (storename.equalsIgnoreCase("Toy")) {
				return new ToyStore();
			} else if (storename.equalsIgnoreCase("Grocery")) {
				return new GroceryStore();
			} else if (storename.equalsIgnoreCase("Home")) {
				return new HomeStore();
			}
		} catch (NullPointerException e) {
			
			System.err.println("Exception occured - please enter a valid store to open");
			e.getStackTrace();
		}
		return null;

	}

}
