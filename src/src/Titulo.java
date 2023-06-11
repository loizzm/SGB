package src;
public class Titulo{
    private String Descricao;
    private String Nome;
    private int TempoDeEmprestimo;
    private int idLivro;
    private int TempoEmprestado;
    private boolean emprestado;
    private boolean disponivel;

    public Titulo(String d, String n, int te, int idl){
        this.Descricao=d;
        this.Nome=n;
        this.TempoDeEmprestimo=te;
        this.idLivro=idl;
        this.emprestado = false;
        this.disponivel = false;
    }
    public String getDescricao(){
        return this.Descricao;
    }
    public boolean getEmprestado(){
        return this.emprestado;
    }
    public boolean getDisponivel(){
        return this.disponivel;
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
     public void setDisponivel(){
        if (this.disponivel==false){
            this.disponivel=true;
        }
        else{
            this.disponivel=false;
        }
     }
    public void setNome(String Nome){
        this.Nome=Nome;
     }
    public int getTempoEmprestimo(){
        return this.TempoDeEmprestimo;
    }
    public void setTempoEmprestimo(int Tempo){
        this.TempoDeEmprestimo=Tempo;
    }
    public int getIDlivro(){
        return this.idLivro;
    }
    public void setIDlivro(int id){
        this.idLivro=id;
    }
    
    public int getTempoemprestado(){
        return this.TempoEmprestado;
    }
    public void setTempoEmprestado(int tempo){
        this.TempoEmprestado=tempo;
    }
    
    

}