import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.cadrastarCliene("Vicencya Nayara", "02879632144", "88998602994");

        Carro car = new Carro();
        car.cadastrarCarro("PNB25", "Cinza", 2023, "Flex", 4, 0, "Civic", "Honda");

        Locacao loc = new Locacao();
        loc.c = car;
        loc.cliente = c;
        loc.valor = 2500;
        loc.dataLocacao = LocalDateTime.parse("15/10/2023 08:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        loc.imprimirLocacao();

    }
}
