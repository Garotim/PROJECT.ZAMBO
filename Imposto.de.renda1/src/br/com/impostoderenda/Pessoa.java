package br.com.impostoderenda;

import java.util.Scanner;

public class Pessoa {
    private double rendaSalario;
    private double rendaServico;
    private double ganhoCapital;
    private double gastosMedicos;
    private double gastosEducacionais;

    
    public void coletarDados(Scanner sc) {
        System.out.print("Renda anual com salário: ");
        this.rendaSalario = sc.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        this.rendaServico = sc.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        this.ganhoCapital = sc.nextDouble();

        System.out.print("Gastos médicos: ");
        this.gastosMedicos = sc.nextDouble();

        System.out.print("Gastos educacionais: ");
        this.gastosEducacionais = sc.nextDouble();
    }
    
    public double getRendaSalario() {
        return rendaSalario;
    }

    public double getRendaServico() {
        return rendaServico;
    }

    public double getGanhoCapital() {
        return ganhoCapital;
    }

    public double getGastosMedicos() {
        return gastosMedicos;
    }

    public double getGastosEducacionais() {
        return gastosEducacionais;
    }
}
