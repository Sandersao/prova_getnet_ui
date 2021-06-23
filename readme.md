# Sobre o projeto
## Estrutura
* O projeto trabalha com uma estrutura de **modulos** e **componentes**. Esta divisão é feita com o intuito de facilitar o rastreio de erros e manutenção do código
    * Os **componentes** são trechos da aplicação especializados em uma tarefa e tem como objetivo principal separar, requisição, validação, tratamento de dados (dto) e cenários de teste
        * Requisição: Tem como objetivo encapsular as requisições feitas para a API
        * Validação: Tem como objetivo encapsular a validação dos dados retornados pela api
        * Dto (Tratamento de dados): Tem como objetivo encapsular os dados de forma a melhorar o envio e tratamento desses dados
        * Cenário: Tem como objetivo integrar a os componentes de, requisição, validação e dto, assim, encapsulando os cenários de testes
    * Os **módulos** são as interfaces para cada módulo dentro da API, ou seja, para cada módulo na API, existirá um módulo no teste que conterar os 4 compenetes, requisição, validação, dto e cenários de testes. Exemp.:
        * Quando a API tiver um módulo para CRUD de usuário, o teste conterá um módulo que fará teste no CRUD de usuário
        * Quando a API tiver um módulo para CRUD de venda e funcionalidade de venda, o teste conterá um módulo que fará o teste do CRUD de venda e da funcionalidad de venda
