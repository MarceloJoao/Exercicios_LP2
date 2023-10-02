package br.ufrn.imd;

public class Gerente extends Funcionario{

    public enum Nivel {
        JUNIOR(1000.0), PLENO(2000.0), SENIOR(3000.0);
     
        private double bonus;
     
        private Nivel(double bonus){
          this.bonus = bonus;
        
       }
           
    }
    Nivel nivel;
    public Gerente(int chMensal, double hh, Nivel nivel){
      super(chMensal, hh);
      this.nivel = nivel;
    }
   
    @Override
    public double calcularSalario(){
     
      return (chMensal * hh) + nivel.bonus;
    }
    
}