package Exercicio_4.br.ufrn.imd.imd;

public class GuitarPlayer extends Musician{
    public int howManyYears;
    public boolean playEletronicGuitar;
    public boolean playAcousticGuitar;

    public GuitarPlayer(String name, String hometown,boolean playClassicalMusic, boolean canImprovise, boolean canCompose, int howManyYears, boolean playEletronicGuitar, boolean playAcousticGuitar){
     super(name,hometown,playClassicalMusic, canCompose, canImprovise);
     this.howManyYears=howManyYears;
     this.playEletronicGuitar = playEletronicGuitar;
     this.playAcousticGuitar = playAcousticGuitar;
    }
    
    public void playGuitar(){
        System.out.println("Tocando a guitarra...");
    }
}
