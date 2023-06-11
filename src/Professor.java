import java.util.List;
import java.util.ArrayList;

class Professor extends Usuario{
  private List<Titulo> livrosAssociados = new ArrayList<>();
  
  public Professor(int id, String nome, String cpf, String endereco){
      super(id, nome, cpf, endereco);
  }
  
  public List<Titulo> getLivrosAssociados(){
      return this.livrosAssociados;
  }
  
  public void setLivrosAssociados(List<Titulo> livros_associados){
      this.livrosAssociados = livros_associados;
  }
  
  public void associaLivro(Titulo livro){
      this.livrosAssociados.add(livro);
      livro.setDisponivel();
  }
  
  public void desassociaLivro(Titulo livro){
      this.livrosAssociados.remove(livro);
      livro.setDisponivel();
  }
}
