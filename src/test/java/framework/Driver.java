package framework;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;

public class Driver {
	public Driver() {
		SeleniumDrive.start();
	}

	public void iniciar(String link) {
		SeleniumDrive.driver.get(link);
		this.esperar(300);
	}

	public void finalizar() {
		SeleniumDrive.driver.close();
	}

	public void clicar(String css) {
		this.esperar(css);
		this.esperar(300);
		try {
			SeleniumDrive.driver.findElement(By.cssSelector(css)).click();
		} catch (Exception e) {

		}
	}

	public void clicar(String css, String texto) {
		this.esperar(css + ":nth-child(1)");
		try {
			List<WebElement> elements = SeleniumDrive.driver.findElements(By.cssSelector(css));
			for (WebElement element : elements) {
				if (element.getAttribute("innerHTML").equalsIgnoreCase(texto)) {
					element.click();
				}
			}
		} catch (Exception e) {

		}
	}

	public void selecionar(String css, String texto) {
		this.esperar(css);
		try {
			WebElement elemento = SeleniumDrive.driver.findElement(By.cssSelector(css));
			Select select = new Select(elemento);
			select.selectByVisibleText(texto);
		} catch (Exception e) {

		}
	}

	public void digitar(String css, String texto) {
		this.esperar(css);
		try {
			SeleniumDrive.driver.findElement(By.cssSelector(css)).sendKeys(texto);
		} catch (Exception e) {

		}
	}

	public String ler(String css) {
		this.esperar(css);
		String msgReportingSuccess = "";
		try {
			SeleniumDrive.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(css)));
			WebElement lblMensagem = SeleniumDrive.driver.findElement(By.cssSelector(css));
			msgReportingSuccess = lblMensagem.getAttribute("innerHTML");
		} catch (Exception e) {

		}
		return msgReportingSuccess;
	}

	public String ler(String css, String regxp) {
		String msgReportingSuccess = this.ler(css);
		if (!msgReportingSuccess.equalsIgnoreCase("")) {
			msgReportingSuccess = msgReportingSuccess.replaceAll("\\" + regxp, "");
		}
		return msgReportingSuccess;
	}

	public void esperar(int miliseconds) {
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void esperar(String css) {
		try {
			SeleniumDrive.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
		} catch (Exception e) {

		}
	}

	public boolean visivel(String css) {
		boolean retorno = false;
		try {
			int i = 0;
			while (i < 3) {
				Thread.sleep(100);
				retorno = SeleniumDrive.driver.findElement(By.cssSelector(css)).isDisplayed();
				if (retorno == true) {
					i = 3;
				}
				i++;
			}
		} catch (Exception e) {

		}
		return retorno;
	}

	public void atestarIgualdade(String feedbackObtido, String feedbackEsperado) {
		assertEquals(feedbackEsperado, feedbackObtido);
	}

	public String limpar(String mensagem) {
		String regex = "<.*?>";
		mensagem = mensagem.trim();
		mensagem = mensagem.replaceAll("\\" + regex, "");
		return mensagem;
	}

	public String limpar(String mensagem, String regex) {
		mensagem = mensagem.trim();
		mensagem = mensagem.replaceAll("\\" + regex, "");
		return mensagem;
	}
}
