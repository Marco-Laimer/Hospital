
import java.util.ArrayList;

public class lista_medico {
	private ArrayList<Medico> medico = new ArrayList<Medico>();

	public void cadastrar(Medico medico) {
		if (medico != null) {
			medico.add(medico);
		}
	}

	public void remover(Medico medico) {
		medico.removeIf((elemento) -> elemento.getCpf().equals(cliente.getCpf()));
	}

	public Medico buscar(Medico medico) {
		for (Medico elemento : this.medico) {
			if (elemento.getCpf().equals(medico.getCpf())) {
				return elemento;
			}
		}
		return null;
	}

	public void editar(Medico medico) {
		int indice = medico.indexOf(this.buscar(medico));
		if (indice != -1) {
			medico.set(indice, medico);
		}
	}

	public String listar() {
		StringBuilder builder = new StringBuilder();
		for (Medico medico : this.medico) {
			builder.append(medico.toString());
		}
		return builder.toString();
	}

}
