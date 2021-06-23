package test;

import framework.Driver;
import ui.Ajuda;

public class HelperClass {
	protected Driver driver;
	protected Ajuda ajuda;

	public HelperClass() {
		this.driver = new Driver();
		ajuda = new Ajuda(driver);
	}
}
