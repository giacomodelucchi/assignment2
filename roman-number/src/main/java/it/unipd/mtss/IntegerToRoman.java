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
        String[] decine = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] centinaia ={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] migliaia = {"","M"};
        return migliaia[(number/1000) %2]  + centinaia[(number/100) %10] 
        + decine[(number/10) %10] + unita[number % 10];
    }
}
