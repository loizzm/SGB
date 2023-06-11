package src;
public class Usuario {
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private Titulo tituloEmprestado;
  
    public Usuario(int id, String nome, String cpf, String endereco){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
  

    // Getters.
    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public Titulo getTituloEmprestado(){
        return this.tituloEmprestado;
    }

    // Setters.
    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

     
    public void setLivroEmprestado(Titulo livro_emprestado){
        this.tituloEmprestado = livro_emprestado;
    }


    public void requisitaLivro(Titulo titulo){
        if(titulo.getEmprestado() == false){
            titulo.setEmprestado();
            this.setLivroEmprestado(titulo);
        }
    }

    public void retornaLivro(){
        this.tituloEmprestado.setEmprestado();
        this.tituloEmprestado = null;
    }

    public boolean verficarTempo(){
        if(this.tituloEmprestado != null){
            if(this.tituloEmprestado.getTempoEmprestimo() < this.tituloEmprestado.getTempoemprestado()){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    
    }
    
}
  
