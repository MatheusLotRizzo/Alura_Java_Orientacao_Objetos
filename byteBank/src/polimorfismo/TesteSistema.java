package polimorfismo;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha("2020");
		
		Administrador adm = new Administrador();
		adm.setSenha("2021");
		
		Cliente cl = new Cliente();
		cl.setSenha("2020");
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cl);
	} 
}
