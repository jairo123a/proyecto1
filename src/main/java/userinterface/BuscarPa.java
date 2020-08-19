package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuscarPa extends PageObject {

    public static final net.serenitybdd.screenplay.targets.Target tarifario= net.serenitybdd.screenplay.targets.Target.the("seccion campo").located(By.xpath("//*[@id=\"footer-content\"]/div[2]/div[1]/div/div[2]/div/ul/li[5]/a"));
    public static final net.serenitybdd.screenplay.targets.Target pdf= net.serenitybdd.screenplay.targets.Target.the("seccion campo").located(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/table/tbody/tr[2]/td[2]"));
    public static final net.serenitybdd.screenplay.targets.Target texto= Target.the("click en donde").located(By.xpath("//*[@id=\"title\"]/span"));
public void tiempo(){

    waitFor(10).second();

}
}
