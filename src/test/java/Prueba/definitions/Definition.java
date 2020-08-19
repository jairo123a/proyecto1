package Prueba.definitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import questions.Verificacion;
import tasks.Abrir;
import tasks.Buscar;

public class Definition {

   @Before
    public  void setStage(){

        OnStage.setTheStage(new OnlineCast());

    }


    @Given("^ingreso al sitio web$")
    public void ingresoAlSitioWeb() {

       OnStage.theActorCalled("jairo").wasAbleTo(Abrir.abriPagina());

    }


    @When("^ingresar al menu tarifario y descargar pdf$")
    public void ingresarAlMenuTarifarioYDescargarPdf() {
      OnStage.theActorInTheSpotlight().attemptsTo(Buscar.busqueda());
    }

    @Then("^Verificar pdf texto\"([^\"]*)\"$")
    public void verificarPdfTexto(String arg1) {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificacion.pregunta(arg1)));
    }



}
