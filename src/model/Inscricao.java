package model;

/**
 *
 * @author wilky
 */
public class Inscricao {
    
    private int id;
    private Feira feira;
    private Feirante feirante;
    private String statusAprovacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Feira getFeira() {
        return feira;
    }

    public void setFeira(Feira feira) {
        this.feira = feira;
    }

    public Feirante getFeirante() {
        return feirante;
    }

    public void setFeirante(Feirante feirante) {
        this.feirante = feirante;
    }

    public String getStatusAprovacao() {
        return statusAprovacao;
    }

    public void setStatusAprovacao(String statusAprovacao) {
        this.statusAprovacao = statusAprovacao;
    }
    
    public Inscricao(){
        
    }

    public Inscricao(int id, Feira feira, Feirante feirante, String statusAprovacao) {
        this.id = id;
        this.feira = feira;
        this.feirante = feirante;
        this.statusAprovacao = statusAprovacao;
    }
    
}
