
package model;

public class EscalaFeira {
    private int id;
    private Feirante feirante;
    private Feira feira;
    private String diaDaSemana;
    private String horarioDeEntrada;
    private String horarioDeSaida;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Feirante getFeirante() {
        return feirante;
    }

    public void setFeirante(Feirante feirante) {
        this.feirante = feirante;
    }

    public Feira getFeira() {
        return feira;
    }

    public void setFeira(Feira feira) {
        this.feira = feira;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public String getHorarioDeEntrada() {
        return horarioDeEntrada;
    }

    public void setHorarioDeEntrada(String horarioDeEntrada) {
        this.horarioDeEntrada = horarioDeEntrada;
    }

    public String getHorarioDeSaida() {
        return horarioDeSaida;
    }

    public void setHorarioDeSaida(String horarioDeSaida) {
        this.horarioDeSaida = horarioDeSaida;
    }
    
    public EscalaFeira(){
        
    }

    public EscalaFeira(int id, Feirante feirante, Feira feira, String diaDaSemana, String horarioDeEntrada, String horarioDeSaida) {
        this.id = id;
        this.feirante = feirante;
        this.feira = feira;
        this.diaDaSemana = diaDaSemana;
        this.horarioDeEntrada = horarioDeEntrada;
        this.horarioDeSaida = horarioDeSaida;
    }
    
}
