package capitulo4;

import Utils.Usuario;

public interface DefaultMethod {

	int a = 100;

	default void defaultMethodTest(Usuario user) {
		System.out.println("Olha o que eu consigo fazer agora!! :D "
				+ user.getNome());
	}

}
