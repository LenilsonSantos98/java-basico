public class Operadores {
    public static void main(String[] args) throws Exception {
        // String concatenacao ="?"; 

        // concatenacao = 1+1+1+"1";
        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;
        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+"1";
        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;
        // System.out.println(concatenacao);

        // concatenacao = "1"+(1+1+1);
        // System.out.println(concatenacao);

        //classe Operadores.java
    
    
    //unários
    // int numero = 5;
            
    // //Imprimindo o numero negativo
    // System.out.println(- numero);
    // // se eu repetir a impressão com (numero) ele volta ao valor original
    // //para que ele realmete se torne negativo devo:

    //     // numero = - numero;
    //     // System.out.println(numero);

    // //incrementando numero em mais 1 numero, imprime 6
    // numero ++;
    // System.out.println(numero);

    // //incrementando numero em mais 1 numero, imprime 7
    // System.out.println(numero ++);// ops algo de errado não está certo

    // System.out.println(numero);// agora sim, numero virou 7

    // //ordem de precedencia conta aqui
    // System.out.println(++ numero);

    // boolean verdadeiro = true;

   
 // System.out.println("Inverteu " + !verdadeiro);

 // repetição

// int numero = 5;
//         //repetição
//     numero++;
//     //numero = numero +1;
//     System.out.println(numero);


 // ***Ternários:***

 // classe Operadores.java
int a, b;

a = 5;
b = 6;

//String resultado = "";

// EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
// if(a==b)
//    resultado = "verdadeiro";
// else
//    resultado = "falso";

//System.out.println(resultado);

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
String resultado = (a==b) ? "verdadeiro" : "false";

System.out.println(resultado);

//**Relacionais**

int numero1 = 1;
int numero2 = 2;
        //igualdade
boolean simNao = numero1 == numero2;

System.out.println("numeroUm é igual a numeroDois?" + simNao);
        //Diferença
simNao = numero1 != numero2;
System.out.println("numeroUm é diferente de numeroDois?" + simNao);
        // Maior que:

simNao = numero1 > numero2;
System.out.println("numeroUm é maior que numeroDois?" + simNao);

        //menor que:
simNao = numero1 < numero2;
System.out.println("numeroUm é menor que numeroDois?" + simNao);   
        // comparando textos ou objetos
 
//String nomeUm = "LENILSON";
//String nomeDois = "LENILSON";

//System.out.println(nomeUm == nomeDois); //retorna true
//-------------------------------------------------------------
        // mas e se houvesse uma new String?:
String nomeUm = "Lenilson";
String nomeDois = new String ("Lenilson");

//System.out.println(nomeUm == nomeDois); // retornaria false pois se trata de objetos
// para solucionar e receber um true uso o método equals:

System.out.println(nomeUm.equals(nomeDois));// vai retornar truwe
//O metodo equals compara conteudos, eu tenho dois objetos e ele vai comparar os conteudos.
//--------------------------------------------------------------------

//** Lógicos **

        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2){ 
                System.out.println("as duas condições são verdadeiras");
// também posso usar uma expressão relacional como: (condicao1 && (7 > 4)), terei o mesmo resultado.
        }


        if(condicao1 || condicao2){
                System.out.println("uma das condições é verdadeira");
        }

    }

}
