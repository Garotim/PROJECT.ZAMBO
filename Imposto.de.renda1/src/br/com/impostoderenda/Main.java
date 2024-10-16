package br.com.impostoderenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
        	System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        	System.out.println("°°°°°°°°° MENU IMPOSTO DE RENDA °°°°°°°°°");
            System.out.println("°°°°° 1 - Calcular Imposto de Renda °°°°°");
            System.out.println("°°°°°°°°°°°°°°° 2 - Sair °°°°°°°°°°°°°°°°");
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                	  
                    Pessoa pessoa = new Pessoa();
                    pessoa.coletarDados(sc);

                    
                    Imposto imposto = new Imposto();
                    double impostoDevido = imposto.calcularImposto(pessoa);

                    
                    RelatorioImposto.gerarRelatorio(pessoa, impostoDevido);

                 
                    System.out.print("Pressione Enter para continuar...");
                    sc.nextLine();  
                    sc.nextLine(); 
                    break;
                case 2:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 2);

        sc.close();
    }
}
