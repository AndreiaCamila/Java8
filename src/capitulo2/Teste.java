package capitulo2;

import java.util.List;

import Utils.LoadUsers;
import Utils.Usuario;

public class Teste {

	List<Usuario> usuarios = LoadUsers.loadListUsers();

	public void oldFor() {
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());
		}
	}

	public void newForUsingConsumer() {
		usuarios.forEach(new Mostrador());
	}

	public void newForUsingLambda() {
		usuarios.forEach(u -> System.out.println(u.getNome()));
		usuarios.forEach(u -> u.tornaModerador());
	}

	public static void main(String[] args) {
		Teste teste = new Teste();
		teste.oldFor();
		teste.newForUsingConsumer();
		teste.newForUsingLambda();
	}

}
