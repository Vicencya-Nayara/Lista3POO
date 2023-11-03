package PROGRAMA1;

class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(String nome,  int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void fazAniversario(){
        idade++;
    }

    public void imprimeIdade(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}