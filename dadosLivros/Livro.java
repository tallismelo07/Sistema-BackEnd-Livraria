package projeto02.dadosLivros;

import java.util.Locale;
import java.util.Scanner;

public class Livro {
    private String nomeAutor;
    private String nomeDoLivro;
    private int anoDeLancamento;
    private double somaDasAvalicao;
    private double quantidadesDeAvalicaoes;


    public void capturarDadosLivro(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do Autor: ");
        nomeAutor = sc.nextLine();
        System.out.println("Nome do livro: ");
        nomeDoLivro = sc.nextLine();
        System.out.println("Ano de Lançamento: ");
        anoDeLancamento = sc.nextInt();


    }

    public double totaisDeAvaliacao(){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e a avaliacao dele: ");
        somaDasAvalicao = scanner.nextDouble();
        quantidadesDeAvalicaoes++;
        return somaDasAvalicao;
    }

    public void exibirFicha(){
        System.out.println("Nome do Autor: " + nomeAutor);
        System.out.println("NOme do Livro: " + nomeDoLivro);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Nota do Livro: " + somaDasAvalicao);
        System.out.println("Totais de avaliacao: " + quantidadesDeAvalicaoes);


    }
}
