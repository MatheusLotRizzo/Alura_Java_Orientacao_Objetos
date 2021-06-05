package JavaUtil.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import HerencaAndConstrutores.modelo.Cliente;
import HerencaAndConstrutores.modelo.Conta;
import HerencaAndConstrutores.modelo.ContaCorrente;
import HerencaAndConstrutores.modelo.ContaPoupanca;

public class ClassesAnonimasAndLambdas {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		System.out.println("Antes de Ordenar");
		System.out.println("");

		for (Conta conta : lista) {
			System.out.println(conta + " Titular: " + conta.getTitular().getNome());
		}

		// Classe Anonima, ordenando por n�mero
		lista.sort(new Comparator<Conta>() {
			@Override
			public int compare(Conta c1, Conta c2) {
				return Integer.compare(c1.getNumConta(), c2.getNumConta());
			}
		});

		// Outro exemplod e classe anonima, ordenando pelo numero
		Comparator<Conta> comp = new Comparator<Conta>() {
			@Override
			public int compare(Conta c1, Conta c2) {
				String nomec1 = c1.getTitular().getNome();
				String nomec2 = c2.getTitular().getNome();
				return nomec1.compareTo(nomec2);
			}
		};

		System.out.println("");
		System.out.println("Depois de Ordenar");
		System.out.println("");

		for (Conta conta : lista) {
			System.out.println(conta + " Titular: " + conta.getTitular().getNome());
		}
	}
}

class OrdenaTitular2 implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomec1 = c1.getTitular().getNome();
		String nomec2 = c2.getTitular().getNome();
		return nomec1.compareTo(nomec2);
	}
}
