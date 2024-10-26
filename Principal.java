package projeto02;

import projeto02.dadosLivros.Livro;
import projeto02.dadosPessoa.Pessoa;

public class Principal {
    public static void main(String[] args) {

        Pessoa aluno01 = new Pessoa();
        Livro livro01 = new Livro();
        aluno01.capturarDados();
        livro01.capturarDadosLivro();
        livro01.totaisDeAvaliacao();

        livro01.exibirFicha();




    }
}
