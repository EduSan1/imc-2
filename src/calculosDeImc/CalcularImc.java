package calculosDeImc;

public class CalcularImc {

	public double peso;
	public double altura;
	public double imc;

	public void calculoImc() {

		imc = peso/(altura*altura);
		System.out.println("Seu IMC é:" + imc);

		status();
	}

	public void status() {

		if (imc < 18.5) {

			System.out.println("abaixo do peso");

		} else if (imc >= 18.5 && imc < 25) {

			System.out.println("normal");

		} else if (imc >= 25 && imc < 30) {

			System.out.println("sobrepeso");

		} else if (imc >= 30 && imc < 35) {

			System.out.println("Obesidadegrau I");

		} else if (imc >= 35 && imc < 40) {

			System.out.println("Obesidadegrau II");

		} else if (imc >= 40) {

			System.out.println("Obesidadegrau III");

		}

	}

}
