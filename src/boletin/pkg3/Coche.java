/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg3;

/**
 *
 * @author adm
 */
public class Coche {
   private int velocidade ;

    public Coche(){
    velocidade =0 ;
    
    }

    Coche(int velocidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public void setVelocidade(int velocidade){
     this.velocidade=velocidade;
     }
    public void getVelocidade(){
    }
    public int acelerar (int valor){
        velocidade=velocidade+valor;
        return velocidade;
    }
    public int frenar (int menos) {
        velocidade=velocidade-menos;
        return velocidade;
    }
    public String toString(){
        return ("Velocidade= "+velocidade);
    }
    
}
