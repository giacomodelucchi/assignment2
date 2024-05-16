////////////////////////////////////////////////////////////////////
// GIACOMO DE LUCCHI 2086020
// NICCOLO CARLESSO 1224446
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.BeforeClass;

public class IntegerToRomanTest {
  
    static IntegerToRoman converter;

    @BeforeClass
    public static void startConverter() {
        converter = new IntegerToRoman();
    }
    @Test
    public void Convert3() 
    throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
        int num=3;
        String roman="III";
        assertEquals(IntegerToRoman.convert(num), roman);
    }
    //Testing exception
    @Test(expected = ZeroException.class)
    public void convertZero() 
    throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
        int zero=0;

        IntegerToRoman.convert(zero);
    }

    @Test(expected = NegativeNumberException.class)
    public void convertNegative() 
    throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
        int negative=-1;

        IntegerToRoman.convert(negative);
    }

    @Test(expected = BiggerThan1000Exception.class)
    public void convertBiggerThan1000() 
    throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
        int bigger=1001;

        IntegerToRoman.convert(bigger);
    }

}
