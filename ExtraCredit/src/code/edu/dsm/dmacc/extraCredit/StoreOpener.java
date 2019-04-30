package code.edu.dsm.dmacc.extraCredit;

public class StoreOpener implements Openner {

	private String name;
	private String position;

	public StoreOpener(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}

	
	public StoreOpener(String name) {
	 
		this.name = name;
		this.position = "Default";
		System.out.println("Creating new Store Opener "+ this.name);
	}


	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "StoreOpener [name=" + name + ", position=" + position + "]";
	}

	@Override
	public void performOpen() {
		System.out.println("opening the store..");

	}

}
