import java.util.ArrayList;

public class lista_paciente {
	private ArrayList<Paciente> paciente = new ArrayList<Paciente>();
	  private String Paciente;

	public void cadastrar(Paciente paciente) {
		if (paciente != null) {
			paciente.add(paciente);
		}
	}

	public void remover(Paciente pacientee) {
		pacente.removeIf((elemento) -> elemento.getCpf().equals(paciente.getCpf()));
	}

	public void buscar(Paciente paciente) {
		for (Paciente elemento : this.paciente) {
			if (elemento.getCpf().equals(paciente.getCpf())) {
				return elemento;
			}
		}
		return null;
	}

	public void editar(Paciente paciente) {
		int indice = paciente.indexOf(this.buscar(paciente));
		if (indice != -1) {
			paciente.set(indice, paciente);
		}
	}

	public String listar() {
		StringBuilder builder = new StringBuilder();
		for (Paciente cliente : this.paciente) {
			builder.append(cliente.toString());
		}
		return builder.toString();
	}

}