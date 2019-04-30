package code.edu.dsm.dmacc.extraCredit;

public class RunnerStoreOpener {

	public static void main(String[] args) {

		StoreOpener opener = new StoreOpener("Guru");

		StoreProviderFactory store = new StoreProviderFactory();
		store.getStore("Toy").openStore(opener.getName());

	}

}
