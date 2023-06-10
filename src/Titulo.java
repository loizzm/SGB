public class Titulo{
    private String Descricao;
    private String Nome;
    private int Tempo_de_emprestimo;
    private int ID_livro;
    private int Tempo_emprestado;
    private boolean emprestado;

    public Titulo(String d, String n, int te, int idl){
        this.Descricao=d;
        this.Nome=n;
        this.Tempo_de_emprestimo=te;
        this.ID_livro=idl;
        this.emprestado =false;
    }
    public String getDescricao(){
        return this.Descricao;
    }
    public boolean getEmprestado(){
        return this.emprestado;
    }
    public String getNome(){
        return this.Nome;
    }
    public void setDescricao(String Nome){
        this.Descricao=Nome;
     }
     public void setEmprestado(){
        if (this.emprestado==false){
            this.emprestado=true;
        }
        else{
            this.emprestado=false;
        }
     }
    public void setNome(String Nome){
        this.Nome=Nome;
     }
    public int getTempoEmprestimo(){
        return this.Tempo_de_emprestimo;
    }
    public void setTempoEmprestimo(int Tempo){
        this.Tempo_de_emprestimo=Tempo;
    }
    public int getIDlivro(){
        return this.ID_livro;
    }
    public void setIDlivro(int id){
        this.ID_livro=id;
    }
    
    public int getTempoemprestado(){
        return this.Tempo_emprestado;
    }
    public void setTempoEmprestado(int tempo){
        this.Tempo_emprestado=tempo;
    }
    
    

}