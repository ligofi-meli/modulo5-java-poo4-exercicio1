package gomes.filipe.domain;

public class Pessoa {
    private String nome;
    private int idade;
    private String id;
    private double peso;
    private double altura;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", id='" + id + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getId() {
        return id;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calculaIMC(double peso, double altura ) {
        double calculo = Math.round((peso / Math.pow(altura, 2)));

        if (calculo < 20) {
            System.out.println("IMC: Valor " + calculo + " abaixo de 20, baixo peso");
        } else if (calculo <= 20 || calculo <= 25) {
            System.out.println("IMC: Valor " + calculo + " entre 20 e 25, peso saudável");
        } else {
            System.out.println("IMC: Valor " + calculo + " acima de 25, sobrepeso");
        }
        return calculo;
    }

    public boolean eMaiorDeIdade (int idade) {
        return idade >=18;
    }
}
