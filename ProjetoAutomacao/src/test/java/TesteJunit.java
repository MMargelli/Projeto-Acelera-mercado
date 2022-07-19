
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import elementos.Elementos;
import metodos.Metodos;

public class TesteJunit {

	Elementos el = new Elementos();
	Metodos metodos = new Metodos();
	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		
		metodos.abrirNavegador("https://www.shoestock.com.br");
 
	} 

	@After
	public void tearDown() throws Exception {

		//metodos.fecharNavegador();
		
	}

	@Test
	public void acessandoSite() throws IOException, InterruptedException {

		System.out.println("Iniciando os testes.");
		
		metodos.clicar(By.id("Novidades"));
		metodos.escrever(el.getcampoPesquisa(), "bota feminina cano curto de couro diferente"); 
		metodos.submit(el.getBtnLupaPesquisa());
		metodos.clicar(el.getProdutoEscolhido());
		metodos.scroll(0, 300);
		metodos.clicar(el.getBtnTamanho());
		metodos.clicar(el.getBtnBuy());
        metodos.evidenciaTeste("CT - 01");
       
        
	}
}
