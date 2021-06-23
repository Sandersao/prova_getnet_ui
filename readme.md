# Sobre o projeto
## Estrutura
* O projeto trabalha com uma estrutura de **modulos** e **componentes**. Esta divis�o � feita com o intuito de facilitar o rastreio de erros e manuten��o do c�digo
    * Os **componentes** s�o trechos da aplica��o especializados em uma tarefa e tem como objetivo principal separar, requisi��o, valida��o, tratamento de dados (dto) e cen�rios de teste
        * Requisi��o: Tem como objetivo encapsular as requisi��es feitas para a API
        * Valida��o: Tem como objetivo encapsular a valida��o dos dados retornados pela api
        * Dto (Tratamento de dados): Tem como objetivo encapsular os dados de forma a melhorar o envio e tratamento desses dados
        * Cen�rio: Tem como objetivo integrar a os componentes de, requisi��o, valida��o e dto, assim, encapsulando os cen�rios de testes
    * Os **m�dulos** s�o as interfaces para cada m�dulo dentro da API, ou seja, para cada m�dulo na API, existir� um m�dulo no teste que conterar os 4 compenetes, requisi��o, valida��o, dto e cen�rios de testes. Exemp.:
        * Quando a API tiver um m�dulo para CRUD de usu�rio, o teste conter� um m�dulo que far� teste no CRUD de usu�rio
        * Quando a API tiver um m�dulo para CRUD de venda e funcionalidade de venda, o teste conter� um m�dulo que far� o teste do CRUD de venda e da funcionalidad de venda
