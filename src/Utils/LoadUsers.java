package Utils;

import java.util.Arrays;
import java.util.List;

public class LoadUsers {

	public static List<Usuario> loadListUsers() {
		List<Usuario> usuarios = Arrays.asList(new Usuario("Lisa", 20),
				new Usuario("Homer", 30), new Usuario("Bart", 25));
		return usuarios;
	}

}
