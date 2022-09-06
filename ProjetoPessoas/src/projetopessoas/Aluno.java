package projetopessoas;

public class Aluno extends Pessoa {
	//Atributos
		private int mat;
		private String curso;
		private String especiais;
		
		//Metodos
		public void cancelarMatr() {
			System.out.println("Matricula será cancelada");
		}
		
			//Metodos Especiais
			public int getMat() {
				return mat;
			}

			public void setMat(int mat) {
				this.mat = mat;
			}

			public String getCurso() {
				return curso;
			}

			public void setCurso(String curso) {
				this.curso = curso;
			}

			public String getEspeciais() {
				return especiais;
			}

			public void setEspeciais(String especiais) {
				this.especiais = especiais;
			}
			
}
