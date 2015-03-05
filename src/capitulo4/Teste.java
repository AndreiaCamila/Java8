package capitulo4;

import java.util.List;

import Utils.LoadUsers;
import Utils.Usuario;

public class Teste {

	List<Usuario> usuarios = LoadUsers.loadListUsers();

	public void callDefaultMethod() {
		ImplementsDefaultMethod impl = new ImplementsDefaultMethod();
		impl.defaultMethodTest(usuarios.get(0));
	}

	public static void main(String[] args) {
		Teste teste = new Teste();
		teste.callDefaultMethod();
	}

}
