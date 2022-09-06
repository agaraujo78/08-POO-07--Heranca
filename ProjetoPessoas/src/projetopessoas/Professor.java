package projetopessoas;

public class Professor extends Pessoa {
	//Atributos
			private char especialidade;
			private float salario;
			
			//Metodos
			public void receberAumento(float aum) {
				this.salario += aum;
				System.out.println("Matricula será cancelada");
			}
			
				//Metodos Especiais

				public char getEspecialidade() {
					return especialidade;
				}

				public void setEspecialidade(char especialidade) {
					this.especialidade = especialidade;
				}

				public float getSalario() {
					return salario;
				}

				public void setSalario(float salario) {
					this.salario = salario;
				}

}
