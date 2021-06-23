package ui;

import framework.Driver;

public class Ajuda {
	private Driver piloto;

	private String cssAjuda = "#menu-main-desktop>li:nth-child(7)>a";

	private String cssTelefone1 = "#menu-main-desktop>li:nth-child(7)>div>div:nth-last-child(1)>ul>li:nth-last-child(1)>div>div>ul>li>a>*:nth-child(2)";
	private String cssTelefone2 = "#menu-main-desktop>li:nth-child(7)>div>div:nth-last-child(1)>ul>li:nth-last-child(1)>div>div>ul>li>a>*:nth-child(3)";
	private String cssTelefone3 = "#menu-main-desktop>li:nth-child(7)>div>div:nth-last-child(1)>ul>li:nth-last-child(1)>div>div>ul>li>a>*:nth-child(5)";

	public Ajuda(Driver driver) {
		this.piloto = driver;
	}

	public void gotoAjuda() {
		piloto.clicar(cssAjuda);
	}

	public void testTelefone1(String telefoneEsperado) {
		String telefoneObtido = piloto.ler(this.cssTelefone1);
		piloto.atestarIgualdade(telefoneObtido, telefoneEsperado);
	}

	public void testTelefone2(String telefoneEsperado) {
		String telefoneObtido = piloto.ler(this.cssTelefone2);
		piloto.atestarIgualdade(telefoneObtido, telefoneEsperado);
	}

	public void testTelefone3(String telefoneEsperado) {
		String telefoneObtido = piloto.ler(this.cssTelefone3);
		piloto.atestarIgualdade(telefoneObtido, telefoneEsperado);
	}
}
