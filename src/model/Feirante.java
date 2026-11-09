
package model;


public class Feirante {
    
    private int id;
    private String nomeDoResponsavel;
    private String nomeDaBanca;
    private String categoriaDaBanca;
    private String numeroDaLicenca;
    private String statusAprovacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoResponsavel() {
        return nomeDoResponsavel;
    }

    public void setNomeDoResponsavel(String nomeDoResponsavel) {
        this.nomeDoResponsavel = nomeDoResponsavel;
    }

    public String getNomeDaBanca() {
        return nomeDaBanca;
    }

    public void setNomeDaBanca(String nomeDaBanca) {
        this.nomeDaBanca = nomeDaBanca;
    }

    public String getCategoriaDaBanca() {
        return categoriaDaBanca;
    }

    public void setCategoriaDaBanca(String categoriaDaBanca) {
        this.categoriaDaBanca = categoriaDaBanca;
    }

    public String getNumeroDaLicenca() {
        return numeroDaLicenca;
    }

    public void setNumeroDaLicenca(String numeroDaLicenca) {
        this.numeroDaLicenca = numeroDaLicenca;
    }

    public String getStatusAprovacao() {
        return statusAprovacao;
    }

    public void setStatusAprovacao(String statusAprovacao) {
        this.statusAprovacao = statusAprovacao;
    }
    
    public Feirante (){
        
    }
    
    public Feirante(int id, String nomeDoResponsavel, String nomeDaBanca, String categoriaDaBanca, String numeroDaLicenca, String statusAprovacao) {
        this.id = id;
        this.nomeDoResponsavel = nomeDoResponsavel;
        this.nomeDaBanca = nomeDaBanca;
        this.categoriaDaBanca = categoriaDaBanca;
        this.numeroDaLicenca = numeroDaLicenca;
        this.statusAprovacao = statusAprovacao;
    }
    
}
