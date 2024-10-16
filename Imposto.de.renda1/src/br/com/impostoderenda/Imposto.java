package br.com.impostoderenda;

public class Imposto {
    
    public double calcularImposto(Pessoa pessoa) {
        double impostoSalario = calcularImpostoSalario(pessoa.getRendaSalario());
        double impostoServico = pessoa.getRendaServico() * 0.15;
        double impostoGanhoCapital = pessoa.getGanhoCapital() * 0.20;

       
        double impostoBruto = impostoSalario + impostoServico + impostoGanhoCapital;

      
        double maximoDedutivel = impostoBruto * 0.30;
        double gastosDedutiveis = Math.min(pessoa.getGastosMedicos() + pessoa.getGastosEducacionais(), maximoDedutivel);

       
        return impostoBruto - gastosDedutiveis;
    }

    
    double calcularImpostoSalario(double rendaSalario) {
        double salarioMensal = rendaSalario / 12;
        
        if (salarioMensal < 3000) {
            return 0;  
        } else if (salarioMensal >= 3000 && salarioMensal < 5000) {
            return rendaSalario * 0.10; 
        } else {
            return rendaSalario * 0.20; 
        }
    }
}
