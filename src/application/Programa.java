package application;

import classes.ContaPF;
import classes.ContaPJ;
import classes.ContaPoup;

public class Programa {

	public static void main(String[] args) {
		
		ContaPF contaPF = new ContaPF(1001, "Gleidson", 0.00);
		ContaPJ contaPj = new ContaPJ(1002, "Maria", 0.00, 500.00);
		
		//  UPCASTING
		//possivel a super classe receber um objeto da subclasse como atributo
		ContaPF contaPf01 = contaPj;
		ContaPF contaPf02 = new ContaPJ (1003, "Joana", 0.0, 2000.00);
		ContaPF contaPf03 = new ContaPoup (1004, "João", 0.0, 1000.00);
		
		
		//DOWNCASTING
		
		ContaPJ conta04 = (ContaPJ) contaPf02;
		conta04.emprestimo(1000.00);
		
		
		ContaPF x = new ContaPF(1035, "Davi", 1000.00);
		ContaPF y = new ContaPoup(1032, "Valentina", 1000.00, 0.02);
		
		x.sacar(50.00);
		y.sacar(50.00);
		
		
		System.out.println("Conta x = " + x);
		System.out.println("Conta y = " + y);
		
		ContaPF novaConta = new ContaPJ(1034, "Josefa", 500.00, 1200.00);
		novaConta.sacar(200.00);
		System.out.println("Saldo da nova conta: " + novaConta.getSaldo());

	}

}
