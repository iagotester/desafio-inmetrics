# Desafio Inmetrics

Objetivo
Avaliar as competências do candidato no entendimento e escrita de Cenários e na construção de testes automatizados,
bem como no uso de boas práticas.

Configuração do ambiente - 
Para executar os testes são necessários os seguintes requisitos:
 Ter instando o plugin do Cucumber no marketplace do eclipse
 Ter instalado no projeto as seguintes dependências: 
 - cucumber-java versão 1.2.5
 - cucumber-junit versão 1.2.5
 - cucumber-junit versão 1.2.5
 - selenium-java versão 3.141.59
 - Junit 4 
 
 Estrutura do projeto
 O projeto está estruturado da seguinte forma:
 - Pacote Config :  Responsável por guardar alguns configurações básicas do projeto tais como : url, browser.
 - Pacote feature:  Responsável por gerar a estrutura dos testes propriamente ditas.
 - Pacote Pages:     Pacote onde estão alocadas todas as Page Objects utilizadas no projeto;
 - Pacote utils:Pacote responsável por gerar as configuraçóes básicas dos projeto. Nele estão as cases TesteBase e TesteUtil. 
    Testebase - Classe responsável por criar e gerenciar as instnacias do driver, padrão utilizando Factory.
  - Pacote Runner - Pacote responsável por executar as classes de teste .features;
  - Pacote Steps - Pacote responsável por fazer o encapuslamento entre os passos criados no pacote feature e os metódos criados nos Page Object's;
  - Pasta Target - Nela está alocada o relatório de execução dos testes.
  
  
 Executando a suite de teste
 
 Para executar a suite de teste, basta clicar com o botão direito no arquivo Runner.java > Run As > Junit Teste.
 Feito isso será executado todos os testes da suite. Caso não deseje executar todos os testes, basta descomentar a "tags" e selecionar os testes que deseja executar dividos pelas tags : @funcionario, @login, @cadastro.
 
  
  




