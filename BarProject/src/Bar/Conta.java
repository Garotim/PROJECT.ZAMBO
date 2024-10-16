package Bar;

public class Conta {
    Cliente cliente;
    double ingresso;
    double consumo;
    double couvert;
    double total;

    
    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.ingresso = (cliente.sexo == 'M') ? 10.00 : 8.00;
        this.consumo = 0.0;
        this.couvert = 0.0;
        this.total = 0.0;
    }

    
    public void calcularTotal() {
        consumo = (cliente.cervejas * 5) + (cliente.refrigerantes * 3) + (cliente.espetinhos * 7);
        couvert = (consumo > 30) ? 0 : 4.00;
        total = ingresso + consumo + couvert;
    }

  
    public void exibirRelatorio() {
    	System.out.println("°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("°°°°°°RELATÓRIO °°°°°°");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°");
        System.out.printf("Consumo = R$ %.2f%n", consumo);
        if (couvert == 0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", couvert);
        }
        System.out.printf("Ingresso = R$ %.2f%n", ingresso);
        System.out.printf("Valor a pagar = R$ %.2f%n", total);
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°");
    }
}
