package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logics.TimerLogic;
import org.junit.Assert;

public class TimerSteps {

    @Given("seleciono a opcao de timer")
    public void seleciono_a_opcao_de_timer() {
        TimerLogic timerLogic  = new TimerLogic();
        timerLogic.clicoNaOpcaoTimer();
    }
    @When("adiciono um novo timer")
    public void adiciono_um_novo_timer() {
        TimerLogic timerLogic = new TimerLogic();
        timerLogic.digitoUmTimer();
    }
    @Then("o timer eh criado")
    public void o_timer_eh_criado() {
        TimerLogic timerLogic = new TimerLogic();
        timerLogic.inicioTimer();
        timerLogic.validoTimerCriado();
    }
}
