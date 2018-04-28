package Model;

public class Disciplina {
	private int iddisciplina;
	private int idprofessor;
	private String nome;
	private String curso;
	private int cargahoraria;
	public Disciplina(int iddisciplina, int idprofessor, String nome, String curso, int cargahoraria) {
		super();
		this.iddisciplina = iddisciplina;
		this.idprofessor = idprofessor;
		this.nome = nome;
		this.curso = curso;
		this.cargahoraria = cargahoraria;
	}
	public int getIddisciplina() {
		return iddisciplina;
	}
	public void setIddisciplina(int iddisciplina) {
		this.iddisciplina = iddisciplina;
	}
	public int getIdprofessor() {
		return idprofessor;
	}
	public void setIdprofessor(int idprofessor) {
		this.idprofessor = idprofessor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}
	
	
	
	
}
