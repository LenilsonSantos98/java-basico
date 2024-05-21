## CaixaEletronico.java

Nesse código estamos trabalhando a condicional simples.

## ResultadoEscolar.java(composta)

Trabalhamos condicional composta.
Esse é o código usado nesse estudo:

public class ResultadoEscolar {
    public static void main(String[] argd) {
        int nota = 8;

        if(nota >=7){
            System.out.println("Aprovado");
        
        }else {
            System.out.println("Reprovado") ;   
        }
        
    }
}

## ResultadoEscolar.java(encadeada)

Reaproveitando o código, vamos trabalhar a condicional encadeada: 

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        if(nota >=7){
            System.out.println("Aprovado");
        }

        else if(nota >= 5 && nota <7 ){
            System.out.println(" Prova Recupeção");
        }
        
        
        else {
            System.out.println("Reprovado") ;   
        }
        
    }
}

Foi inserida a nova condicional 'else if' para dar uma terceira condição.

## ResultadoEscola.java(Ternária)

 - 1º Cenário:

 public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;
        
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);
    }
}
    Podemos refatorar o código, mantendo tudo em uma variável.

- 2º Cenário:

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 8;
        
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}

Nesse cenário usamos a condição ternária e replicamos a condição encadeada de uma maneira mais abreviada.

## SistemaMedida.java (switch case)

Ao verificar o códgio, percebemos que pra essa situação, o algoritimo não fica legal, uma estrutura condicional if else seria uma solução melhor.

## PlanoOperadora.java (switch case)

Nesse código veremos um melhor uso para o switch case:
Imagina que fomos requisitados a criar um sistema de plano telefônico onde:

O sistema terá 03 planos: BASIC, MIDIA , TURBO;

BASIC: 100 minutos de ligação;

MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;

TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.

public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; //M / T
		
		switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube");
                
            }

            case "M":{
                System.out.println("Whats e Instagram grátis");
                
            }

            case "B":{
                System.out.println("100 minutos de ligação");
            }
        
            
        }
			
            Nesse código foi definido cada case em ordem decresceente, e não foi utilizado o break, para que o plano superior inclua o beneficio do inferior.

## Estrururas de repetição:
## ExemploFor.java:

Entendendo a estrutura de repetição 'for' em seu escopo temos for(bloco de inicialização; expressão booleana de validação; bloco de atualização).

## ExemploJavaArrays.java

Entendedo o uso do for em Arrays, em um array o indice ddos elementos sempre se inicia em 0.
for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno no indice x= " + x + " é " + alunos [x]);
        }

outra forma de iterar entre os elementos de um array é :

    for (aluno : alunos){
        System.out.println(alunos);
    }

## Break Continue ExemploBreakContinue.java

No código: for ( int numero = 1; numero <= 5; numero ++) {
    if (numero == 3)
        break;
    System.out.println(numero);    
}
Foi adicionado o break na condicional if, logo ao iterar ele encerrará no valor  2.
 Se for feita a mudanaça do break para continue, no momento que o valor se igualar a 3, ele pulará para o proximo indice, imprimindo assim os valors 1,2,4,5.

## While (enquanto):
//estrutura do controle de fluxo while

while (expressão booleana de validação)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}

 ## ExemploWhile.java
  traabalhamos a estrutura de repetição while, importamos uma classe localthreadrandon para gerar valores aleatórios, e enquanto a condição era verdadeira, o jãozinho continuava a comprar doces.

## Do while - (Faça enquanto):
Testa a condição após executar o código.
//estrutura do controle de fluxo do while

do
{
    // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
while (expressão booleana de validação);

## ExemploDoWhile.java

Importei a classe rando para gerar um valor aleatório no qual determinei entre 1 e 3.
João vai fazer uma ligacção enquanto o valor correspondente ao ato de atender o telefone não for correspondente, imprimirá no terminal que ainda está discando.