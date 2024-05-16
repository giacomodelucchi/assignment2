////////////////////////////////////////////////////////////////////
// GIACOMO DE LUCCHI 2086020
// NICCOLO CARLESSO 1224446
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;


public class NotRomanLetterException extends Exception{
    public NotRomanLetterException(char c){
        super("La lettera "+ c + "non è romana");
    }
}  