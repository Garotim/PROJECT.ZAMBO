package br.com.impostoderenda;

public class RelatorioImposto {
    
    
    public static void gerarRelatorio(Pessoa pessoa, double impostoDevido) {
        System.out.println("### RELATÓRIO DE IMPOSTO DE RENDA ###");

      
        Imposto imposto = new Imposto();
        double impostoSalario = imposto.calcularImpostoSalario(pessoa.getRendaSalario());
        double impostoServico = pessoa.getRendaServico() * 0.15;
        double impostoGanhoCapital = pessoa.getGanhoCapital() * 0.20;

        System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f%n", impostoServico);
        System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGanhoCapital);

        
        double impostoBruto = impostoSalario + impostoServico + impostoGanhoCapital;

        
        
        double maximoDedutivel = impostoBruto * 0.30;
        double gastosDedutiveis = Math.min(pessoa.getGastosMedicos() + pessoa.getGastosEducacionais(), maximoDedutivel);

        System.out.println("* DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
        System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);

        
        System.out.println("* RESUMO:");
        System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
        System.out.printf("Abatimento: %.2f%n", gastosDedutiveis);
        System.out.printf("Imposto devido: %.2f%n", impostoDevido);
    }
}
