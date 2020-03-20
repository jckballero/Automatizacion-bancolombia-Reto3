package pa.com.canon.financiero.bancolombia.pageobject;

import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.containsString;
//import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*; 

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.grupobancolombia.com/personas")
public class CanonFinancieroIngresoPage extends PageObject{
	
	@FindBy(xpath="//A[@id='menu-productos']")
	public WebElementFacade btnProductosServicios;
	
	@FindBy(xpath="//H3[@class='submenu-title'][text()='Productos y Servicios']")
	public WebElementFacade labelProductosServicios;
	
	@FindBy(xpath="//A[@id='header-productos-leasing']")
	public WebElementFacade btnLeasing;
	
	@FindBy(xpath="//H1[text()='Leasing']")
	public WebElementFacade labelLeasing;
	
	@FindBy(xpath="//A[@href='/personas/productos-servicios/leasing/habitacional/'][text()='Leasing Habitacional']")
	public WebElementFacade btnLeasingHabitacional;
	
	@FindBy(xpath="//H1[text()='Leasing Habitacional']")
	public WebElementFacade labelLeasingHabitacional;
	
	@FindBy(xpath="//A[@href='/personas/productos-servicios/leasing/habitacional/simulador-canon-financiero/'][text()='Simular Canon Constante']")
	public WebElementFacade btnSimularCanonConstante;
	
	@FindBy(xpath="//H1[text()='Simulador de canon financiero']")
	public WebElementFacade labelSimuladorCanonConstante;
	
	public void BotonProductosServicios() {
		btnProductosServicios.click();
		String strMensaje = labelProductosServicios.getText();
		assertThat(strMensaje, containsString("Productos y Servicios"));
	
	}
	
	public void BotonLeasing() {
		btnLeasing.click();
		String strMensaje = labelLeasing.getText();
		assertThat(strMensaje, containsString("Leasing"));
	}
	
	public void BotonLeasingHabitacional() {
		btnLeasingHabitacional.click();
		String strMensaje = labelLeasingHabitacional.getText();
		assertThat(strMensaje, containsString("Leasing Habitacional"));
	}
	
	public void BotonSimularCanonConstante() {
		btnSimularCanonConstante.click();
		String strMensaje = labelSimuladorCanonConstante.getText();
		assertThat(strMensaje, containsString("Simulador de canon financiero"));
	}
}
