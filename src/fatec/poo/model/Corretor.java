package fatec.poo.model;

import org.jetbrains.annotations.NotNull;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Corretor extends Pessoa{
    private double taxaLocacao;
    private double totalLocacao;
    private Contrato[] contratos;
    private int numContratos;

    public Corretor(int codigo, String nome, double taxaLocacao) {
        super(codigo, nome);
        contratos = new Contrato[10];
        numContratos = 0;
        this.taxaLocacao = taxaLocacao;
    }

    public double getTaxaLocacao() {
        return taxaLocacao;
    }

    public double getTotalLocacao() {
        return totalLocacao;
    }


    public void addContrato(Contrato contrato){
        contratos[numContratos] = contrato;
        contrato.setCorretor(this);
        totalLocacao += contrato.getValor() * taxaLocacao/100;
        numContratos++;
    }

    public void listarContratos(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Taxa de Locação: " + df.format(this.getTaxaLocacao()) + "%\n");

        System.out.println("Número Contrato\tValor");
        for (int i = 0; i < numContratos; i++) {
            System.out.println(contratos[i].getNumero() + "\t" + df.format(contratos[i].getValor()));
        }

        System.out.println("\nValor Comissão: " + df.format(this.getTotalLocacao()));

    }
}
