package equilibrando_saldo;

import java.util.Scanner;

public class Saldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner recebeValor = new Scanner(System.in);
		
		System.out.println("Qual valor deseja depositar?");
		double valorDeposito = recebeValor.nextDouble();
		System.out.println("O seu saldo atual é: " + valorDeposito);
		
		System.out.println("");
		
		System.out.println("Se quiser sacar algum valor informe a quantia");
		double valorRetirada = recebeValor.nextDouble();
		
		double saldoAtual = valorDeposito - valorRetirada; 
		System.out.println("Você sacou da sua conta: " +  valorRetirada);
		System.out.println("O seu saldo atual é: " + saldoAtual);
	}

}
