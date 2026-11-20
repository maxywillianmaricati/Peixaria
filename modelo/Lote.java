package modelo;
import java.time.LocalDate;

public class Lote {
    private int id;
    private Peixe peixe;
    private double pesoKg;
    private LocalDate dataChegada;
    private static int contador;

public void retirar(double peso) {
    if (peso <= 0 || peso > pesoKg) {
        System.out.println("Peso inválido!");
        return;
    }

    pesoKg -= peso;
}

public double getPesoKg(){
    return this.pesoKg;
}

public Peixe(){
    return this.peixe;
}

}