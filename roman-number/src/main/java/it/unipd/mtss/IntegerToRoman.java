////////////////////////////////////////////////////////////////////
// GIACOMO DE LUCCHI 2086020
// NICCOLO CARLESSO 1224446
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) 
    throws ZeroException, NegativeNumberException, BiggerThan1000Exception{
    
        if(number==0) {throw new ZeroException(); }
        if(number<0) {throw new NegativeNumberException();}
        if(number>1000) {throw new BiggerThan1000Exception();}
    
        String[] unita = {"", "I", "II", "III","IV","V","VI","VII","VIII","IX"};
        String[] decine = {"", "X", "XX"};
        return decine[(number/10) %3] + unita[number % 10];
    }
}
