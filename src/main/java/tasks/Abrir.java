package tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.Abrirpa;

public class Abrir implements Task {
    Abrirpa ab;
    public static tasks.Abrir abriPagina(){

        return Tasks.instrumented(tasks.Abrir.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(ab));
    }
}
