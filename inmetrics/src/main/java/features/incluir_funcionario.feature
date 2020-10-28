# language: pt
Funcionalidade: Incluir Funcionario

Contexto: 
Dado que acesso a página principal
Quando submeto minhas credencias "qa_tester@gmail.com"  "12345678"
E clico em NOVO FUNCIONÁRIO

@funcionarioi
Cenario:
E preencho o formulário de cadastro "nome_teste" "962.139.060-53" "Masculino" "27/10/2020" "Analista de Qualidade" "4.500,00"
Então devo visualizar a tela de registros de funcionários