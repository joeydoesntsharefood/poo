package fatec.poo.model;

public class Proprietario extends Pessoa{
    private double valorAluguel;
    private Contrato contrato;

    public Proprietario(int codigo, String nome) {
        super(codigo, nome);
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setContrato(Contrato contrato) {
        this.valorAluguel = contrato.getValor() - contrato.getValor() * contrato.getCorretor().getTaxaLocacao()/100;
        this.contrato = contrato;
    }
}
