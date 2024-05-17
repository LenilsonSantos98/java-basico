/* --- Trabalhando os 'metodos' */
/*--------------------------------- */
/* 
 * Vamos criar um exemplo de uma classe para representar uma SmartTV onde:

Ela tenha as características: ligada (boolean), canal (int) e volume (int);

Nossa TV poderá ligar e desligar e assim mudar o estado ligada;

Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;

Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
 * 
*/

public class SmartTv {
   //Determinando os status iniciais da TV.
    boolean ligada=false;
    int canal=1;
    int volume = 25;

    // criando os métodos que manipulam os estados:

    public void ligar(){
        ligada = true;    
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        //volume = volume + 1
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        //volume = volume - 1 
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    // incrementando ou decrementando o canal
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    //determinando um canal
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        //agora eu passei um parametro novoCanal, para o usuario determinar o canal.
    }


}
