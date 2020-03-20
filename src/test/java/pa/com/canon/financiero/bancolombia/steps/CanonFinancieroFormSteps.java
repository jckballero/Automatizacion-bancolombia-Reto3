package pa.com.canon.financiero.bancolombia.steps;

import java.util.List;

import net.thucydides.core.annotations.Step;
import pa.com.canon.financiero.bancolombia.pageobject.CanonFinancieroFormPage;

public class CanonFinancieroFormSteps {
	
	CanonFinancieroFormPage canonFinancieroFormPage; 
	
	@Step
	public void diligenciar_simulador_datos_tabla(List<List<String>> data, int id) {
		
		canonFinancieroFormPage.Valor_Activo(data.get(id).get(0).trim());
		canonFinancieroFormPage.Plazo_Contrato(data.get(id).get(1).trim());
		canonFinancieroFormPage.Porcentaje(data.get(id).get(2).trim());
		canonFinancieroFormPage.Tipo_Tasa(data.get(id).get(3).trim());
		canonFinancieroFormPage.Simular();
	}
	
	@Step
	public void verificar_ingreso_datos_formulario_exitoso() {
		canonFinancieroFormPage.form_sin_errores();
	}
	@Step
	public void verificar_ingreso_datos_formulario_fallido() {
		canonFinancieroFormPage.form_con_errores();
	}
	
}
