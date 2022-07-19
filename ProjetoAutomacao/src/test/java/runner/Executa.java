package runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Executa {
	
	
	WebDriver driver;
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	@Given("que eu esteja no site da shoestock")
	public void que_eu_esteja_no_site_da_shoestock() {
		
		System.out.println("---Acessando o site da Shoestock---");
     metodos.abrirNavegador("https://www.shoestock.com.br");
     metodos.clicar(By.id("Novidades"));
	
		
	}

	@When("escolher o produto")
	public void escolher_o_produto() throws InterruptedException {

		metodos.escrever(el.getcampoPesquisa(), "bota feminina cano curto de couro diferente"); 
		metodos.submit(el.getBtnLupaPesquisa());
		Thread.sleep(3000);
		metodos.clicar(el.getProdutoEscolhido());
		metodos.scroll(0, 200);
		metodos.clicar(el.getBtnTamanho());
	
	}

	@When("clicar em comprar")
	public void clicar_em_comprar() {
		
		System.out.println("---Escolhendo produto na Shoestock para efetivar a compra---");
		metodos.clicar(el.getBtnBuy());
	}

	@Then("valido o resumo da compra")
	public void valido_o_resumo_da_compra() throws IOException {

		System.out.println("---Validando a compra com Evidência---");
		metodos.evidenciaTeste("CT - 01");
		metodos.fecharNavegador();
	}

}
