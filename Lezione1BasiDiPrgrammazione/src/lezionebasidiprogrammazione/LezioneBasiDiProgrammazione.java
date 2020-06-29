/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezionebasidiprogrammazione;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author feder
 */
public class LezioneBasiDiProgrammazione {
    /*
    In una funzione bisogna sempre dichiarare il tipo di ritorno (in questo caso int) e il tipo dei parametri.
    L'informazione che la funzione calola si chiama di ritorno, quando usiamo la parola return blocchiamo l'esecuzione della funzione e ritorniamo l'informazione. 
    ATTENZIONE Può essere ritornato un solo valore.
    Nel caso non si vogliano ottenere dei dati ma solo un'esecuzione di una parte di codice si dichiarer la funzione void.
    */
    public static int somma(int primo, int secondo){
        System.out.println("Sto facendo la somma...");
        return primo + secondo;
    }
    
    public static void stampa(int numero){
        System.out.println("Il tuo numero è " + numero);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Il codice viene scritto all'interno di blocchi delimitati da 2 {blocco}, il principale e più importante è il main
        Il main viene sempre eseguito per primo e rappresenta il cuore del programma, poiché l'esecuzione di tutto il programma dipende da esso
        */ 
        //I commenti: usati per commentare il codice e non dimenticarsi niente si possono fare in 2 modi.
        // Il primo usando appunto due " / "
        /*
        Il secondo usato in caso ci siano più righe da commentare. Si usa "/*"
        per aprire il commento e "* /" ovviamente attaccati come sotto
         */
         /*IMPORTANTE: alla fine di ogni riga di codice c'è bisogno di mettere un ;
        
        Quando devi contenere dei dati si usano le variabili, ogni volta che ne viene creata una bisogna dichiararne il "tipo" 
        e darle un nome senza usare spazi, per convenzione in caso ci siano più parole si mette la lettera iniziale di ognuna maiuscola.
        Non è obbligatorio però assegnarle subito un valore
        
        Dichiarazione di variabili*/
        //Le principali
        int intero; //gli interi sono i numeri positivi e negativi senza virgola
        long interoLungo = 999999999; //sono interi ma possono avere dei valori molto grossi
        float numeroDecimale; // è un numero decimale positivo o negativo
        double numeroConTantiDecimali; // è sempre un numero decimale ma può avere molti più decimali
        String stringa = "Questa variabile contiene del testo"; // contiene del testo, per scrivere del testo come valore di una variabile si mettono sempre le " sia all'inizio che alla fine
        
        //ASSEGNAMENTI E OPERAZIONI
        /*
        Gli assegnamenti servono ad assegnare un valore a una variabile. Il valore da assegnare può avere diverse origini, ma deve sempre essere dello stesso tipo della variabile a cui lo si assegna
        Quando viene dichiarata una variabile le si può assegnare anche un valore senza dover scrivere molte righe di codice.
        Quando si effettua un operazione o un assegnamento il codice viene sempre eseguito da destra verso sinistra.
        */
        intero = 10; //assegnamento
        int nuovo = 20; //dichiarazione e assegnamento
        intero = 15 + 5; //assegno alla variabile intero il valore della somma. VIENE SOVRASCRITTO IL VALORE PRESENTE IN PRECEDENZA
        intero = intero + nuovo; // eseguo una somma tra i valori delle 2 variabili
        intero += nuovo; //è la stessa cosa della riga precedente
        intero++; //serve a incrementare di 1 il valore della variabile
        intero--; //serve a decremetare di 1 il valore della variabile
        stringa += " + nuovo testo"; // in questo caso "concateno" le due stringe quindi vengono uniti i 2 testi
        
        /*
        Per poter conoscere il valore di una variabile possiamo utilizzare la funzione System.out.println(), all'interno di essa si possono anche eseguire operazioni
        ci sono 2 fuzioni per poter stampare i valori: la System.out.println, va a capo dopo aver stampato i valori; la System.out.print non va a capo dopo aver stampato
        */
        System.out.println(stringa);
        System.out.println("Questo messaggio verrà stampato nella console");
        System.out.println("Primo "+ intero + " Secondo " + nuovo + " Somma " + (intero + nuovo));
        
        //IF E ITERAZIONI(cicli)
        /*
        Gli if servono a determinare quale parte di codice verrà eseguita attraverso un semplice controllo se è vero oppure se è falso
        all'interno di un if posso eseguire operazioni e utilizzare le variabili, ma il risultato deve sempre essere vero o falso.
        È possibile mettere molti if in cascata utilizzando gli else e gli else if.w
        */
        //utilizzo == per controllare che 2 valori siano uguali
        if(intero == 80){
            System.out.println("Si, sono uguali");
        } else {
            System.out.println("No, non sono uguali");
        }
        
        // utilizzo invece il maggiore o minore per controllare se un valore è appunto maggiore o minore di un altro
        if(intero > nuovo){
            System.out.println("Il valore è maggiore");
        } else if(intero < nuovo){
            System.out.println("Il valore è maggiore");
        }
        
        //posso anche controllare più valori nello stesso if utilizzando && (and) e || (or)
        if(intero > 50 && intero < 100){
            System.out.println("È compreso");
        }
        if(intero == 40 || intero < 100){
            System.out.println("È vero");
        }
        
        //alcuni altri modi per scrivere un if
        //senza parentesi {}, si può utilizzare solo se si scrive una riga soltanto dentro all'if
        if(intero == 60)
            System.out.println("È uguale a 60");
        
        if(intero > 50) System.out.println("È maggiore di 50");
        
        /*
        I cicli servono a svolgere per un numero di volte sempre le stesse righe di codice, ci sono 3 modi di creare un ciclo in base alla necessità
        Esistono i while, i for e i do while. Anche per i cicli valgono le stesse regole sintattiche degli if
        */
        //while, richiede una variabile da incrementare e un controllo sul suo valore, il ciclo continuerà finché la condizione sarà vera
        //può essere soggetto ad errori e creare cicli infiniti non voluti
        int i = 0;
        while(i < 10){
            System.out.print("Giro: " + i + "   ");
            i++;
        }
        System.out.println("");
        
        //per creare facilmente un ciclo infinito è sufficiente mettere nella condizione del while true
        while(true){
            break; // si utilizza per uscire da un ciclo
        }
        
        //for, si utilizza quando si conosce il numero di giri da fare
        for(int j = 0; j < 10; j++){
            System.out.print("Giro: " + j + "   ");
        } 
        System.out.println("");
        
        //do while, si utilizza per fare dei controlli sui dati in input, ad esempio nei menù. Nel do while viene eseguito prima il codice all'interno e poi si effettuano i controlli
        Scanner input = new Scanner(System.in); //Lo scanner serve a ricevere un input da tastiera, può essere un solo dato oppure una riga intera
        int in;
        do{
            System.out.print("Digita 20 per proseguire... ");
            in = input.nextInt();// quando si utilizza lo scanner bisogna dichiarare il tipo di dato che si vuole leggere
        } while(in != 20);//finché in è diverso da 20 eseguirò il codice all'interno del do while
        
        //FUNZIONI
        /*
        Si possono creare le funzioni per rendere il codice più ordinato. Una funzione è una parte di codice esterna al main che permette di generalizzare il codice al suo interno,
        in questo modo possimo riutilizzare sempre lo stesso codice senza doverlo riscrivere ogni volta che ne abbiamo bisogno. Per convenzione le funzioni vengono scritte prima del main.
        */
        //Esempio: creiamo una funzione che fa una somma
        int primo = 15, secondo = 25;
        System.out.println(somma(primo, secondo));  // quando si vuole utilizzare una funzione si effettua una "chiamata", i dati che le vengono passati si chiamano parametri. Bisogna SEMPRE usare le parentesi dopo il nome della funzione
        stampa(primo); //non è necessario che i dati passati abbiano lo stesso nome dei parametri della funzione
        
        /*
        Programmi per fare pratica: trova il maggiore tra dei numeri dati in input dall'utente e stampalo in output, 
        trova il maggiore tra dei numeri dati in input dall'utente e stampalo in output,
        stampa se il numero dato in input è maggiore o minore di un numero dato in precedenza dall'utente,
        crea un programma con un piccolo menù in cui si può decidere che operazione fare tra somma, differenza, moltiplicazione e divisione e che stampi il risultato.(utilizza le funzioni)
        crea un programma che dato in input un numero di giri, un numero di x, un numero di y, un numero di z, stampi n volte n x, n y e n z.
        (esempio: input: 2, 3, 4, 1 output: xxxyyyyzxxxyyyyz)20
        */
        
    }

}
