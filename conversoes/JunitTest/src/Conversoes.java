import java.math.BigDecimal;

public class Conversoes {
	public BigDecimal fahrToCels(BigDecimal fahr) {
        double fahrenheit = fahr.doubleValue();
        double celsius =(5.0/9.0) * (fahrenheit - 32);
	    return new BigDecimal(celsius);
        
	}
	
    public BigDecimal celsToFahr(BigDecimal cels) {
    	double celsius = cels.doubleValue();
        double fahrenheit = (9.0/5.0) * celsius + 32;
	     return new BigDecimal(fahrenheit);
	     
    }

}