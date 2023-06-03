class Titulo{
    String Descricao;
    String Nome;
    int Tempo_de_emprestimo;
    int ID_livro;
    int ID_usuario;
    int tipo_titulo;
    int Tempo_emprestado;

    String get_Descricao(){
        return this.Descricao;
    }
    String get_Nome(){
        return this.Nome;
    }
     void set_Descricao(String Nome){
        this.Descricao=Nome;
     }
     void set_Nome(String Nome){
        this.Nome=Nome;
     }
     int get_Tempo_Emprestimo(){
        return this.Tempo_de_emprestimo;
    }
    void set_Tempo_Emprestimo(int Tempo){
        this.Tempo_de_emprestimo=Tempo;
    }
    int get_ID_livro(){
        return this.ID_livro;
    }
    void set_ID_livro(int id){
        this.ID_livro=id;
    }
    int get_ID_Usuario(){
        return this.ID_usuario;
    }
    void set_ID_Usuario(int id_usuario){
        this.ID_usuario=id_usuario;
    }
    int get_Tipo_titulo(){
        return this.tipo_titulo;
    }
    void set_Tipo_titulo(int tipo){
        this.tipo_titulo=tipo;
    }
    int get_Tempo_emprestado(){
        return this.Tempo_emprestado;
    }
    void set_Tempo_emprestado(int tempo){
        this.Tempo_emprestado=tempo;
    }
    
    

}