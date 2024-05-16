////////////////////////////////////////////////////////////////////
// GIACOMO DE LUCCHI 2086020
// NICCOLO CARLESSO 1224446
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class BiggerThan1000Exception extends Exception {
    public BiggerThan1000Exception(){
        super("I numeri più grandi di 1000 non sono accettati!");
    }
}