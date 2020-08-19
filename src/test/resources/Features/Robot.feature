Feature: Ingresar al sitio web y descargar un pdf
  @regresion

  @caso1
  Scenario: Ingresar al sitio web y descargar un pdf
    Given ingreso al sitio web
    When  ingresar al menu tarifario y descargar pdf
    Then  Verificar pdf texto"S56_ActualizacionTarifarioDepositos_Dic2019"
