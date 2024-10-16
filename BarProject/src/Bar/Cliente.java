package Bar;

import java.util.Scanner;

public class Cliente {
    char sexo;
    int cervejas;
    int refrigerantes;
    int espetinhos;
    
   
    public Cliente(char sexo, int cervejas, int refrigerantes, int espetinhos) {
        this.sexo = sexo;
        this.cervejas = cervejas;
        this.refrigerantes = refrigerantes;
        this.espetinhos = espetinhos;
    }
    
   
    public static Cliente leDadosCliente(Scanner sc) {
        System.out.print("Sexo (F/M): ");
        char sexo = sc.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        int cervejas = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        int refrigerantes = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        int espetinhos = sc.nextInt();
        
        return new Cliente(sexo, cervejas, refrigerantes, espetinhos);
    }
}
