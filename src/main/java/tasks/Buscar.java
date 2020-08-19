package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnElement;
import userinterface.BuscarPa;

public class Buscar implements Task {
    BuscarPa tiempo;
    public static tasks.Buscar busqueda ()
    {

        return Tasks.instrumented(tasks.Buscar.class);


    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BuscarPa.tarifario),Click.on(BuscarPa.pdf));
      tiempo.tiempo();
    }
}
