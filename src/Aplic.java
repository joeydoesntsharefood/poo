import fatec.poo.model.Contrato;
import fatec.poo.model.Corretor;
import fatec.poo.model.Proprietario;

import java.text.DecimalFormat;

public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        Corretor corretor = new Corretor(100, "Carlos Silva", 5);

        Proprietario proprietario1 = new Proprietario(111, "Amelia Souza");
        Proprietario proprietario2 = new Proprietario(222, "Antonio Vieira");
        Proprietario proprietario3 = new Proprietario(333, "Diogo Silva");

        Contrato contrato1 = new Contrato(1010);
        contrato1.setData("12/03/2021");
        contrato1.setValor(800);

        Contrato contrato2 = new Contrato(2020);
        contrato2.setData("15/03/2021");
        contrato2.setValor(1500);

        Contrato contrato3 = new Contrato(3030);
        contrato3.setData("20/03/2021");
        contrato3.setValor(600);

        corretor.addContrato(contrato1);
        corretor.addContrato(contrato2);
        corretor.addContrato(contrato3);

        proprietario1.setContrato(contrato1);
        proprietario2.setContrato(contrato2);
        proprietario3.setContrato(contrato3);


        corretor.listarContratos();

        System.out.println("\n\n");
        System.out.println("Código: " + proprietario1.getCodigo() + "\t\tNome: " + proprietario1.getNome() +
                "\t\tValor de aluguel: " + df.format(proprietario1.getValorAluguel()));
        System.out.println("Código: " + proprietario2.getCodigo() + "\t\tNome: " + proprietario2.getNome() +
                "\tValor de aluguel: " + df.format(proprietario2.getValorAluguel()));
        System.out.println("Código: " + proprietario3.getCodigo() + "\t\tNome: " + proprietario3.getNome() +
                "\t\tValor de aluguel: " + df.format(proprietario3.getValorAluguel()));

    }
}
