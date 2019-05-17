# TECNOLOGIAS UTILIZADAS

Banco de Dados H2 <br/>
SpringBoot
Spring Data,<br/>
Spring Web,<br/>
Spring DevTools<br/>
JQuery (Ajax)<br/>
HTML( JSP)<br/>
Lombok - O Lombok é uma biblioteca Java focada em produtividade e redução de código boilerplate (verbosidade) <br/>
Swagger


# CADASTRO DE PESSOAS 

<br/><br/>

Este sistema consiste em um crud de cadastro de pessoas. Tendo como dados principais: Nome, Email, Telefone e dados de localização (endereço)

<br/><br/>

1 - Neste sistema fazemos uso de Ajax, fazendo uso de biblioteca do JQUERY para requisições assincronas. A URI do serviço é  https://localhost:8080/cep/{cep}

<br/><br/>

2 - Para concluir a consulta acima, fazemos consumo de uma API do Correios. 

<br/><br/>

3 - Utilizamos um banco de dados embutido relacional (H2) que esta exposto no recurso: 
 http://localhost:8080/h2

user: sa
password: 

Aqui conseguimos visualizar as entidades do banco e ver as informações que foram persistidas.

<br/><br/>
4 - Temos um framework para documentação de API do projeto, que esta localizado em :
 http://localhost:8080/swagger-ui.html

<br/><br/>

5 - Faço uso de cache na API que faz consulta ao serviço do correios para ser mais rapido, no caso de consultas com o mesmo valor de requisição (cep). Sendo que o cache devolve o que ja esta em memória.
