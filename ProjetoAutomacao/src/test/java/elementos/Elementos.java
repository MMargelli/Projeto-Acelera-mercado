package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnXInicio = By.xpath("//span[@class='fechar-x']");
	private By btnNovidades = By.xpath("//a[@id='Novidades']");
	private By campoPesquisa = By.xpath("//input[@id='search-input']");
	private By btnLupaPesquisa = By.xpath("//button[@qa-automation='home-search-button']");
	private By produtoEscolhido = By.xpath("/html/body/div[2]/main/section/section[2]/div[2]/div/a[12]/div/div[1]/div[2]/img");
	private By btnTamanho = By.xpath("//a[@data-size='size-34']");
	private By btnBuy = By.xpath("//button[@id='buy-button-now']");

	public By getBtnNovidades() {
		return btnNovidades;
	}

	public By getcampoPesquisa() {
		return campoPesquisa;
	}

	public By getProdutoEscolhido() {
		return produtoEscolhido;
	}

	public By getBtnTamanho() {
		return btnTamanho;
	}

	public By getBtnBuy() {
		return btnBuy;
	}

	public By getBtnLupaPesquisa() {
		return btnLupaPesquisa;
	}

	public By getBtnXInicio() {
		return btnXInicio;
	}

}
