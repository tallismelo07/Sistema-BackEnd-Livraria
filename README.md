
  # Projeto Dados de Livros
 
  Este projeto foi criado para gerenciar informações sobre livros, incluindo:
  - Nome do autor
  - Título do livro
  - Ano de lançamento
  - Avaliações
 
  Com uma interface de entrada de dados via console, permite capturar e exibir informações detalhadas de um livro.
 
  ## Estrutura da Classe `Livro`
 
  ### Atributos:
  - `nomeAutor`: Armazena o nome do autor do livro.
  - `nomeDoLivro`: Guarda o título do livro.
  - `anoDeLancamento`: Indica o ano de publicação do livro.
  - `somaDasAvalicao`: Acumula a soma das avaliações recebidas pelo livro.
  - `quantidadesDeAvalicaoes`: Conta quantas avaliações o livro recebeu, facilitando cálculos como média.
 
  ### Métodos:
 
  1. **`capturarDadosLivro()`**
     - Coleta do usuário o nome do autor, título do livro e ano de lançamento.
     - Armazena essas informações nos atributos correspondentes.
 
  2. **`totaisDeAvaliacao()`**
     - Coleta uma nova avaliação para o livro e adiciona ao total acumulado.
     - Incrementa o número de avaliações para rastreamento.
 
  3. **`exibirFicha()`**
     - Exibe todos os dados sobre o livro, incluindo:
       - Nome do autor
       - Título do livro
       - Ano de lançamento
       - Soma das avaliações
       - Quantidade total de avaliações recebidas
 
  ## Uso do Projeto
  - Primeiro, chamar `capturarDadosLivro()` para registrar as informações básicas do livro.
  - Em seguida, usar `totaisDeAvaliacao()` para registrar uma nova avaliação do livro.
  - Finalmente, `exibirFicha()` pode ser utilizado para exibir uma ficha completa do livro.

  # Projeto Dados de Pessoa
 
  Esta classe `Pessoa` foi desenvolvida para capturar e armazenar informações básicas de uma pessoa,
  incluindo:
  - Nome
  - Número de matrícula
  - Idade
 
  A classe oferece uma interface simples via console para a entrada de dados.
 
  ## Estrutura da Classe `Pessoa`
 
  ### Atributos:
  - `nome`: Armazena o nome da pessoa.
  - `numeroMatricula`: Guarda o número de matrícula associado à pessoa.
  - `idade`: Registra a idade da pessoa.
 
  ### Método:
 
  **`capturarDados()`**
  - Solicita ao usuário que forneça o nome, número de matrícula e idade.
  - Esses dados são capturados e armazenados nos atributos correspondentes da classe.
 
  ## Uso do Projeto
 
  - Chamar `capturarDados()` para coletar as informações de uma pessoa.
  - Após a execução, a classe `Pessoa` terá os dados armazenados nos atributos, prontos para serem utilizados.


  # Projeto Principal
 
  Esta classe `Principal` é o ponto de entrada do programa e é responsável por orquestrar 
  a interação entre as classes `Pessoa` e `Livro`.
 
  ## Estrutura da Classe `Principal`
 
  A classe contém o método `main`, que é o ponto de partida da aplicação.
 
  ### Métodos:
 
  **`main(String[] args)`**
  - Cria instâncias das classes `Pessoa` e `Livro`.
  - Chama o método `capturarDados()` da classe `Pessoa` para coletar informações do aluno.
  - Chama o método `capturarDadosLivro()` da classe `Livro` para coletar informações do livro.
  - Chama o método `totaisDeAvaliacao()` da classe `Livro` para registrar uma avaliação do livro.
  - Finalmente, chama o método `exibirFicha()` da classe `Livro` para mostrar todas as informações coletadas.
 
  ## Uso do Projeto
 
  - Ao executar a classe `Principal`, o programa solicitará ao usuário que insira dados para um aluno e um livro.
  - Após a coleta, o programa exibirá uma ficha completa do livro, incluindo as informações do aluno e a avaliação do livro.


 

