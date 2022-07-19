


Feature: Automacao de testes de UI no site
  Eu como usuario quero realizar compra de um produto no site

  @tag1
  Scenario: Realizar compra de um produto
    Given que eu esteja no site da shoestock
    When escolher o produto
    And clicar em comprar
    Then valido o resumo da compra
    

  