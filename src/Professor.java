import biblioteca.Usuario;
import java.util.ArrayList;


class Professor extends Usuario{
  private ArrayList<Integer> livros_associados;
  
  public Professor(ArrayList<int> livros_associados, int id, String nome, String cpf, String endereco, ArrayList<Integer> id_livros_emprestados){
      super(id, nome, cpf, endereco, id_livros_emprestados);
      this.livros_associados = livros_associados;
  }
  
  public ArrayList<int> get_Livros_associados(){
      return this.livros_associados;
  }
  
  public void set_Livros_associados(ArrayList<Integer> livros_associados){
      this.livros_associados = livros_associados;
  }
  
  public void associa_livro(int id_livro){
      this.livros_associados.add(id_livro);
  }
  
  public void desassocia_livro(int id_livro){
      this.livros_associados.remove(id_livro);
  }
  
  public void solicita_disponibilidade_titulo(int id_livro, int tempo_estimado){
      // Implementar
  }
}
