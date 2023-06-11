package src;
public class Aluno extends Usuario{
  private String nomeCurso;
  private int periodoCurso;
  
  public Aluno(String nome_curso, int periodo_curso, int id, String nome, String cpf, String endereco){
      super(id, nome, cpf, endereco);
      this.nomeCurso = nome_curso;
      this.periodoCurso = periodo_curso;
  }
      
  // Getters.
  public String getNomeCurso(){
      return this.nomeCurso;
  }
  
  public int getPeriodoCurso(){
      return this.periodoCurso;
  }
  
  // Setters.
  public void setNomeCurso(String nome_curso){
      this.nomeCurso = nome_curso;
  }
  
  public void setPeriodoCurso(int periodo_curso){
      this.periodoCurso = periodo_curso;
  }
}
