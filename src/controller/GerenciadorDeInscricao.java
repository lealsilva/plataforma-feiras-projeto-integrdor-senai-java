package controller;

import java.util.ArrayList;
import model.Feirante;
import model.Inscricao;

/**
 *
 * @author wilky
 */
public class GerenciadorDeInscricao {
    
   private ArrayList<Inscricao> inscricoes = new ArrayList<>();
   
   public void adicionarInscricao(Inscricao inscricao){
       inscricoes.add(inscricao);
   }
   
   public int quantidadeDeInscricao(){
       return inscricoes.size();   
   }
   
   public void listarInscricoes(){
       
       for (int indice = 0; indice < inscricoes.size(); indice++) {
           Inscricao inscricao = inscricoes.get(indice);
           System.out.println(inscricao.getFeira().getBairro());
           System.out.println(inscricao.getStatusAprovacao());
           System.out.println(inscricao.getFeirante().getNomeDaBanca());
       }
   }
   
   public void aprovarInscricao(Inscricao inscricao, GerenciadorDaFeira gerenciadorDaFeira){
       
       if("PENDENTE".equals(inscricao.getStatusAprovacao())){
            boolean bancaDisponivel = gerenciadorDaFeira.adicionarFeirante(inscricao.getFeirante());
            if(bancaDisponivel){
                inscricao.setStatusAprovacao("APROVADA");
            }
            else{
                System.out.println("Não espço disponivel");
            }
       }
       else{
           System.out.println("A inscrição não está pendente");
       }
   }  
}
