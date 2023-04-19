package atividade01Poo;

public class Telefone {
    
    private int ddd;
    private int numeroTelefone;

    public Telefone(){}
    
    public Telefone(int ddd, int numeroTelefone) {
        this.ddd = ddd;
        this.numeroTelefone = numeroTelefone;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
    
}