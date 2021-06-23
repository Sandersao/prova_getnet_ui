package test;

import org.junit.Test;

public class TesteAjuda extends HelperClass {
	@Test
	public void testarCadastroPurgeDeUsuario() {
		driver.iniciar("https://site.getnet.com.br/");
		
		ajuda.gotoAjuda();
		ajuda.testTelefone1("4002-4000");
		ajuda.testTelefone2("4003-4000");
		ajuda.testTelefone3("0800-648-8000");
		
		driver.finalizar();
	}
}
