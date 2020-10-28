# language: pt
Funcionalidade: Excluir Funcionario

Contexto: 
Dado que acesso a página principal
Quando submeto minhas credencias "qa_tester@gmail.com"  "12345678"

@funcionario
Cenario: Devo realizar uma exclusão de funcionário
E removo um usuário 
Então devo visualizar uma mensagem de sucesso