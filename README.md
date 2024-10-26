
 * # Projeto Dados de Livros
 *
 * Este projeto foi criado para gerenciar informações sobre livros, incluindo:
 * - Nome do autor
 * - Título do livro
 * - Ano de lançamento
 * - Avaliações
 *
 * Com uma interface de entrada de dados via console, permite capturar e exibir informações detalhadas de um livro.
 *
 * ## Estrutura da Classe `Livro`
 *
 * ### Atributos:
 * - `nomeAutor`: Armazena o nome do autor do livro.
 * - `nomeDoLivro`: Guarda o título do livro.
 * - `anoDeLancamento`: Indica o ano de publicação do livro.
 * - `somaDasAvalicao`: Acumula a soma das avaliações recebidas pelo livro.
 * - `quantidadesDeAvalicaoes`: Conta quantas avaliações o livro recebeu, facilitando cálculos como média.
 *
 * ### Métodos:
 *
 * 1. **`capturarDadosLivro()`**
 *    - Coleta do usuário o nome do autor, título do livro e ano de lançamento.
 *    - Armazena essas informações nos atributos correspondentes.
 *
 * 2. **`totaisDeAvaliacao()`**
 *    - Coleta uma nova avaliação para o livro e adiciona ao total acumulado.
 *    - Incrementa o número de avaliações para rastreamento.
 *
 * 3. **`exibirFicha()`**
 *    - Exibe todos os dados sobre o livro, incluindo:
 *      - Nome do autor
 *      - Título do livro
 *      - Ano de lançamento
 *      - Soma das avaliações
 *      - Quantidade total de avaliações recebidas
 *
 * ## Uso do Projeto
 *
 * - Primeiro, chamar `capturarDadosLivro()` para registrar as informações básicas do livro.
 * - Em seguida, usar `totaisDeAvaliacao()` para registrar uma nova avaliação do livro.
 * - Finalmente, `exibirFicha()` pode ser utilizado para exibir uma ficha completa do livro.
 
