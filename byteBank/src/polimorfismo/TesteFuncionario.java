package polimorfismo;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario lot = new Funcionario();
		lot.setNome("Matheus Lot Rizzo");
		lot.setCpf("222.222.222-22");
		lot.setSalario(2600.00);
		
		System.out.println(lot.getNome());
		System.out.println(lot.getBonicacao());
		System.out.println("---------//----------");
		
		
	}

}
