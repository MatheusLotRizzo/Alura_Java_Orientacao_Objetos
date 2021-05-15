package TratamentoExcecoes;

public class TesteConexao {

	public static void main(String[] args) {
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		}catch (IllegalStateException e) {
//			System.out.println("Erro na conexão");
//		}finally {
//			con.close();
//		}

		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch (IllegalStateException e) {
			e.printStackTrace();
			System.out.println("Erro na conexão");
		}
		
	}

}
