package gomes.filipe.domain;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Filipe", 30, "010101", 75.5, 1.80);
        boolean maiorDeIdade = pessoa1.eMaiorDeIdade(30);

        System.out.println("--- Pessoa 1 ---");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade() + " anos");
        System.out.println("Id: " + pessoa1.getId());
        System.out.println("Peso: " + pessoa1.getPeso() + " kg");
        System.out.println("Altura: " + pessoa1.getAltura() + " m");
        System.out.println("Maior de idade: " + maiorDeIdade);

        double imc = pessoa1.calculaIMC(75, 1.80);

        Pessoa pessoa2 = new Pessoa("Anna", 28);
        System.out.println("\n--- Pessoa 2 ---");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade() + " anos");


    }
}
