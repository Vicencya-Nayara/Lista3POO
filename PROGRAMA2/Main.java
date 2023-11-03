package PROGRAMA2;

public class Main {    public static void main(String[] args) {
    Porta porta = new Porta(false, "Vermelha", 100, 200, 300);

    porta.abre();

    if (porta.estaAberta()) {
        System.out.println("A porta está aberta");
    } else {
        System.out.println("A porta está fechada");
    }

    porta.pinta("Azul");

    System.out.println("A cor da porta é " + porta.cor);

    porta.dimensaoX = 200;
    porta.dimensaoY = 300;
    porta.dimensaoZ = 400;

    System.out.println("As dimensões da porta são " + porta.dimensaoX + ", " + porta.dimensaoY + " e " + porta.dimensaoZ);

    porta.fecha();

    if (!porta.estaAberta()) {
        System.out.println("A porta está fechada");
    } else {
        System.out.println("A porta está aberta");
    }
}

}
