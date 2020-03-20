package pa.com.canon.financiero.bancolombia.definition;


import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pa.com.canon.financiero.bancolombia.steps.CanonFinancieroFormSteps;
import pa.com.canon.financiero.bancolombia.steps.ValidacionIngresoSteps;

public class CanonFinancieroDefinition {
	
	@Steps
	ValidacionIngresoSteps canonFinancieroSteps;
	@Steps
	CanonFinancieroFormSteps canonFinancieroFormSteps;
	
	@Given("^Seleciono la opción Productos y Servicios$")
	public void seleciono_la_opción_Productos_y_Servicios() throws Throwable {
		canonFinancieroSteps.Ingresar();
		canonFinancieroSteps.Productos_Y_Servicios();
	}

	@Given("^Selecciono la opción Leasing$")
	public void selecciono_la_opción_Leasing() throws Throwable {
	    canonFinancieroSteps.Leasing();
	}

	@Given("^Selecciono la opción Leasing habitacional$")
	public void selecciono_la_opción_Leasing_habitacional() throws Throwable {
	    canonFinancieroSteps.Leasing_Habitacional();
	}

	@Given("^Selecciono la opción Simular Canon Constante$")
	public void selecciono_la_opción_Simular_Canon_Constante() throws Throwable {
	    canonFinancieroSteps.Simular_Canon_Constante();
	}

	@When("^Diligencio el formulario$")
	public void diligencio_el_formulario(DataTable dtDatosForm){
	    List<List<String>> data = dtDatosForm.raw();
	    
	    for(int i = 1; i<data.size(); i++) {
	    	canonFinancieroFormSteps.diligenciar_simulador_datos_tabla(data, i);
	    	try {
	    		Thread.sleep(5000);
	    	}catch(InterruptedException e) {}
	    }
	 
	}

	@Then("^El sistema muestra los resultados de la simulación$")
	public void el_sistema_muestra_los_resultados_de_la_simulación() throws Throwable {
		canonFinancieroFormSteps.verificar_ingreso_datos_formulario_exitoso();
	}
	
	@Then("^Verificar que se presente Etiqueta Informativa de validación$")
	public void verificar_que_se_presente_Etiqueta_Informativa_de_validación() {
		canonFinancieroFormSteps.verificar_ingreso_datos_formulario_fallido();
	}


}
