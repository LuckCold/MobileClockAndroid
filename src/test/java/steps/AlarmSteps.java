package steps;

import com.itextpdf.text.DocumentException;
import config.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logics.AlarmLogic;
import utils.eGen;

import java.io.IOException;


public class AlarmSteps {
    AlarmLogic alarm;


    @Given("seleciono a opcao de alarme")
    public void seleciono_a_opcao_de_alarme() throws DocumentException, IOException {

        alarm = new AlarmLogic();
        alarm.acessoOpcaoAlarme();
    }
    @When("clico para adicionar um novo alarme")
    public void clico_para_adicionar_um_novo_alarme() throws DocumentException, IOException {

        alarm = new AlarmLogic();
        alarm.crioAlarmeValido();
        new eGen().geraEvidencia(DriverFactory.getDriver(), "Teste");


    }
    @Then("o alarme eh criado")
    public void o_alarme_eh_criado() {

        alarm = new AlarmLogic();
        alarm.validoAlarmCriado();
    }

    @When("informo um valor incorreto")
    public void informo_um_valor_incorreto(){

        alarm = new AlarmLogic();
        alarm.crioAlarmeInvalido();

    }
    @Then("recebo mensagem de erro")
    public void recebo_mensagem_de_erro(){
        alarm = new AlarmLogic();
        alarm.validoMsgDeErro();

    }

}
