package biblioteca;
import java.util.ArrayList;

public class Usuario {
  private int id;
  private String nome;
  private String cpf;
  private String endereco;
  private ArrayList<Integer> id_livros_emprestados;
  
  public Usuario(int id, String nome, String cpf, String endereco, ArrayList<Integer> id_livros_emprestados){
      this.id = id;
      this.nome = nome;
      this.cpf = cpf;
      this.endereco = endereco;
      this.id_livros_emprestados = id_livros_emprestados;
  }
  
  // Getters.
  public int get_Id(){
      return this.id;
  }
  
  public String get_Nome(){
      return this.nome;
  }
  
  public String get_Cpf(){
      return this.cpf;
  }
  
  public String get_Endereco(){
      return this.endereco;
  }
  
  public ArrayList<int> get_Id_livros_emprestados(){
      return this.id_livros_emprestados;
  }
  
  // Setters.
  public void set_Id(int id){
      this.id = id;
  }
  
  public void set_Nome(String nome){
      this.nome = nome;
  }
  
  public void set_Cpf(String cpf){
      this.cpf = cpf;
  }
  
  public void set_Endereco(String endereco){
      this.endereco = endereco
  }
  
  public void set_Id_livros_emprestados(ArrayList<Integer> id_livros_emprestados){
      this.id_livros_emprestados = id_livros_emprestados;
  }
  
  public void add_livro(int id_livro){
      id_livros_emprestados.add(id_livro);
  }
  
  public void devolve_livro(int id_livro){
      id_livros_emprestados.remove(id_livro);
  }
  
  public void requisita_livro(int id_livro){
      // implementar
  }
  
}
