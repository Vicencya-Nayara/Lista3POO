import java.time.LocalDateTime;

public class Locacao {
    Carro c;
    LocalDateTime dataLocacao;
    LocalDateTime dataDevolucao = LocalDateTime.now(); 
    double valor;
    Cliente cliente;


    public  void imprimirLocacao() {
        System.out.println("**** Locação de Veiculo ****");
        System.out.println("Modelo: " +this.c.modelo.descricao);
        System.out.println("Placa: "+this.c.placa);
        System.out.println("Cor: " +this.c.cor);
        System.out.println("Ano: "+this.c.ano);
        System.out.println("Cliente: " +this.cliente.nome);
        System.out.println("Data de Locação: "+this.dataDevolucao.toString());
        System.out.println("Valor a pagar: "+this.valor);

        
    }

}
