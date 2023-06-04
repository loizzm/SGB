public class Multa {
    private Titulo titulo;
    //private Usuario user;
    private double valor;

    public Multa(Titulo t, double v){
        this.titulo=t;
        this.valor=v;
    }
    public Titulo get_titulo(){
        return this.titulo;
    }
    public void set_titulo(Titulo t){
        this.titulo=t;
    }
    public double get_valor(){
        return this.valor;
    }
    public void set_valor(double v){
        this.valor=v;
    }

}
