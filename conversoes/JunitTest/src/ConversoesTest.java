import junit.framework.*;
import java.math.BigDecimal;

public class ConversoesTest extends TestCase{
    Conversoes conv = new Conversoes();
    
    public void testFahrToCels() {
    	assertEquals(new BigDecimal(100), conv.fahrToCels(new BigDecimal(212)));
    	assertEquals(new BigDecimal(-40), conv.fahrToCels(new BigDecimal(-40)));
    }
    
    public void testCelTfFahrs() {
    	assertEquals(new BigDecimal(212), conv.celsToFahr(new BigDecimal(100)));		
    	assertEquals(new BigDecimal(-40), conv.fahrToCels(new BigDecimal(-40)));
    }
    }
