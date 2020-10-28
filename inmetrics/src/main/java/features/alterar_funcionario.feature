# language: pt
Funcionalidade: Alterar Funcionario

Contexto: 
Dado que acesso a página principal
Quando submeto minhas credencias "qa_tester@gmail.com"  "12345678"

@funcionario_i
Cenario: Devo realizar uma edicação em um registro de funcionário
E realizo uma busca utilizando o CPF "962.139.060-53"
E edito um funcionario "nome_teste_2" "674.514.850-13" "Feminino" "27/10/2020" "Analista de Qualidade" "5.500,00"
Então devo visualizar uma mensagem de sucesso