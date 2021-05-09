package polimorfismo;

public class TesteFuncionario {

	public static void main(String[] args) {
//		Funcionario lot = new Funcionario();
//		lot.setNome("Matheus Lot Rizzo");
//		lot.setCpf("222.222.222-22");
//		lot.setSalario(2600.00);
//		
//		System.out.println(lot.getNome());
//		System.out.println(lot.getBonicacao());
//		System.out.println("---------//----------");
		
//		Gerente g1 = new Gerente();
//		g1.setNome("Lot");
//		g1.setCpf("111.111-11");
//		g1.setSalario(3500);
//		
//		System.out.println(g1.getNome());
//		System.out.println(g1.getCpf());
//		System.out.println(g1.getSalario());
//		
//		g1.setSenha("Lot123");
//		
//		boolean autenticou = g1.autentica("Lot123");
//		System.out.println(autenticou);
//		System.out.println(g1.getBonicacao());
		
		Gerente g1 = new Gerente();
		g1.setSalario(4000);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		
        ControleBonificacao controle = new ControleBonificacao();
        
        controle.registra(g1);
		System.out.println(controle.getSoma());
		
		controle.registra(f);
		System.out.println(controle.getSoma());
		
		controle.registra(ev);
		System.out.println(controle.getSoma());
				
	}

}
