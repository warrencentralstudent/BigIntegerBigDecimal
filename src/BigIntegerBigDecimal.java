import java.math.BigInteger;
import java.math.BigDecimal;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        BigInteger one = new BigInteger("1029348712039847102398471023984710293847019238741029384710293847230947270349582734059823475098237450");
        BigInteger two = new BigInteger("239854702139847230498572034985720349857203948572034857203498572304985723049857203345");
        BigInteger gcd = one.gcd(two);
        System.out.println(gcd);
        BigDecimal three = new BigDecimal(324324.343242343243243437473473743742434);
        BigDecimal four = new BigDecimal(843646324324324.24324233213879237894617894);
        BigDecimal square = three.pow(2);
        BigDecimal square2 = four.pow(2);
        System.out.println(square);
        System.out.println(square2);
    }
}


