////////////////////////////////////////////////////////////////////
// GIACOMO DE LUCCHI 2086020
// NICCOLO CARLESSO 1224446
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class ZeroException extends Exception {
    public ZeroException(){
        super("Lo 0 non esiste nei numeri romani!");
    }
}