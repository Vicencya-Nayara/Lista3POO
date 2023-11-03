package PROGRAMA3;

public class Main {

    public static void main(String[] args) {
        Casa casa = new Casa("vermelha");

        casa.abrePorta1();
        casa.abrePorta2();
        casa.fechaPorta3();

        System.out.println("A casa é da cor " + casa.cor);
        System.out.println("Quantas portas estão abertas? " + casa.quantasPortasEstaoAbertas());
    }
}
