#language: en
   @mobile @alarm
  Feature: Alarme do relogio

    @alarm_valido
    Scenario: Testar alarme corretamente
      Given seleciono a opcao de alarme
      When clico para adicionar um novo alarme
      Then o alarme eh criado

    @alarm_invalido
    Scenario: Testar alarme informando valor incorreto
      Given seleciono a opcao de alarme
      When informo um valor incorreto
      Then recebo mensagem de erro
