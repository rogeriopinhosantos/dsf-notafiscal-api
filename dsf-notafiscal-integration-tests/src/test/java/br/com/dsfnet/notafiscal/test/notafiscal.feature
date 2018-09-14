Feature: Perform integrated tests on the NotaFiscal registration API

Background:
* url 'https://ashqzoz9x6.execute-api.us-east-1.amazonaws.com/dev'

 
Scenario: Registry a new Nota Fiscal

#Create a new Avenger
Given path 'notas'
And request {numeronota: '1', descricaonota: 'Nota de servicos de informatica', valor: '100,50'}
When method post
Then status 201
And match response == {id: '#string', numeronota: '1', descricaonota: 'Nota de servicos de informatica',	valor: '100,50'}
