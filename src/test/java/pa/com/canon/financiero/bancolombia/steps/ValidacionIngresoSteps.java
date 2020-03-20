package pa.com.canon.financiero.bancolombia.steps;

import net.thucydides.core.annotations.Step;
import pa.com.canon.financiero.bancolombia.pageobject.CanonFinancieroIngresoPage;

public class ValidacionIngresoSteps {
	
CanonFinancieroIngresoPage canonFinancieroIngresoPage;
	
	@Step
	public void Ingresar() {
		canonFinancieroIngresoPage.open();
	}
	
	@Step
	public void Productos_Y_Servicios() {
		canonFinancieroIngresoPage.BotonProductosServicios();
	}
	
	@Step
	public void Leasing() {
		canonFinancieroIngresoPage.BotonLeasing();
	}
	
	@Step
	public void Leasing_Habitacional() {
		canonFinancieroIngresoPage.BotonLeasingHabitacional();
	}
	
	@Step
	public void Simular_Canon_Constante() {
		canonFinancieroIngresoPage.BotonSimularCanonConstante();
	}
}
