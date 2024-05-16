////////////////////////////////////////////////////////////////////
// GIACOMO DE LUCCHI 2086020
// NICCOLO CARLESSO 1224446
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Arrays;

public class RomanPrinter {
    
    public static String print(int num) 
    throws ZeroException, NegativeNumberException, 
    BiggerThan1000Exception, NotRomanLetterException {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber)
    throws NotRomanLetterException{
        String[] I ={
            "  _____  ",
            " |_   _| ",
            "   | |   ", 
            "   | |   ", 
            "  _| |_  ", 
            " |_____| "};
        
        String[] V ={
            " __      __ ", 
            " \\ \\    / / ",
            "  \\ \\  / /  ", 
            "   \\ \\/ /   ", 
            "    \\  /    ", 
            "     \\/     "};

        String result="";

        for (int j=0; j<6;j++){
            for (char c : romanNumber.toCharArray()) {
                if(c =='I') {result+= I[j];}
                if(c =='V') {result+= V[j];}
                
                if (!(Arrays.asList('I', 'V').contains(c))){
                    throw new NotRomanLetterException(c);
                }
            }    
            result+="\n";
        }
        return result;
    } 
}
