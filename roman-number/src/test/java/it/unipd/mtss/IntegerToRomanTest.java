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
    @Test
    public void Convert6() 
    throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
        int num=6;
        String roman="VI";
        assertEquals(IntegerToRoman.convert(num), roman);
    }
    @Test
    public void Convert9() 
    throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
        int num=9;
        String roman="IX";
        assertEquals(IntegerToRoman.convert(num), roman);
    }
    @Test
    public void Convert10() 
    throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
        int num=10;
        String roman="X";
        assertEquals(IntegerToRoman.convert(num), roman);
    }
    @Test
    public void Convert16() 
    throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
        int num=16;
        String roman="XVI";
        assertEquals(IntegerToRoman.convert(num), roman);
    }
    @Test
    public void Convert20() 
    throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
        int num=20;
        String roman="XX";
        assertEquals(IntegerToRoman.convert(num), roman);
    }
    @Test
    public void Convert41() 
    throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
        int num=41;
        String roman="XLI";
        assertEquals(IntegerToRoman.convert(num), roman);
    }
    @Test
    public void Convert50() 
    throws ZeroException, BiggerThan1000Exception, NegativeNumberException{
        int num=50;
        String roman="L";
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
