
public class Main {

	public static void main(String[] args) {
		// Criando os objetos
		Endereco end1 = new Endereco("Travessa não te interessa","12-A","Centro","Porto Alegre","RS","00000");
		Paciente pac1 = new Paciente("Julia","9999","98888",end1);
		Medico med1 = new Medico("000-RS","Geovane Mota","0000");
		Medico med2 = new Medico("111-RS","Maria Eduarda","1111");
		Internacao inter1 = new Internacao(pac1,med1);
		med1.setEndereco(end1);
		
		// Imprimir dados
//		System.out.printf("O senhor %s reside no endereço %s nº %s, no bairro %s - %s/%s\n",pac1.getNomeCompleto(),end1.getRua(),end1.getNumero(),end1.getBairro(),end1.getCidade(),end1.getEstado());
//		
//		System.out.print(inter1.dadosDoMedico());
		
		System.out.println(inter1.toString());
	}

}
