public class Titulo{
    private String Descricao;
    private String Nome;
    private int Tempo_de_emprestimo;
    private int ID_livro;
    private int ID_usuario;
    private int tipo_titulo;
    private int Tempo_emprestado;

    public Titulo(String d, String n, int te, int idl, int idu, int tt, int tee){
        this.Descricao=d;
        this.Nome=n;
        this.Tempo_de_emprestimo=te;
        this.ID_livro=idl;
        this.ID_usuario=idu;
        this.tipo_titulo=tt;
        this.Tempo_emprestado=tee;
    }
    public String get_Descricao(){
        return this.Descricao;
    }
    public String get_Nome(){
        return this.Nome;
    }
    public void set_Descricao(String Nome){
        this.Descricao=Nome;
     }
    public void set_Nome(String Nome){
        this.Nome=Nome;
     }
    public int get_Tempo_Emprestimo(){
        return this.Tempo_de_emprestimo;
    }
    public void set_Tempo_Emprestimo(int Tempo){
        this.Tempo_de_emprestimo=Tempo;
    }
    public int get_ID_livro(){
        return this.ID_livro;
    }
    public void set_ID_livro(int id){
        this.ID_livro=id;
    }
    public int get_ID_Usuario(){
        return this.ID_usuario;
    }
    public void set_ID_Usuario(int id_usuario){
        this.ID_usuario=id_usuario;
    }
    public int get_Tipo_titulo(){
        return this.tipo_titulo;
    }
    public void set_Tipo_titulo(int tipo){
        this.tipo_titulo=tipo;
    }
    public int get_Tempo_emprestado(){
        return this.Tempo_emprestado;
    }
    public void set_Tempo_emprestado(int tempo){
        this.Tempo_emprestado=tempo;
    }
    
    

}