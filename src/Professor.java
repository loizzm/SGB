import java.util.ArrayList;

class Professor extends Usuario{
  private ArrayList<Integer> livrosAssociados;
  
  public Professor(int id, String nome, String cpf, String endereco){
      super(id, nome, cpf, endereco);
  }
  
  public ArrayList<Integer> get_Livros_associados(){
      return this.livrosAssociados;
  }
  
  public void set_Livros_associados(ArrayList<Integer> livros_associados){
      this.livrosAssociados = livros_associados;
  }
  
  public void associa_livro(int id_livro){
      this.livrosAssociados.add(id_livro);
  }
  
  public void desassocia_livro(int id_livro){
      this.livrosAssociados.remove(id_livro);
  }
  
  public void solicita_disponibilidade_titulo(int id_livro, int tempo_estimado){
      // Implementar
  }
}
