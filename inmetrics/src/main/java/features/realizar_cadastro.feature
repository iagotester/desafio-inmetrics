# language: pt
Funcionalidade: Realizar Cadastro

Contexto: 
Dado que acesso a página principal
E clico no link de cadastro

@cadastro
Cenario: 
Quando preencho o formulario "Novo2Cadastro@gmail.com" "12345678" "12345678"
Então devo acessar o sistema "Novo2Cadastro@gmail.com" "12345678"
E visualizar a tela inicial


