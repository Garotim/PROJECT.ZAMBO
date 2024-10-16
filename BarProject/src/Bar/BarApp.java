package Bar;

import java.util.Scanner;

public class BarApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        Cliente cliente = Cliente.leDadosCliente(sc);
        
        
        Conta conta = new Conta(cliente);
        conta.calcularTotal();
        
        
        conta.exibirRelatorio();
        
        sc.close();
    }
}
