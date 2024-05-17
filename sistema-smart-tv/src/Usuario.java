/* Esse vai ser o metodo Main, que vai executar 
 * a aplicação.
 */

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv(); // esse é o metodo de criar uma classe de objetos

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);
    
    //apos a exibição do status da tv, vamos chamar os metodos:
        //chamando os metodos ligar e desligar:
        smartTv.ligar ();
        System.out.println("Novo Status TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status TV ligada ? " + smartTv.ligada);
        // chamando os metodos aumentar e diminuir volume:

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual : " + smartTv.volume);

        // usando o metodo para mudar de canal:

        smartTv.mudarCanal(12);
        System.out.println("Canal atual: " + smartTv.canal);



    }
}