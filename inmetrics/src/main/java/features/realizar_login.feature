# language: pt
Funcionalidade: Realizar o login

Contexto: 
Dado que acesso a página principal

@login
Cenario: 
Quando submeto minhas credencias  "qa_tester@gmail.com"  "12345678"
Então a tela inicial deverá ser exibida

