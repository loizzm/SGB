import biblioteca.Usuario;
import java.util.ArrayList;


public class Aluno extends Usuario{
  private String nome_curso;
  private String periodo_curso;
  
  public Aluno(String nome_curso, String periodo_curso, int id, String nome, String cpf, String endereco, ArrayList<int> id_livros_emprestados){
      super(id, nome, cpf, endereco, id_livros_emprestados);
      this.nome_curso = nome_curso;
      this.periodo_curso = periodo_curso;
  }
      
  // Getters.
  public String get_Nome_curso(){
      return this.nome_curso;
  }
  
  public int get_Periodo_curso(){
      return this.periodo_curso;
  }
  
  // Setters.
  public void set_Nome_curso(String nome_curso){
      this.nome_curso = nome_curso;
  }
  
  public void set_Periodo_curso(int periodo_curso){
      this.periodo_curso = periodo_curso;
  }
}
