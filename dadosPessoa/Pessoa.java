package projeto02.dadosPessoa;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int numeroMatricula;
    private int idade;

    public void capturarDados(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua matricula: ");
        numeroMatricula = sc.nextInt();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
    }
}
