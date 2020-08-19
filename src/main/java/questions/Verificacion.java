package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import tasks.Buscar;
import userinterface.BuscarPa;

public class Verificacion implements Question<Boolean>  {
   String pregunta;
    private Verificacion(String pregunta){
    this.pregunta=pregunta;


    }

public static Verificacion pregunta(String argumento){

    return new Verificacion(argumento);

}


    @Override
    public Boolean answeredBy(Actor actor) {
        String texto;
        Boolean resultado;
        texto = Text.of(BuscarPa.texto).viewedBy(actor).asString();
        if (texto.equals(pregunta)) {
            resultado=true;
            System.out.println(texto);
        } else
        {

            resultado=false;

        }
        return resultado;
    }

    @Override
    public String getSubject() {
        return null;
    }
}
