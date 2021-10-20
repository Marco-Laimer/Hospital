
import java.util.ArrayList;

public class lista_Internacao {
	private ArrayList<Internacao> intenacao = new ArrayList<Internacao>();

	public void cadastrar(Internacao intenacao){
		if (intenacao != null) {
			intenacao.add(intenacao);
		}
	}

	public void remover(Intenacao intenacao) {
		Intenacao.removeIf((elemento) -> elemento.getCpf().equals(intenacao.getCpf()));
	}

	public Paciente buscar(Intenacao intenacao) {
		for (Paciente elemento : this.paciente) {
			if (elemento.getCpf().equals(cliente.getCpf())) {
				return elemento;
			}
		}
		return null;
	}

	public void editar(Intenacao intenacao) {
		int indice = intenacao.indexOf(this.buscar(intenacao));
		if (indice != -1) {
			intenacao.set(indice, intenacao);
		}
	}

	public String listar() {
		StringBuilder builder = new StringBuilder();
		for (Intenacao cliente : this.intenacao) {
			builder.append(cliente.toString());
		}
		return builder.toString();
	}
}