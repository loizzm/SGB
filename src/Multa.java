public class Multa {
    private Titulo titulo;
    private Usuario usuario;
    private double valor;

    public Multa(Titulo t, Usuario user,double v){
        this.titulo=t;
        this.usuario=user;
        this.valor=v;
    }
    public Titulo getTitulo(){
        return this.titulo;
    }
    public void setTitulo(Titulo t){
        this.titulo=t;
    }
    public Usuario getUsuario(){
        return this.usuario;
    }
    public void setUsuario(Usuario user){
        this.usuario=user;
    }
    public double getValor(){
        return this.valor;
    }
    public void setValor(double v){
        this.valor=v;
    }

}