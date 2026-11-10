
package controller;

import model.Feira;
import model.Feirante;


public class GerenciadorDaFeira {
    
    private Feira feira;
    
    private Feirante [][] matrizBancas;
    
    public GerenciadorDaFeira(Feira feira, int linha, int coluna){
        this.feira = feira;
        this.matrizBancas = new Feirante[linha][coluna];
    }
    
    public void adicionrFeirante(Feirante feirante, int linha, int coluna){
        
        if(linha >= 0 && linha < matrizBancas.length && coluna >= 0 && coluna < matrizBancas[0].length){
            if(matrizBancas[linha][coluna] == null){
                matrizBancas[linha][coluna] = feirante;
            }else{
                System.out.println("Espaço ocupado");
            }
        }else{
            System.out.println("Espaço inexistente");
        }
    }
    
    public void mostrarBanca(){
        
        for (int linha = 0; linha < matrizBancas.length; linha++) {
            for (int coluna = 0; coluna < matrizBancas[linha].length; coluna++) {
                if(matrizBancas[linha][coluna] == null){
                    System.out.println("Posição [" + linha + "][" + coluna + "]: Banca vazia");
                }else{
                    System.out.println("posção [" + linha +"] ["+ coluna +"] "+matrizBancas[linha][coluna].getNomeDaBanca());
                }
            } 
        }
    }
    
    public void removerFeirante(int linha, int coluna){
        
        if(linha >= 0 && linha < matrizBancas.length && coluna >= 0 && coluna < matrizBancas[linha].length){
            if(matrizBancas[linha][coluna] != null){
                matrizBancas[linha][coluna] = null;
                System.out.println("Feirante removido");
            }
            else{
                System.out.println("Espaço ja esta vazio");
            }
        }else{
            System.out.println("Espaço inexistente");
        }
    }
}
        

    

