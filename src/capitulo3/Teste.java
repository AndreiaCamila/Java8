package capitulo3;


public class Teste {

	public void testandoInterfaceFuncional() {
		Validator<String> validadorCEP = valor -> valor
				.matches("[0-9]{5}-[0-9]{3}");
		System.out.println(validadorCEP.valida("13183-190"));
	}

	public static void main(String[] args) {
		Teste teste = new Teste();
		teste.testandoInterfaceFuncional();
	}

}
