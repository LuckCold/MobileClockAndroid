#language: en
@mobile @timer
Feature: Funcionalidades do relogio

  @add_timer
  Scenario: Testar timer
    Given seleciono a opcao de timer
    When adiciono um novo timer
    Then o timer eh criado