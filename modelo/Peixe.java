public class Peixe {
    private int id;
    private String nome;
    private double precoKg;
    private static int contador;


    public Peixe(String nome, double precoKg){
        this.nome = nome;
        this.precoKg = precoKg;
    }
    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPrecoKg(){
        return this.precoKg;
    }
}