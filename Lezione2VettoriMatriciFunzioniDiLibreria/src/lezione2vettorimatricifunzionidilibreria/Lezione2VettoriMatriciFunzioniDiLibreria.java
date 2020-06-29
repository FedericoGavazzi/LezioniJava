/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione2vettorimatricifunzionidilibreria;

/**
 *
 * @author feder
 */
public class Lezione2VettoriMatriciFunzioniDiLibreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        I vettori sono delle strutture dati che permettono di contenere più informazioni dello stesso tipo in un'unica variabile. Per accedere ai dati si utilizza un indice, è un numero intero e lo si mette tra parentesi []
        Un vettore può essere visto come una riga composta da tante scatole, in ogni scatola è presente un dato e ogni scatola è contrassegnata da un numero. La numerazione parte da 0 poi 1, 2, 3 etc...
        Le matrici sono simili ai vettori, possiamo vederle come delle tabelle, anche per le matrici valgono le stesse regole dei vettori.          
         */
        //Dichiarazione di un vettore e matrice
        int vettore[] = new int[10]; //ho creato un vettore con 10 elementi
        int matrice[][] = new int[10][10]; // ho creato una matrice con 100 elementi

        //Per interagire facilmente con gli elementi di matrici e vettori usiamo i cicli.
        for (int i = 0; i < 10; i++) { // eseguo 10 giri per riempire il vettore
            vettore[i] = i + 1;
        }

        for (int i = 0; i < 10; i++) {//eseguo 10 cicli per spostarmi sulle righe.
            for (int j = 0; j < 10; j++) {// eseguo 10 cicli per spostarmi sulle colonne.
                matrice[i][j] = i + j;//le prime [] rappresentano le righe, le seconde [] rappresentano le colonne. 
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(vettore[i]);
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(matrice[i][j]);
            }
        }

        /*
        Vogliamo riempire il vettore con numeri randomici. Possiamo utilizzare la funzione di libreria Math.random().
        Le funzioni di libreria sono delle funzioni utilizzabili presenti nel linguaggio. 
         */
        System.out.println("");
        for (int i = 0; i < vettore.length; i++) {
            vettore[i] = (int) (Math.random() * 20); //Lo riempio con numeri randomici interi tra 0 e 20.
            System.out.println(vettore[i]);
        }

        //Per conoscere la radice quadrata di un numero utilizziamo la funzione Math.sqrt().
        System.out.println(Math.sqrt(24));

        //Scambio del valore degli elementi di un vettore
        //Per poter scambiare i valori di due variabili ho bisogno di una variabile temporanea di supporto poiché se provassi a fare 2 assegnamenti soltanto perderei il valore di una delle 2
        for (int i = 0; i < vettore.length - 1; i+=2) {
            int temp = vettore[i];
            vettore[i] = vettore[i + 1];
            vettore[i + 1] = temp;
        }
        for (int i = 0; i< vettore.length; i++)
            System.out.println(vettore[i]);
        
        //rifare i programmi precedenti sul maggiore e minore usando i vettori
        //calcolare la somma delle diagonali di una matrice e stampare il risultato
    
    
    }
    
}
