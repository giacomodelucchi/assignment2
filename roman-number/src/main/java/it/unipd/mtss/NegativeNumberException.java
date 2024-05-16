////////////////////////////////////////////////////////////////////
// GIACOMO DE LUCCHI 2086020
// NICCOLO CARLESSO 1224446
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(){
        super("Non esistono numeri romani negativi!");
    }
}