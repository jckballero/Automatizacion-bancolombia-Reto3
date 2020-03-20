package pa.com.canon.financiero.bancolombia.pageobject;

//import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*; 

public class CanonFinancieroFormPage extends PageObject{
	
	@FindBy(name="valorActivo")
	public WebElementFacade txtValorActivo;
	
	@FindBy(xpath="(//INPUT[@type='text'])[2]")
	public WebElementFacade txtPlazoContrato;
	
	@FindBy(xpath="(//INPUT[@type='text'])[3]")
	public WebElementFacade txtPorcentaje;
	
	@FindBy(xpath="//SELECT[@name='comboTipoTasa']")
	public WebElementFacade cmbTipoTasa;
	
	@FindBy(xpath="//BUTTON[@name='simular'][text()='Simular']")
	public WebElementFacade btnSimular;
	
	//globos de validacion==================================
	@FindBy(className="error text-danger bg-danger")
	public WebElementFacade globoInformativo1;
	/*@FindBy(xpath="//SPAN[@ng-show='CanonFinancieroForm.plazo.$error.required'][text()='Este campo es obligatorio.']")
	public WebElementFacade globoInformativo2;
	@FindBy(xpath="//SPAN[@ng-show='CanonFinancieroForm.opcionCompra.$error.required'][text()='Este campo es obligatorio.']")
	public WebElementFacade globoInformativo3;
	@FindBy(xpath="(//SPAN[@class='ng-binding'][text()='Este campo es obligatorio.'][text()='Este campo es obligatorio.'])[4]")
	public WebElementFacade globoInformativo4;*/
	
	
	public void Valor_Activo(String datoPrueba) {
		txtValorActivo.click();
		txtValorActivo.clear();
		txtValorActivo.sendKeys(datoPrueba);
	}
	
	public void Plazo_Contrato(String datoPrueba) {
		txtPlazoContrato.click();
		txtPlazoContrato.clear();
		txtPlazoContrato.sendKeys(datoPrueba);
	}
	
	public void Porcentaje(String datoPrueba) {
		txtPorcentaje.click();
		txtPorcentaje.clear();
		txtPorcentaje.sendKeys(datoPrueba);
	}
	
	public void Tipo_Tasa(String datoPrueba) {
		cmbTipoTasa.click();
		cmbTipoTasa.selectByVisibleText(datoPrueba);
	}
	
	public void Simular() {
		btnSimular.click();
		btnSimular.sendKeys();
	}
	//======
	public void form_sin_errores() {
		System.out.println("no se mostro el error");
		assertThat(globoInformativo1.isCurrentlyVisible(), is(false));
	}
	
	public void form_con_errores() {
		/*if(globoInformativo1 != null) {
			assertThat(globoInformativo1.isCurrentlyVisible(), is(false));
		}else if(globoInformativo2 != null) {
			assertThat(globoInformativo2.isCurrentlyVisible(), is(false));
		}else if(globoInformativo3 != null) {
			assertThat(globoInformativo3.isCurrentlyVisible(), is(false));
		}else if(globoInformativo4 != null) {
			assertThat(globoInformativo4.isCurrentlyVisible(), is(false));
		}*/	
		System.out.println("se mostro el error");
		assertThat(globoInformativo1.isCurrentlyVisible(), is(true));
	}
	
}
