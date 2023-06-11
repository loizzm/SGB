package src;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
     private Map<String, Integer> exemplares = new HashMap<>();
     private List<Usuario> usuarios = new ArrayList<>();
     private List<Titulo> titulos = new ArrayList<>();
     private List<Multa> multas = new ArrayList<>();
     private static Biblioteca single_instance = null;

    public Map<String, Integer> getExemplares(){
        return this.exemplares;
    }
    public int getExemplar(String key){
        return this.exemplares.get(key);
    }
    public Aluno cadastrarAluno(String curso, int periodo, int id, String nome, String cpf, String endereco){
        Aluno aluno = new Aluno(curso,periodo,id, nome, cpf, endereco);
        this.usuarios.add(aluno);
        return aluno;
    }
    public Professor cadastrarProfessor(int id, String nome, String cpf, String endereco){
        Professor professor = new Professor(id, nome, cpf, endereco);
        this.usuarios.add(professor);
        return professor;
    }
    public void adicionarMap(String nome, int qtd){
        if(this.exemplares.containsKey(nome) == true){
            this.exemplares.put(nome,this.exemplares.get(nome)+qtd);
        }
        else{
            this.exemplares.put(nome, qtd);
        }
    }
    public Titulo cadastrarTitulo(String d, String n, int te, int idl,int qtd){
        Titulo titulo = new Titulo(d, n, te, idl);
        this.titulos.add(titulo);
        this.adicionarMap(n, qtd);
        return titulo;
    }
    
    public void gerarMulta(Usuario user,Titulo titulo, double valor){
        Multa multa = new Multa(titulo,user,valor);
        this.multas.add(multa);
    }

    public void verificarTempo(){
        for (Usuario item : this.usuarios) {
           if (item.verficarTempo() == true){
                this.gerarMulta(item,item.getTituloEmprestado(),15.30);
           }
        }   
    }
    public List<Multa> getListMultas(){
        return this.multas;
    }
    public List<Usuario> getListUsuarios(){
        return this.usuarios;
    }
    public static synchronized Biblioteca getInstance()
    {
        if (single_instance == null)
            single_instance = new Biblioteca();

        return single_instance;
    }

    public void alterarEstoque(String nome, int qtd){
        this.exemplares.put(nome,this.exemplares.get(nome) + qtd);
    }
}