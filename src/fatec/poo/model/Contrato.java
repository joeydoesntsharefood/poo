package fatec.poo.model;

public class Contrato {
    private int numero;
    private String data;
    private double valor;
    private Proprietario proprietario;
    private Corretor corretor;

    public int getNumero() {
        return numero;
    }

    public Contrato(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public Corretor getCorretor() {
        return corretor;
    }
}
